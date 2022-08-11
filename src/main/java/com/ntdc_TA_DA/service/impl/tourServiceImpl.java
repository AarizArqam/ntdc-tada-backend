package com.ntdc_TA_DA.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ntdc_TA_DA.model.tour;
import com.ntdc_TA_DA.repository.tourRepository;
import com.ntdc_TA_DA.service.tourService;

@Service
public class tourServiceImpl implements tourService {
	
	private tourRepository tourRepo;
	
	public tourServiceImpl(tourRepository TourRepo) {
		super();
		this.tourRepo = TourRepo;
	}

	@Override
	public void savetour(tour Tour) {
		tourRepo.save(Tour);
	}

	@Override
	public List<tour> findAlltourById(int hrisId) {
		return tourRepo.findTourByhrisId(hrisId);
	}

	@Override
	public void DeleteTourBytourId(int tourId) {
		tourRepo.deleteById(tourId);
		
	}

}
