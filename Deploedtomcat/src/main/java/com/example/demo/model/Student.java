package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="app_student_information")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="Stdfirstname")
	private String Stdfirstname;
	@Column(name="Stdmiddlename")
	private String Stdmiddlename; 
	@Column(name="Stdlastname")
	private String Stdlastname;
	@Column(name="Stdmobileno")
	private String Stdmobileno;
	@Column(name="Stdgender")
	private String Stdgender; 
	@Column(name="City")
	private String City;  
	@Column(name="postCode")
	private String postCode;  
	@Column(name="address")
	private String address; 

	@Column(name="fessAmount")
	private String fessAmount;
	@Column(name="feesDate")
	private String feesDate; 
	@Column(name="pendingfessAmount")
	private String pendingfessAmount;
	@Column(name="pendingfeesDate")
	private String pendingfeesDate;
	@Column(name="Parfirstname")
	private String Parfirstname; 
	@Column(name="Parlastname")
	private String Parlastname;
	@Column(name="Parmobileno")
	private String Parmobileno;
	@Column(name="Emergencynumber")
	private String Emergencynumber;  

	@Column(name="lastyearclass")
	private String lastyearclass;
	@Column(name="lastyearpercentage")
	private String lastyearpercentage;
	@Column(name="admissionclass")
	private String admissionclass; 
    

	
	@Column(name="height")
	private String height;
	@Column(name="weight")
	private String weight;
	@Column(name="bloodgroup")
	private String bloodgroup;
	
	
	@Lob
    //@Column(columnDefinition = "MEDIUMBLOB")
	@Column(length=100000)
	private  byte[] userProfile; 
	
