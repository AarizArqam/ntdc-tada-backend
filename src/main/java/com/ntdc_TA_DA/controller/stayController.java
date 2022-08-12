package com.ntdc_TA_DA.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ntdc_TA_DA.model.accomodation;
import com.ntdc_TA_DA.model.stay;
import com.ntdc_TA_DA.service.stayService;

@RestController
public class stayController {

	private stayService service;
	public stayController(stayService StayServices) {
		super();
		this.service=StayServices;
	}
	
	@PostMapping("/dev/v1/api/ta-da/addStay/{tourId}")
	public ResponseEntity<stay> saveStay(@PathVariable int tourId,@RequestBody stay Stay)
	{
		Stay.setTourId(tourId);
		return new ResponseEntity<stay>(service.saveStay(Stay),HttpStatus.CREATED);
	}
	
	@GetMapping("/dev/v1/api/ta-da/getStay/{tourId}")
	public List<stay> getStay(@PathVariable("tourId") int id) {
		return service.findStayBytourId(id);
	}
	
	@DeleteMapping("/dev/v1/api/ta-da/deleteStay/{tourId}")
	public void deleteStay(@PathVariable("tourId") int id) {
		service.DeleteStayBytourId(id);
	}
	
}
