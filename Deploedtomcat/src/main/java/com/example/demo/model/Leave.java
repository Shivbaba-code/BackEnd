package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="app_leave_information")
public class Leave {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="stdfirstname")
	private String stdfirstname;
	
	@Column(name="parmobileno")
	private String parmobileno;
	
	@Column(name="stdclass")
	private String stdclass;
	
	@Column(name="startdate")
	private String startdate;
	
	@Column(name="enddate")
	private String enddate;
	
	@Column(name="reason")
	private String reason;
	
	@Column(name="status")
	private String status;
	
	@Column(name="timestamp")
	private String timestamp;
	
	
	
	public Leave() {
		super();
	}
	
	
	
	public Leave(String stdfirstname, String parmobileno, String stdclass, String startdate, String enddate,
			String reason, String status, String timestamp) {
		super();
		this.stdfirstname = stdfirstname;
		this.parmobileno = parmobileno;
		this.stdclass = stdclass;
		this.startdate = startdate;
		this.enddate = enddate;
		this.reason = reason;
		this.status = status;
		this.timestamp = timestamp;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStdfirstname() {
		return stdfirstname;
	}
	public void setStdfirstname(String stdfirstname) {
		this.stdfirstname = stdfirstname;
	}
	public String getParmobileno() {
		return parmobileno;
	}
	public void setParmobileno(String parmobileno) {
		this.parmobileno = parmobileno;
	}
	public String getStdclass() {
		return stdclass;
	}
	public void setStdclass(String stdclass) {
		this.stdclass = stdclass;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
	
	
	
}
