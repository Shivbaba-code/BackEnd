package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="app_payment_information")
public class PaymentHistory {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	  @Column(name="studentname")
	  private String studentname;
		@Column(name="parmobileno")
	   private String parmobileno; 
		@Column(name="admitionClass")
	   private String  admitionClass; 
		@Column(name="paidpayment")
		private String paidpayment;
		@Column(name="nextpayment")
		private String nextpayment;   
		@Column(name="nextpaymentdate")
		private String  nextpaymentdate;
		@Column(name="timestamp")
		private String timestamp;
		
		
		public PaymentHistory()
		{
			super();
		}
		
		
		
		public PaymentHistory(String studentname, String parmobileno, String admitionClass, String paidpayment,
				String nextpayment, String nextpaymentdate, String timestamp) {
			super();
			this.studentname = studentname;
			this.parmobileno = parmobileno;
			this.admitionClass = admitionClass;
			this.paidpayment = paidpayment;
			this.nextpayment = nextpayment;
			this.nextpaymentdate = nextpaymentdate;
			this.timestamp = timestamp;
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
		public String getParmobileno() {
			return parmobileno;
		}
		public void setParmobileno(String parmobileno) {
			this.parmobileno = parmobileno;
		}
		public String getAdmitionClass() {
			return admitionClass;
		}
		public void setAdmitionClass(String admitionClass) {
			this.admitionClass = admitionClass;
		}
		public String getPaidpayment() {
			return paidpayment;
		}
		public void setPaidpayment(String paidpayment) {
			this.paidpayment = paidpayment;
		}
		public String getNextpayment() {
			return nextpayment;
		}
		public void setNextpayment(String nextpayment) {
			this.nextpayment = nextpayment;
		}
		public String getNextpaymentdate() {
			return nextpaymentdate;
		}
		public void setNextpaymentdate(String nextpaymentdate) {
			this.nextpaymentdate = nextpaymentdate;
		}
		public String getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}
		
		
		
		
		
}
