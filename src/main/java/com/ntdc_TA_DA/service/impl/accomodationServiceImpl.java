package com.ntdc_TA_DA.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntdc_TA_DA.model.accomodation;
import com.ntdc_TA_DA.repository.accomodationRepository;
import com.ntdc_TA_DA.service.accomodationService;

@Service
public class accomodationServiceImpl implements accomodationService{

	private accomodationRepository accomodationRepo;
	
	public accomodationServiceImpl(accomodationRepository accomodationRepo) {
		super();
		this.accomodationRepo = accomodationRepo;
	}
	
	
	@Override
	public accomodation saveAccomodation(accomodation acc) {
		accomodationRepo.save(acc);
		return acc;
	}


	@Override
	public Optional<accomodation> findAllAccomodationById(long id) {
		// TODO Auto-generated method stub
		return accomodationRepo.findById(id);
	}


	@Override
	public List<accomodation> findAllAccomodations() {
		return accomodationRepo.findAll();
	}


	@Override
	public void DeleteAccomodationById(long id) {
		accomodationRepo.deleteById(id);
		
	}
	
	

}
