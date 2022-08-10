package com.ntdc_TA_DA.service;

import java.util.List;
import java.util.Optional;

import com.ntdc_TA_DA.model.accomodation;

public interface accomodationService {
	accomodation saveAccomodation(accomodation acc);
	Optional<accomodation> findAllAccomodationById(long id);
	List<accomodation> findAllAccomodations();
	void DeleteAccomodationById(long id);
	List<accomodation> findAllAccomodationBytourId(int tourId);
	void updateAccomodation(long accId,accomodation acc);
}
