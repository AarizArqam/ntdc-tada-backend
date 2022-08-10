package com.ntdc_TA_DA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntdc_TA_DA.model.stay;

public interface stayRepository extends JpaRepository<stay,Long>{
	List<stay> findBytourId(int tourId);
}
