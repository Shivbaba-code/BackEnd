package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="app_asigndestination_information")
public class AsignDestination {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name="employee_Name")
	private String employee_Name;
	@Column(name="empMobile_no")
	private String empMobile_no;
	@Column(name="empEmail_id")
	private String empEmail_id;
	@Column(name="empDesignation")
	private String empDesignation;
	@Column(name="asign_Destination")
	private String asign_Destination;
	@Column(name="work_Details")
	private String work_Details;
	@Column(name="parent_Name")
	private String parent_Name;
	@Column(name="mobileNo")
	private String mobileNo;
	@Column(name="village_city")
	private String village_city;
	@Column(name="Tal_name")
	private String Tal_name;
	@Column(name="district")
	private String district;
	@Column(name="postCode")
	private String postCode;
	@Column(name="visitor_date")
	private Date visitor_date;
	@Column(name="Status")
    private String Status;
	@Column(name="timestamp")
    private Date timestamp;
	private String latitude; 
	private String longitude; 
	private String reason;  
	  
	public AsignDestination() {
		
	}
	
	public AsignDestination(String employee_Name, String empMobile_no, String empEmail_id, String empDesignation,
			String asign_Destination, String work_Details, String parent_Name, String mobileNo, String village_city,
			String tal_name, String district, String postCode, Date visitor_date, String status, Date timestamp,
			String latitude,String longitude,String reason) {
		super();
		this.employee_Name = employee_Name;
		this.empMobile_no = empMobile_no;
		this.empEmail_id = empEmail_id;
		this.empDesignation = empDesignation;
		this.asign_Destination = asign_Destination;
		this.work_Details = work_Details;
		this.parent_Name = parent_Name;
		this.mobileNo = mobileNo;
		this.village_city = village_city;
		this.Tal_name = tal_name;
		this.district = district;
		this.postCode = postCode;
		this.visitor_date = visitor_date;
		this.Status = status;
		this.timestamp = timestamp;
		this.latitude = latitude;
		this.longitude = longitude;
		this.reason=reason;
	}
	
	
	
	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	public String getLongitude() {
		return longitude;
	}


	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


	public String getReason() {
		return reason;
	}


	public void setReason(String reason) {
		this.reason = reason;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmployee_Name() {
		return employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}
	public String getEmpMobile_no() {
		return empMobile_no;
	}
	public void setEmpMobile_no(String empMobile_no) {
		this.empMobile_no = empMobile_no;
	}
	public String getEmpEmail_id() {
		return empEmail_id;
	}
	public void setEmpEmail_id(String empEmail_id) {
		this.empEmail_id = empEmail_id;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public String getAsign_Destination() {
		return asign_Destination;
	}
	public void setAsign_Destination(String asign_Destination) {
		this.asign_Destination = asign_Destination;
	}
	public String getWork_Details() {
		return work_Details;
	}
	public void setWork_Details(String work_Details) {
		this.work_Details = work_Details;
	}
	public String getparent_Name() {
		return parent_Name;
	}
	public void setparent_Name(String parent_Name) {
		this.parent_Name = parent_Name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getVillage_city() {
		return village_city;
	}
	public void setVillage_city(String village_city) {
		this.village_city = village_city;
	}
	public String getTal_name() {
		return Tal_name;
	}
	public void setTal_name(String tal_name) {
		Tal_name = tal_name;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public Date getVisitor_date() {
		return visitor_date;
	}
	public void setVisitor_date(Date visitor_date) {
		this.visitor_date = visitor_date;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Date gettimestamp() {
		return timestamp;
	}
	public void settimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	

}
