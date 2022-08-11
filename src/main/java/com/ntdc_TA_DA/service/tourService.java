package com.ntdc_TA_DA.service;

import java.util.List;
import com.ntdc_TA_DA.model.tour;

public interface tourService  {
	void savetour(tour Tour);
	List<tour> findAlltourById(int hrisId);
	void DeleteTourBytourId(int tourId);

}
