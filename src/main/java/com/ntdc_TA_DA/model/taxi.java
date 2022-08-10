package com.ntdc_TA_DA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Tour")
public class taxi {

	@Id
	@Column(name="taxiId")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="id_sequence")
	@SequenceGenerator(name="id_sequence",sequenceName ="ID_SEQ")
	long id;
	
	@Column(name="tourId")
	int tourId;
	
	@Column(name="description")
	String description;
	
	@Column(name="killometer")
	int killometer;
	
	@Column(name="rate")
	int rate;
	
	@Column(name="total")
	int total;
	
	@Column(name="departurFlag")
	int departureFlag;
	
	@Column(name="journeyId")
	int journeyId;

	public taxi() {
		super();
	}
	

	public taxi(String description, int killometer, int rate,int total) {
		super();
		this.tourId=0;
		this.description = description;
		this.killometer = killometer;
		this.rate = rate;
		this.total=total;
	}
	
	
	public long getId() {
		return id;
	}
	public int getTourId() {
		return tourId;
	}
	public String getDescription() {
		return description;
	}
	public int getKillometer() {
		return killometer;
	}
	public int getRate() {
		return rate;
	}
	public int getTotal() {
		return total;
	}
	public int getDepartureFlag() {
		return departureFlag;
	}
	public int getJourneyId() {
		return journeyId;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setTourId(int tourId) {
		this.tourId = tourId;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setKillometer(int killometer) {
		this.killometer = killometer;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setDepartureFlag(int departureFlag) {
		this.departureFlag = departureFlag;
	}
	public void setJourneyId(int journeyId) {
		this.journeyId = journeyId;
	}
	
	
}
