package com.ntdc_TA_DA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ntdc_TA_DA.model.tour;

public interface tourRepository extends JpaRepository<tour,Integer>{
	List<tour> findTourByhris_id(int hrisId);
}
