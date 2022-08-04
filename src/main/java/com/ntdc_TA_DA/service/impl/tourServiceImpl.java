package com.ntdc_TA_DA.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ntdc_TA_DA.model.accomodation;
import com.ntdc_TA_DA.model.tour;
import com.ntdc_TA_DA.repository.tourRepository;
import com.ntdc_TA_DA.service.tourService;


@Service
public class tourServiceImpl implements tourService {
	private tourRepository tourRepo;
	
	public tourServiceImpl(tourRepository tourRepo) {
		super();
		this.tourRepo = tourRepo;
	}

	@Override
	public void saveTour(tour t) {
		tourRepo.save(t);
		
	}

	@Override
	public Optional<tour> findAllTourById(long id) {
		return tourRepo.findById(id);
	}

	@Override
	public List<tour> findAllTour() {
		return tourRepo.findAll();
	}

	@Override
	public void DeleteTourById(long id) {
		tourRepo.deleteById(id);
		
	}

}
