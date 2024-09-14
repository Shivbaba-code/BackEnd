package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="app_userlogin_information")
public class UserLogin {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="Mobileno")
	private String Mobileno;
	@Column(name="Password")
	private String Password;
	
//	@Column(name="Logintime")
//	private String Logintime;
	
	public UserLogin() {
		super();
		}
	
	public UserLogin(String mobileno, String password) {
		super();
		Mobileno = mobileno;
		Password = password;
		//Logintime=logintime;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMobileno() {
		return Mobileno;
	}
	public void setMobileno(String mobileno) {
		Mobileno = mobileno;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

//	public String getLogintime() {
//		return Logintime;
//	}
//
//	public void setLogintime(String logintime) {
//		Logintime = logintime;
//	}
	
	
	
	
}
