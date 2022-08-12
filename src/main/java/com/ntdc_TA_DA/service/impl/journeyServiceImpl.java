package com.ntdc_TA_DA.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ntdc_TA_DA.model.journey;
import com.ntdc_TA_DA.repository.accomodationRepository;
import com.ntdc_TA_DA.repository.journeyRepository;
import com.ntdc_TA_DA.service.journeyService;

@Service
public class journeyServiceImpl implements journeyService{

private journeyRepository journeyRepo;
	
	public journeyServiceImpl(journeyRepository journey_Repo) {
		super();
		this.journeyRepo = journey_Repo;
	}
	@Override
	public journey saveJourney(journey Journey) {
		journeyRepo.save(Journey);
		return Journey;
	}

	@Override
	public List<journey> findAllJourneyByTourId(int id) {
		return journeyRepo.findJourneyBytourId(id);
	}

	@Override
	public void DeleteJourneyByJourneyId(int id) {
		journeyRepo.deleteById(id);
		
	}
	@Override
	public void deleteAllJourneyByTourId(int id) {
		journeyRepo.deleteAllBytourId(id);
	}

}
