package com.ntdc_TA_DA.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.ntdc_TA_DA.model.stay;
import com.ntdc_TA_DA.repository.stayRepository;
import com.ntdc_TA_DA.repository.taxiRepository;
import com.ntdc_TA_DA.service.stayService;


@Service
public class stayServiceImpl implements stayService {

	private stayRepository stayRepo;
	public stayServiceImpl(stayRepository StayRepo) {
		super();
		this.stayRepo = StayRepo;
	}
	@Override
	public stay saveStay(stay Stay) {
		// TODO Auto-generated method stub
		stayRepo.save(Stay);
		return Stay;
	}

	@Override
	public Optional<stay> findAllStayById(long id) {
		return stayRepo.findById(id);
	}

	@Override
	public List<stay> findAllStay() {
		// TODO Auto-generated method stub
		return stayRepo.findAll();
	}

	@Override
	public void DeleteStayById(long id) {
		// TODO Auto-generated method stub
		stayRepo.deleteById(id);
	}

	@Override
	public List<stay> findStayBytourId(int tourId) {
		return stayRepo.findBytourId(tourId);
	}
	@Override
	public void DeleteStayBytourId(int tourId) {
		// TODO Auto-generated method stub
		stayRepo.deleteAllBytourId(tourId);
	}
}
