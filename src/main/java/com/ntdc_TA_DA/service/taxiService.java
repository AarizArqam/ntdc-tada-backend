package com.ntdc_TA_DA.service;

import java.util.List;
import java.util.Optional;

import com.ntdc_TA_DA.model.accomodation;
import com.ntdc_TA_DA.model.taxi;

public interface taxiService {
	void saveTour(taxi t);
	Optional<taxi> findAllTourById(long id);
	List<taxi> findAllTour();
	void DeleteTourById(long id);
	List<taxi> findAllBytourId(int tourId);
}
