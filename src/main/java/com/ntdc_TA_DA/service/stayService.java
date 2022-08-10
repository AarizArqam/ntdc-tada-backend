package com.ntdc_TA_DA.service;

import java.util.List;
import java.util.Optional;
import com.ntdc_TA_DA.model.stay;

public interface stayService {
	void saveStay(stay Stay);
	Optional<stay> findAllStayById(long id);
	List<stay> findAllStay();
	void DeleteStayById(long id);
	List<stay> findStayBytourId(int tourId);
}
