package com.ntdc_TA_DA.service;

import java.util.List;
import java.util.Optional;

import com.ntdc_TA_DA.model.accomodation;
import com.ntdc_TA_DA.model.taxi;

public interface taxiService {
	void saveTaxi(taxi t);
	Optional<taxi> findAllTaxiById(long id);
	List<taxi> findAllTaxi();
	void DeleteTaxiById(long id);
	List<taxi> findAllBytourId(int tourId);
}
