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
	@PostMapping("/dev/v1/api/ta-da/addTour")
	public void addTour(@RequestBody tour Tour) {
		Service.savetour(Tour);
	}
	@GetMapping("/dev/v1/api/ta-da/getTour/{hrisId}")
	public List<tour> getAllTours(@PathVariable int hrisId){
		return Service.findAlltourById(hrisId);
	}
	@DeleteMapping("/dev/v1/api/ta-da/deleteTour/{tourId}")
	public void DeleteTour(@PathVariable int id) {
		
		Service.DeleteTourBytourId(id);
	}
}
