package com.ntdc_TA_DA.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ntdc_TA_DA.model.accomodation;
import com.ntdc_TA_DA.model.taxi;
import com.ntdc_TA_DA.repository.taxiRepository;
import com.ntdc_TA_DA.service.taxiService;


@Service
public class taxiServiceImpl implements taxiService {
	private taxiRepository taxiRepo;
	
	public taxiServiceImpl(taxiRepository taxiRepo) {
		super();
		this.taxiRepo = taxiRepo;
	}

	@Override
	public void saveTour(taxi t) {
		taxiRepo.save(t);
		
	}

	@Override
	public Optional<taxi> findAllTourById(long id) {
		return taxiRepo.findById(id);
	}

	@Override
	public List<taxi> findAllTour() {
		return taxiRepo.findAll();
	}

	@Override
	public void DeleteTourById(long id) {
		taxiRepo.deleteById(id);
		
	}

	@Override
	public List<taxi> findAllBytourId(int tourId) {
		return taxiRepo.findBytourId(tourId);
	}

}
