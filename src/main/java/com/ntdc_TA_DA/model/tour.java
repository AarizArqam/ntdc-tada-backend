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
public class tour {
	@Id
	@Column(name="tourid")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="id_sequence")
	@SequenceGenerator(name="id_sequence",sequenceName ="ID_SEQ")
	int tourid;
	
	@Column(name="approvedflag")
	int approvedflag;
	
	@Column(name="hrisId")
	int hrisId;
	
	@Column(name="empName")
	String empName;
	
	@Column(name="tourSubject")
	String tourSubject;
	
	@Column(name="tourRequest")
	String tourRequest;
	
	@Column(name="dateFrom")
	String dateFrom;
	
	@Column(name="dateTo")
	String dateTo;
	
	@Column(name="tourStation")
	int tourStation;
	
	@Column(name="approvedHrisId")
	int approvedHrisId;
	
	@Column(name="approvedBy")
	String approvedBy;
	
	@Column(name="approvedDate")
	String approvedDate;
	
	@Column(name="tollAmount")
	int tollAmount;
	
	@Column(name="tourReason")
	String tourReason;
	
	@Column(name="comments")
	String comments;//` mediumtext,
	
	@Column(name="grandTotal")
	int grandTotal;//` int DEFAULT NULL,
	
	@Column(name="createdBy")
	int createdBy;//` int DEFAULT NULL,
	
	@Column(name="currentlyAssignedHris")
	int currentlyAssignedHris;//` int DEFAULT NULL,
	
	@Column(name="sender")
	int sender;//` int DEFAULT NULL,
	
	@Column(name="createdOn")
	String createdOn;//` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
	
	@Column(name="final1")
	int final1;//` tinyint DEFAULT '0',
	
	@Column(name="advanceAmount")
	int advanceAmount;//` int DEFAULT '0',
	
	@Column(name="advanceDesc")
	String advanceDesc;//` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT '',
	
	@Column(name="tourType")
	int tourType;//` int DEFAULT '1' COMMENT '1 for local, 2 for international',

	public tour() {
		super();
	}

	public int getTourid() {
		return tourid;
	}

	public tour(int hrisId, String empName, String tourSubject, String dateFrom, String dateTo, int tourStation,
			String comments, int tourType) {
		super();
		this.hrisId = hrisId;
		this.empName = empName;
		this.tourSubject = tourSubject;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.tourStation = tourStation;
		this.comments = comments;
		this.tourType = tourType;
	}

	public int getapprovedflag() {
		return approvedflag;
	}

	public int gethrisId() {
		return hrisId;
	}

	public String getempName() {
		return empName;
	}

	public String gettourSubject() {
		return tourSubject;
	}

	public String gettourRequest() {
		return tourRequest;
	}

	public String getdateFrom() {
		return dateFrom;
	}

	public String getdateTo() {
		return dateTo;
	}

	public int gettourStation() {
		return tourStation;
	}

	public int getapprovedHrisId() {
		return approvedHrisId;
	}

	public String getapprovedBy() {
		return approvedBy;
	}

	public String getapprovedDate() {
		return approvedDate;
	}

	public int gettollAmount() {
		return tollAmount;
	}

	public String gettourReason() {
		return tourReason;
	}

	public String getComments() {
		return comments;
	}

	public int getgrandTotal() {
		return grandTotal;
	}

	public int getcreatedBy() {
		return createdBy;
	}

	public int getcurrentlyAssignedHris() {
		return currentlyAssignedHris;
	}

	public int getSender() {
		return sender;
	}

	public String getcreatedOn() {
		return createdOn;
	}

	public int getfinal1() {
		return final1;
	}

	public int getadvanceAmount() {
		return advanceAmount;
	}

	public String getadvanceDesc() {
		return advanceDesc;
	}

	public int gettourType() {
		return tourType;
	}

	public void setTourid(int tourid) {
		this.tourid = tourid;
	}

	public void setapprovedflag(int approvedflag) {
		this.approvedflag = approvedflag;
	}

	public void sethrisId(int hrisId) {
		this.hrisId = hrisId;
	}

	public void setempName(String empName) {
		this.empName = empName;
	}

	public void settourSubject(String tourSubject) {
		this.tourSubject = tourSubject;
	}

	public void settourRequest(String tourRequest) {
		this.tourRequest = tourRequest;
	}

	public void setdateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public void setdateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	public void settourStation(int tourStation) {
		this.tourStation = tourStation;
	}

	public void setapprovedHrisId(int approvedHrisId) {
		this.approvedHrisId = approvedHrisId;
	}

	public void setapprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public void setapprovedDate(String approvedDate) {
		this.approvedDate = approvedDate;
	}

	public void settollAmount(int tollAmount) {
		this.tollAmount = tollAmount;
	}

	public void settourReason(String tourReason) {
		this.tourReason = tourReason;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public void setgrandTotal(int grandTotal) {
		this.grandTotal = grandTotal;
	}

	public void setcreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public void setcurrentlyAssignedHris(int currentlyAssignedHris) {
		this.currentlyAssignedHris = currentlyAssignedHris;
	}

	public void setSender(int sender) {
		this.sender = sender;
	}

	public void setcreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public void setfinal1(int final1) {
		this.final1 = final1;
	}

	public void setadvanceAmount(int advanceAmount) {
		this.advanceAmount = advanceAmount;
	}

	public void setadvanceDesc(String advanceDesc) {
		this.advanceDesc = advanceDesc;
	}

	public void settourType(int tourType) {
		this.tourType = tourType;
	}

}
