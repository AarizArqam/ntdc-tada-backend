package com.ntdc_TA_DA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tour")
public class tour {
	@Id
	@Column(name="tourid")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="id_sequence")
	@SequenceGenerator(name="id_sequence",sequenceName ="ID_SEQ")
	int tourid;
	
	@Column(name="approved_flag")
	int approved_flag;
	
	@Column(name="hris_id")
	int hris_id;
	
	@Column(name="emp_name")
	String emp_name;
	
	@Column(name="tour_subject")
	String tour_subject;
	
	@Column(name="tour_request")
	String tour_request;
	
	@Column(name="date_from")
	String date_from;
	
	@Column(name="date_to")
	String date_to;
	
	@Column(name="tour_station")
	int tour_station;
	
	@Column(name="approved_hris_id")
	int approved_hris_id;
	
	@Column(name="approved_by")
	String approved_by;
	
	@Column(name="approved_date")
	String approved_date;
	
	@Column(name="toll_amount")
	int toll_amount;
	
	@Column(name="tour_reason")
	String tour_reason;
	
	@Column(name="comments")
	String comments;//` mediumtext,
	
	@Column(name="grand_total")
	int grand_total;//` int DEFAULT NULL,
	
	@Column(name="created_by")
	int created_by;//` int DEFAULT NULL,
	
	@Column(name="currently_assigned_hris")
	int currently_assigned_hris;//` int DEFAULT NULL,
	
	@Column(name="sender")
	int sender;//` int DEFAULT NULL,
	
	@Column(name="created_on")
	String created_on;//` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
	
	@Column(name="_final")
	int _final;//` tinyint DEFAULT '0',
	
	@Column(name="advance_amount")
	int advance_amount;//` int DEFAULT '0',
	
	@Column(name="advance_desc")
	String advance_desc;//` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT '',
	
	@Column(name="tour_type")
	int tour_type;//` int DEFAULT '1' COMMENT '1 for local, 2 for international',

	public tour() {
		super();
	}

	public int getTourid() {
		return tourid;
	}

	public tour(int hris_id, String emp_name, String tour_subject, String date_from, String date_to, int tour_station,
			String comments, int tour_type) {
		super();
		this.hris_id = hris_id;
		this.emp_name = emp_name;
		this.tour_subject = tour_subject;
		this.date_from = date_from;
		this.date_to = date_to;
		this.tour_station = tour_station;
		this.comments = comments;
		this.tour_type = tour_type;
	}

	public int getApproved_flag() {
		return approved_flag;
	}

	public int getHris_id() {
		return hris_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public String getTour_subject() {
		return tour_subject;
	}

	public String getTour_request() {
		return tour_request;
	}

	public String getDate_from() {
		return date_from;
	}

	public String getDate_to() {
		return date_to;
	}

	public int getTour_station() {
		return tour_station;
	}

	public int getApproved_hris_id() {
		return approved_hris_id;
	}

	public String getApproved_by() {
		return approved_by;
	}

	public String getApproved_date() {
		return approved_date;
	}

	public int getToll_amount() {
		return toll_amount;
	}

	public String getTour_reason() {
		return tour_reason;
	}

	public String getComments() {
		return comments;
	}

	public int getGrand_total() {
		return grand_total;
	}

	public int getCreated_by() {
		return created_by;
	}

	public int getCurrently_assigned_hris() {
		return currently_assigned_hris;
	}

	public int getSender() {
		return sender;
	}

	public String getCreated_on() {
		return created_on;
	}

	public int get_final() {
		return _final;
	}

	public int getAdvance_amount() {
		return advance_amount;
	}

	public String getAdvance_desc() {
		return advance_desc;
	}

	public int getTour_type() {
		return tour_type;
	}

	public void setTourid(int tourid) {
		this.tourid = tourid;
	}

	public void setApproved_flag(int approved_flag) {
		this.approved_flag = approved_flag;
	}

	public void setHris_id(int hris_id) {
		this.hris_id = hris_id;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public void setTour_subject(String tour_subject) {
		this.tour_subject = tour_subject;
	}

	public void setTour_request(String tour_request) {
		this.tour_request = tour_request;
	}

	public void setDate_from(String date_from) {
		this.date_from = date_from;
	}

	public void setDate_to(String date_to) {
		this.date_to = date_to;
	}

	public void setTour_station(int tour_station) {
		this.tour_station = tour_station;
	}

	public void setApproved_hris_id(int approved_hris_id) {
		this.approved_hris_id = approved_hris_id;
	}

	public void setApproved_by(String approved_by) {
		this.approved_by = approved_by;
	}

	public void setApproved_date(String approved_date) {
		this.approved_date = approved_date;
	}

	public void setToll_amount(int toll_amount) {
		this.toll_amount = toll_amount;
	}

	public void setTour_reason(String tour_reason) {
		this.tour_reason = tour_reason;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public void setGrand_total(int grand_total) {
		this.grand_total = grand_total;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public void setCurrently_assigned_hris(int currently_assigned_hris) {
		this.currently_assigned_hris = currently_assigned_hris;
	}

	public void setSender(int sender) {
		this.sender = sender;
	}

	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}

	public void set_final(int _final) {
		this._final = _final;
	}

	public void setAdvance_amount(int advance_amount) {
		this.advance_amount = advance_amount;
	}

	public void setAdvance_desc(String advance_desc) {
		this.advance_desc = advance_desc;
	}

	public void setTour_type(int tour_type) {
		this.tour_type = tour_type;
	}

}
