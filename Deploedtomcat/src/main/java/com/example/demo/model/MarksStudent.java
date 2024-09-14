package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="app_studentmarks_information")
public class MarksStudent {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="studentname")
	private String studentname;
	@Column(name="admitionClass")
	private String admitionClass;
	@Column(name="parmobileno")
	private String parmobileno;
	@Column(name="subject")
	private String subject;
	@Column(name="marks")
	private String marks;
	@Column(name="outofmark")
	private String outofmark;
	@Column(name="remark")
	private String remark;
	@Column(name="resultdate")
	private String resultdate;
	@Column(name="testnumber")
	private String testnumber;
	
	
	
	
	public MarksStudent() {
		super();
	}
	
	
	public MarksStudent(String studentname, String admitionClass, String parmobileno, String subject, String marks,
			String outofmark, String remark, String resultdate,String testnumber) {
		super();
		this.studentname = studentname;
		this.admitionClass = admitionClass;
		this.parmobileno = parmobileno;
		this.subject = subject;
		this.marks = marks;
		this.outofmark = outofmark;
		this.remark = remark;
		this.resultdate = resultdate;
		this.testnumber=testnumber;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getAdmitionClass() {
		return admitionClass;
	}
	public void setAdmitionClass(String admitionClass) {
		this.admitionClass = admitionClass;
	}
	public String getParmobileno() {
		return parmobileno;
	}
	public void setParmobileno(String parmobileno) {
		this.parmobileno = parmobileno;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public String getOutofmark() {
		return outofmark;
	}
	public void setOutofmark(String outofmark) {
		this.outofmark = outofmark;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getResultdate() {
		return resultdate;
	}
	public void setResultdate(String resultdate) {
		this.resultdate = resultdate;
	}


	public String getTestnumber() {
		return testnumber;
	}


	public void setTestnumber(String testnumber) {
		this.testnumber = testnumber;
	}
	
	
	
	
	

}
