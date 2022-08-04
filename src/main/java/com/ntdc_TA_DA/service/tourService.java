package com.ntdc_TA_DA.service;

import java.util.List;
import java.util.Optional;

import com.ntdc_TA_DA.model.accomodation;
import com.ntdc_TA_DA.model.tour;

public interface tourService {
	void saveTour(tour t);
	Optional<tour> findAllTourById(long id);
	List<tour> findAllTour();
	void DeleteTourById(long id);
}
