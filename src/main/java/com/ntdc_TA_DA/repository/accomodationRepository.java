package com.ntdc_TA_DA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntdc_TA_DA.model.accomodation;

public interface accomodationRepository extends JpaRepository<accomodation,Long>{
	List<accomodation> findBytourId(int tourId);
	void deleteAllBytourId(long tourId);
}
