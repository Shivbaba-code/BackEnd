package com.example.demo.dto;

import org.springframework.web.multipart.MultipartFile;

public class StudentDto {
	
	private long id;
	private String Stdfirstname; 
	
	private  byte[] byteuserProfile;
	
	private MultipartFile useProfile;

	public String getStdfirstname() {
		return Stdfirstname;
	}

	public void setStdfirstname(String stdfirstname) {
		Stdfirstname = stdfirstname;
	}

	public byte[] getUserProfile() {
		return getUserProfile();
	}

	public void setUserProfile(byte[] userProfile) {
		this.byteuserProfile = userProfile;
	} 
}
