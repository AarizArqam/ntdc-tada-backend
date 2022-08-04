package com.ntdc_TA_DA.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ntdc_TA_DA.model.tour;
import com.ntdc_TA_DA.service.tourService;

@RestController
public class tourController {
	private tourService Service;
	
	public tourController(tourService service) {
		super();
		Service = service;
	}
	
	@GetMapping("/dev/v1/api/ta-da/getTour")
	public List<tour> getAllTours(){
		return Service.findAllTour();
	}
	
	
	@PostMapping("/dev/v1/api/ta-da/addTour")
	public void addTour(@RequestBody tour Tour) {
		Service.saveTour(Tour);
	}
	@DeleteMapping("/dev/v1/api/ta-da/deleteTour/{tourId}")
	public void deleteTourById(@PathVariable("tourId") long id) {
		Service.DeleteTourById(id);
	}
}
