package com.ntdc_TA_DA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntdc_TA_DA.model.journey;

public interface journeyRepository extends JpaRepository<journey,Integer>{
	List<journey> findJourneyBytourId(int tourId);
	void deleteAllBytourId(int tourId);

}
