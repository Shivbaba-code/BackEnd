package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="app_registrationuser_information")
public class UserRegistration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="Firstname")
	private String Firstname;
	@Column(name="Lastname")
	private String Lastname;
	@Column(name="Mobileno")
	private String Mobileno;
	@Column(name="Password")
	private String Password;
	@Column(name="Confirmpassword")
	private String Confirmpassword;
	
	@Column(name="Emailid")
	private String Emailid;
	
	@Column(name="Currentdate")
	private String Currentdate;
	
	
	
	public UserRegistration() {
		super();
		}
	
	
	
	
	public UserRegistration(String firstname, String lastname, String mobileno, String password,
			String confirmpassword,String emailid,String currentdate) {
		super();
		Firstname = firstname;
		Lastname = lastname;
		Mobileno = mobileno;
		Password = password;
		Confirmpassword = confirmpassword;
		Emailid=emailid;
		Currentdate=currentdate;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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




	@Override
	public String toString() {
	
		return "UserRegistration [id=" + id + ", Firstname=" + Firstname + ", Lastname=" + Lastname +", Mobileno" + Mobileno +",Password"+Password+", Confirmpassword" + Confirmpassword+",Emailid"+Emailid+",Currentdate"+Currentdate+"]";
	}

}
