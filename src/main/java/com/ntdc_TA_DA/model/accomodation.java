package com.ntdc_TA_DA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Accomodation")

public class accomodation {
	@Id
	@Column(name="accomodationId")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="id_sequence")
	@SequenceGenerator(name="id_sequence",sequenceName ="ID_SEQ")
	long accomodationId; // primary key----Auto increment
	
	@Column(name="tourId")
	int tourId;
	
	@Column(name="journeyId")
	int journeyId;
	
	@Column(name="departureArrival")
	String departureArrival;
	
	@Column(name="fromDate")
	String fromDate;
	
	@Column(name="toDate")
	String toDate;
	
	@Column(name="days")
	int days;
	
	@Column(name="rate")
	long rate;
	
	@Column(name="daily")
	int daily;
	
	@Column(name="total")
	int total;
	
	@Column(name="description")
	String description;
	
	
	//Constructor
		{
			tourId = 0;
			journeyId = 0;
			description = "";
			rate = 0;
			daily = 0;
			total = 0;
			departureArrival = "";
		}
		public accomodation() {
			super();
		}
		public accomodation(int tid,int jid,String DA,String FD,String TD,int day,long Rate,int Daily,int tot,String Desc){
		    super();
		    this.tourId=tid;
		    this.journeyId=jid;
		    this.departureArrival=DA;
		    this.fromDate=FD;
		    this.toDate=TD;
		    this.days=day;
		    this.rate=Rate;
		    this.daily=Daily;
		    this.total=tot;
		    this.description=Desc;
		}

		public accomodation(long sid,int tid,int jid,String DA,String FD,String TD,int day,long Rate,int Daily,int tot,String Desc){
			super();
			this.stayId=sid;
			this.tourId=tid;
			this.journeyId=jid;
			this.departureArrival=DA;
			this.fromDate=FD;
			this.toDate=TD;
			this.days=day;
			this.rate=Rate;
			this.daily=Daily;
			this.total=tot;
			this.description=Desc;
		}

	public Long getStayId() {
		return stayId;
	}

	public void setStayId(long stayId) {
		this.stayId = stayId;
	}

	public int getTourId() {
		return tourId;
	}

	public void setTourId(int tourId) {
		this.tourId = tourId;
	}

	public int getJourneyId() {
		return journeyId;
	}

	public void setJourneyId(int journeyId) {
		this.journeyId = journeyId;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	
//Setter
	public void setId(long id) {
		this.stayId = id;
	}

	public void setDepartureArrival(String data) {
		this.departureArrival = data;
	}

	public void setFromDate(String data) {
		this.fromDate = data;
	}

	public void setToDate(String data) {
		this.toDate = data;
	}

	public void setRate(long data) {
		this.rate = data;
	}

	public void setDaily(int data) {
		this.daily = data;
	}

	public void setDescription(String desc) {
		this.description = desc;
	}

//Getter
	public String getDepartureArrival() {
		return this.departureArrival;
	}

	public Long getId() {
		return this.stayId;
	}

	public String getFromDate() {
		return this.fromDate;
	}

	public String getToDate() {
		return this.toDate;
	}

	public long getRate() {
		return this.rate;
	}

	public int getDaily() {
		return this.daily;
	}

	public String getDescription() {
		return this.description;
	}

}
