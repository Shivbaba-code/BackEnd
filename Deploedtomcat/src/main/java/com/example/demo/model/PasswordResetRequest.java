package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PasswordResetRequest {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="Mobileno")
	private String Mobileno;
	@Column(name="Password")
	private String Password;
	@Column(name="Confirmpassword")
	private String Confirmpassword;
	
	
	
	public PasswordResetRequest() {
		super();
	}
	
	
	
	public PasswordResetRequest(String mobileno, String password, String confirmpassword) {
		super();
		Mobileno = mobileno;
		Password = password;
		Confirmpassword = confirmpassword;
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
	public String getConfirmpassword() {
		return Confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		Confirmpassword = confirmpassword;
	}
	
	
	
	
	
}
