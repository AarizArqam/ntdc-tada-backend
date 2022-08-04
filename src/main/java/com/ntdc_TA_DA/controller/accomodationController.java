package com.ntdc_TA_DA.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ntdc_TA_DA.model.accomodation;
import com.ntdc_TA_DA.service.accomodationService;

@RestController
//@RequestMapping("/dev/v1/api/ta-da/addAccomodation")
public class accomodationController {
	
	private accomodationService accomodationService;

	public accomodationController(com.ntdc_TA_DA.service.accomodationService accomodationService) {
		super();
		this.accomodationService = accomodationService;
	}
	@PostMapping("/dev/v1/api/ta-da/addAccomodation")
	public ResponseEntity<accomodation> saveAccomodation(@RequestBody accomodation acc){
		return new ResponseEntity<accomodation>(accomodationService.saveAccomodation(acc),HttpStatus.CREATED);
	}
	@GetMapping("/dev/v1/api/ta-da/getAccomodation")
	public List<accomodation> getAllAccomodation(){
		return accomodationService.findAllAccomodations();
	}
	@GetMapping("/dev/v1/api/ta-da/getAccomodation/{journeyId}")
	public Optional<accomodation> getAllAccomodation(@PathVariable("journeyId") int id){
		return accomodationService.findAllAccomodationById(id);
	}
	@DeleteMapping("/dev/v1/api/ta-da/deleteAccomodation/{journeyId}")
	public void deleteAccomodationById(@PathVariable("journeyId") long id) {
		accomodationService.DeleteAccomodationById(id);
	}
}