package com.ntdc_TA_DA.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ntdc_TA_DA.model.taxi;
import com.ntdc_TA_DA.service.taxiService;

@RestController
public class taxiController {
	private taxiService Service;
	
	public taxiController(taxiService service) {
		super();
		Service = service;
	}
	
	@GetMapping("/dev/v1/api/ta-da/getTaxi")
	public List<taxi> getAllTaxi(){
		return Service.findAllTour();
	}
	
	
	@PostMapping("/dev/v1/api/ta-da/addTaxi")
	public void addTaxi(@RequestBody taxi Tour) {
		Service.saveTour(Tour);
	}
	@DeleteMapping("/dev/v1/api/ta-da/deleteTaxi/{tourId}")
	public void deleteTaxiById(@PathVariable("tourId") long id) {
		Service.DeleteTourById(id);
	}
}