//	@Column(name = "profileFilename")
//	private String profileFilename;
//
//	@Column(name = "profileFiletype")
//	private String profileFiletype;
	@Column(name="aadharCard")
	private  byte[] aadharCard;
	@Column(name="timestamp")
	private String timestamp;
	
	
	public Student() {
		super();
	}
	

	public Student(String stdfirstname, String stdmiddlename, String stdlastname, String stdmobileno, String stdgender,
			String city, String postCode, String address, String fessAmount, String feesDate, String pendingfessAmount,
			String pendingfeesDate, String parfirstname, String parlastname, String parmobileno, String emergencynumber,
			String lastyearclass, String lastyearpercentage, String admissionclass, String height, String weight,
			String bloodgroup, byte[] userProfile, byte[] aadharCard, String timestamp) {
		super();
		this.Stdfirstname = stdfirstname;
		this.Stdmiddlename = stdmiddlename;
		this.Stdlastname = stdlastname;
		this.Stdmobileno = stdmobileno;
		this.Stdgender = stdgender;
		this.City = city;
		this.postCode = postCode;
		this.address = address;
		this.fessAmount = fessAmount;
		this.feesDate = feesDate;
		this.pendingfessAmount = pendingfessAmount;
		this.pendingfeesDate = pendingfeesDate;
		this.Parfirstname = parfirstname;
		this.Parlastname = parlastname;
		this.Parmobileno = parmobileno;
		this.Emergencynumber = emergencynumber;
		this.lastyearclass = lastyearclass;
		this.lastyearpercentage = lastyearpercentage;
		this.admissionclass = admissionclass;
		this.height = height;
		this.weight = weight;
		this.bloodgroup = bloodgroup;
		this.userProfile = userProfile;
		this.aadharCard = aadharCard;
		this.timestamp = timestamp;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getStdfirstname() {
		return Stdfirstname;
	}



	public void setStdfirstname(String stdfirstname) {
		Stdfirstname = stdfirstname;
	}



	public String getStdmiddlename() {
		return Stdmiddlename;
	}



	public void setStdmiddlename(String stdmiddlename) {
		Stdmiddlename = stdmiddlename;
	}



	public String getStdlastname() {
		return Stdlastname;
	}



	public void setStdlastname(String stdlastname) {
		Stdlastname = stdlastname;
	}



	public String getStdmobileno() {
		return Stdmobileno;
	}



	public void setStdmobileno(String stdmobileno) {
		Stdmobileno = stdmobileno;
	}



	public String getStdgender() {
		return Stdgender;
	}



	public void setStdgender(String stdgender) {
		Stdgender = stdgender;
	}



	public String getCity() {
		return City;
	}



	public void setCity(String city) {
		City = city;
	}



	public String getPostCode() {
		return postCode;
	}



	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getFessAmount() {
		return fessAmount;
	}



	public void setFessAmount(String fessAmount) {
		this.fessAmount = fessAmount;
	}



	public String getFeesDate() {
		return feesDate;
	}



	public void setFeesDate(String feesDate) {
		this.feesDate = feesDate;
	}



	public String getPendingfessAmount() {
		return pendingfessAmount;
	}



	public void setPendingfessAmount(String pendingfessAmount) {
		this.pendingfessAmount = pendingfessAmount;
	}



	public String getPendingfeesDate() {
		return pendingfeesDate;
	}



	public void setPendingfeesDate(String pendingfeesDate) {
		this.pendingfeesDate = pendingfeesDate;
	}



	public String getParfirstname() {
		return Parfirstname;
	}



	public void setParfirstname(String parfirstname) {
		Parfirstname = parfirstname;
	}



	public String getParlastname() {
		return Parlastname;
	}



	public void setParlastname(String parlastname) {
		Parlastname = parlastname;
	}



	public String getParmobileno() {
		return Parmobileno;
	}



	public void setParmobileno(String parmobileno) {
		Parmobileno = parmobileno;
	}



	public String getEmergencynumber() {
		return Emergencynumber;
	}



	public void setEmergencynumber(String emergencynumber) {
		Emergencynumber = emergencynumber;
	}



	public String getLastyearclass() {
		return lastyearclass;
	}



	public void setLastyearclass(String lastyearclass) {
		this.lastyearclass = lastyearclass;
	}



	public String getLastyearpercentage() {
		return lastyearpercentage;
	}



	public void setLastyearpercentage(String lastyearpercentage) {
		this.lastyearpercentage = lastyearpercentage;
	}



	public String getAdmissionclass() {
		return admissionclass;
	}



	public void setAdmissionclass(String admissionclass) {
		this.admissionclass = admissionclass;
	}



	public String getHeight() {
		return height;
	}



	public void setHeight(String height) {
		this.height = height;
	}



	public String getWeight() {
		return weight;
	}



	public void setWeight(String weight) {
		this.weight = weight;
	}



	public String getBloodgroup() {
		return bloodgroup;
	}



	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}



	public byte[] getUserProfile() {
		return userProfile;
	}



	public void setUserProfile(byte[] userProfile) {
		this.userProfile = userProfile;
	}



	public byte[] getAadharCard() {
		return aadharCard;
	}



	public void setAadharCard(byte[] aadharCard) {
		this.aadharCard = aadharCard;
	}



	public String getTimestamp() {
		return timestamp;
	}



	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}



	@Override
	public String toString() {
	
		return "Student [id=" + id + ", Stdfirstname=" + Stdfirstname + ", Stdmiddlename=" + Stdmiddlename +", Stdlastname" + Stdlastname +", Stdmobileno" + Stdmobileno + ",Stdgender "+ Stdgender +",City "+ City + ",postCode "+ postCode +",address "+ address +",fessAmount"+fessAmount+",feesDate"+ feesDate+",pendingfessAmount"+pendingfessAmount+",pendingfeesDate"+pendingfeesDate+",Parfirstname"+Parfirstname+",Parlastname"+Parlastname+",Parmobileno"+Parmobileno+",Emergencynumber"+Emergencynumber+",lastyearclass"+lastyearclass+",lastyearpercentage"+lastyearpercentage+",admissionclass"+admissionclass+",height"+height+",weight"+weight+",bloodgroup"+bloodgroup+"  ,userProfile="
				+ userProfile + "]";
	}
	
}
