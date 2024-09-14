package com.example.demo.dto;

import jakarta.persistence.Column;

public class UserDTO {

	
	//@Column(name="Firstname")
	private String Firstname;
	//@Column(name="Lastname")
	private String Lastname;
///	@Column(name="Mobileno")
	private String Mobileno;
	//@Column(name="Password")
	private String Password;
	//@Column(name="Confirmpassword")
	private String Confirmpassword;
	
	private String Emailid;
	private String Currentdate;
	
	public UserDTO() {
		super();
		}
	
	
	
	
	
	public UserDTO(String firstname, String lastname, String mobileno, String password, String confirmpassword,String emailid,
			String currentdate) {
		super();
		Firstname = firstname;
		Lastname = lastname;
		Mobileno = mobileno;
		Password = password;
		Confirmpassword = confirmpassword;
		Emailid=emailid;
		Currentdate=currentdate;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
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

	public String getEmailid() {
		return Emailid;
	}

	public void setEmailid(String emailid) {
		Emailid = emailid;
	}





	public String getCurrentdate() {
		return Currentdate;
	}





	public void setCurrentdate(String currentdate) {
		Currentdate = currentdate;
	}
	
	
	
}
