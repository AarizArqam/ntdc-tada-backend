package com.ntdc_TA_DA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="stay")
public class stay {
	@Id
	@Column(name="stayId")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="id_sequence")
	@SequenceGenerator(name="id_sequence",sequenceName ="ID_SEQ")
	long stayId; // primary key----Auto increment
	
	@Column(name="tourId")
	int tourId;
	
	@Column(name="description")
	String description;
	
	@Column(name="fromDate")
	String fDate;
	
	@Column(name="toDate")
	String tDate;
	
	@Column(name="days")
	int days;
	
	@Column(name="daily")
	int daily;
	
	@Column(name="total")
	int total;
	
	@Column(name="journeyId")
	int journeyId;

	
	
	public stay(int tourId, String description, String fDate, String tDate, int days, int daily, int total,
			int journeyId) {
		super();
		this.tourId = tourId;
		this.description = description;
		this.fDate = fDate;
		this.tDate = tDate;
		this.days = days;
		this.daily = daily;
		this.total = total;
		this.journeyId = journeyId;
	}
	public stay() {
		super();
	}
	public long getStayId() {
		return stayId;
	}

	public int getTourId() {
		return tourId;
	}

	public String getDescription() {
		return description;
	}

	public String getfDate() {
		return fDate;
	}

	public String gettDate() {
		return tDate;
	}

	public int getDays() {
		return days;
	}

	public int getDaily() {
		return daily;
	}

	public int getTotal() {
		return total;
	}

	public int getJourneyId() {
		return journeyId;
	}

	public void setStayId(long stayId) {
		this.stayId = stayId;
	}

	public void setTourId(int tourId) {
		this.tourId = tourId;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setfDate(String fDate) {
		this.fDate = fDate;
	}

	public void settDate(String tDate) {
		this.tDate = tDate;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public void setDaily(int daily) {
		this.daily = daily;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setJourneyId(int journeyId) {
		this.journeyId = journeyId;
	}
	
}