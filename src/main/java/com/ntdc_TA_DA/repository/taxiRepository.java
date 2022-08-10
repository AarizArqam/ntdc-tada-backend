package com.ntdc_TA_DA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntdc_TA_DA.model.taxi;

public interface taxiRepository extends JpaRepository<taxi,Long>{
	List<taxi> findBytourId(int tourId);
}
