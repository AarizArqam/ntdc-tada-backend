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


import com.ntdc_TA_DA.model.journey;


@RestController

public class journeyController {

	private com.ntdc_TA_DA.service.journeyService journeyService;

	public journeyController(com.ntdc_TA_DA.service.journeyService Service) {
		super();
		this.journeyService = Service;
	}
	@PostMapping("/dev/v1/api/ta-da/addJourney/{tourId}")
	public ResponseEntity<journey> savejourney(@PathVariable("tourId") int tourId,@RequestBody journey Journey)
	{
		Journey.setTourId(tourId);
		return new ResponseEntity<journey>(journeyService.saveJourney(Journey),HttpStatus.CREATED);
	}
	@GetMapping("/dev/v1/api/ta-da/getJourney/{tourId}")
	public List<journey> getJourney(@PathVariable("tourId") int id){
		return journeyService.findAllJourneyByTourId(id);
	}
	@DeleteMapping("/dev/v1/api/ta-da/deleteAllJourney/{tourId}")
	public void deleteAllJourneyOfTour(@PathVariable("tourId") int id){
		journeyService.deleteAllJourneyByTourId(id);
	}
	@DeleteMapping("/dev/v1/api/ta-da/deleteJourney/{journeyId}")
	public void deleteJourney(@PathVariable("journeyId") int id) {
		journeyService.DeleteJourneyByJourneyId(id);
	}
}
