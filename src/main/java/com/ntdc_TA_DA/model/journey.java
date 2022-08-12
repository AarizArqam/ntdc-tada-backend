package com.ntdc_TA_DA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Journey")
public class journey {
	@Id
	@Column(name="journeyId")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="id_sequence")
	@SequenceGenerator(name="id_sequence",sequenceName ="ID_SEQ")
	int journeyId;//` int NOT NULL AUTO_INCREMENT,
	
	@Column(name="tourId")
	int tourId;//` int DEFAULT NULL,
	
	@Column(name="departureCity")
	int departureCity;//` int DEFAULT NULL,
	
	@Column(name="departureDateTime")
	int departureDateTime;//` datetime DEFAULT NULL,
	
	@Column(name="arrivalCity")
	int arrivalCity;//` int DEFAULT NULL,
	
	@Column(name="arrivalDateTime")
	String arrivalDateTime;//` datetime DEFAULT NULL,
	
	@Column(name="journeyKind")
	int journeyKind;//` int DEFAULT NULL,
	
	@Column(name="journeyAmount")
	int journeyAmount;//` int DEFAULT NULL,
	
	@Column(name="journeyDays")
	int journeyDays;//` int DEFAULT NULL,
	
	@Column(name="journeyDaily")
	int journeyDaily;//` int DEFAULT NULL,
	
	@Column(name="journeyTotal")
	int journeyTotal;//` int DEFAULT NULL,
	
	@Column(name="departFlag")
	int departFlag;//` int DEFAULT '1',
	
	@Column(name="vehNum")
	String vehNum;//` varchar(15) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
	
	@Column(name="departureInternational")
	String departureInternational;//` text CHARACTER SET latin1 COLLATE latin1_swedish_ci,
	
	@Column(name="arrivalInternational")
	String arrivalInternational;//` text CHARACTER SET latin1 COLLATE latin1_swedish_ci,
	
	@Column(name="description")
	String description;//` text,
	
	@Column(name="longitude")
	String longitude;//` text CHARACTER SET latin1 COLLATE latin1_swedish_ci,
	
	@Column(name="latitude")
	String latitude;//` text CHARACTER SET latin1 COLLATE latin1_swedish_ci

	public journey() {
		super();
	}
	
	public journey(int tourId, int departureCity, int departureDateTime, int arrivalCity, String arrivalDateTime,
			int journeyKind, int journeyAmount, int journeyDaily, int journeyTotal, String vehNum, String description) {
		super();
		this.tourId = tourId;
		this.departureCity = departureCity;
		this.departureDateTime = departureDateTime;
		this.arrivalCity = arrivalCity;
		this.arrivalDateTime = arrivalDateTime;
		this.journeyKind = journeyKind;
		this.journeyAmount = journeyAmount;
		this.journeyDaily = journeyDaily;
		this.journeyTotal = journeyTotal;
		this.vehNum = vehNum;
		this.description = description;
	}

	public int getJourneyId() {
		return journeyId;
	}

	public int getTourId() {
		return tourId;
	}

	public int getDepartureCity() {
		return departureCity;
	}

	public int getDepartureDateTime() {
		return departureDateTime;
	}

	public int getArrivalCity() {
		return arrivalCity;
	}

	public String getArrivalDateTime() {
		return arrivalDateTime;
	}

	public int getJourneyKind() {
		return journeyKind;
	}

	public int getJourneyAmount() {
		return journeyAmount;
	}

	public int getJourneyDays() {
		return journeyDays;
	}

	public int getJourneyDaily() {
		return journeyDaily;
	}

	public int getJourneyTotal() {
		return journeyTotal;
	}

	public int getDepartFlag() {
		return departFlag;
	}

	public String getVehNum() {
		return vehNum;
	}

	public String getDepartureInternational() {
		return departureInternational;
	}

	public String getArrivalInternational() {
		return arrivalInternational;
	}

	public String getDescription() {
		return description;
	}

	public String getLongitude() {
		return longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setJourneyId(int journeyId) {
		this.journeyId = journeyId;
	}

	public void setTourId(int tourId) {
		this.tourId = tourId;
	}

	public void setDepartureCity(int departureCity) {
		this.departureCity = departureCity;
	}

	public void setDepartureDateTime(int departureDateTime) {
		this.departureDateTime = departureDateTime;
	}

	public void setArrivalCity(int arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public void setArrivalDateTime(String arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public void setJourneyKind(int journeyKind) {
		this.journeyKind = journeyKind;
	}

	public void setJourneyAmount(int journeyAmount) {
		this.journeyAmount = journeyAmount;
	}

	public void setJourneyDays(int journeyDays) {
		this.journeyDays = journeyDays;
	}

	public void setJourneyDaily(int journeyDaily) {
		this.journeyDaily = journeyDaily;
	}

	public void setJourneyTotal(int journeyTotal) {
		this.journeyTotal = journeyTotal;
	}

	public void setDepartFlag(int departFlag) {
		this.departFlag = departFlag;
	}

	public void setVehNum(String vehNum) {
		this.vehNum = vehNum;
	}

	public void setDepartureInternational(String departureInternational) {
		this.departureInternational = departureInternational;
	}

	public void setArrivalInternational(String arrivalInternational) {
		this.arrivalInternational = arrivalInternational;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
}
