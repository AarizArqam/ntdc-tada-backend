package com.ntdc_TA_DA.controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ntdc_TA_DA.model.accomodation;
import com.ntdc_TA_DA.service.accomodationService;

//@RequestMapping("/dev/v1/api/ta-da/addAccomodation")


@RestController
public class accomodationController {
	
	private accomodationService accomodationService;

	public accomodationController(com.ntdc_TA_DA.service.accomodationService accomodationService) {
		super();
		this.accomodationService = accomodationService;
	}
	@PostMapping("/dev/v1/api/ta-da/addAccomodation/{tourId}")
	public ResponseEntity<accomodation> saveAccomodation(@PathVariable int tourId,@RequestBody accomodation acc)
	{
		acc.setTourId(tourId);
		return new ResponseEntity<accomodation>(accomodationService.saveAccomodation(acc),HttpStatus.CREATED);
	}
	@GetMapping("/dev/v1/api/ta-da/getAccomodation/{tourId}")
	public List<accomodation> getAllAccomodation(@PathVariable("tourId") int tourId){
		return accomodationService.findAllAccomodationBytourId(tourId);
	}
	/*@DeleteMapping("/dev/v1/api/ta-da/deleteAccomodation/{accId}")
	public void deleteAccomodationById(@PathVariable("accId") long accId){
		accomodationService.DeleteAccomodationById(accId);
	}*/
	@DeleteMapping("/dev/v1/api/ta-da/deleteAccomodation/{tourId}")
	public void deleteAccomodationById(@PathVariable("tourId") long Id){
		accomodationService.DeleteAccomodationByTourId(Id);
	}
}