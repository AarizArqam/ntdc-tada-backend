package com.ntdc_TA_DA.service;

import java.util.List;
import com.ntdc_TA_DA.model.journey;

public interface journeyService {
	journey saveJourney(journey Journey);
	List<journey> findAllJourneyByTourId(int id);
	void DeleteJourneyByJourneyId(int id);
	void deleteAllJourneyByTourId(int id);
}
