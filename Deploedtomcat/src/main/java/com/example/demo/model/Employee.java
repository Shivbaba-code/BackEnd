package com.example.demo.model;

 

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="app_employess_information")
public class Employee {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="designation")
	private String designation;
	@Column(name="mobile_no")
	private String mobile_no;
	@Column(name="email_id")
	private String email_id;
	@Column(name="education")
	private String education;
	@Column(name="employee_address")
	private String employee_address;
	@Column(name="currentDate")
    private Date currentDate;
	
	public Employee() {
		
	}
	
	public Employee(String first_name, String last_name, String designation, String mobile_no, String email_id,
			String education, String employee_address, Date currentDate) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.designation = designation;
		this.mobile_no = mobile_no;
		this.email_id = email_id;
		this.education = education;
		this.employee_address = employee_address;
		this.currentDate = currentDate;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getEmployee_address() {
		return employee_address;
	}
	public void setEmployee_address(String employee_address) {
		this.employee_address = employee_address;
	}
	public Date getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
	
	
}
