package com.example.demo.response;

public class MetaDataResponse {
	private String code;
    private String message;
    private long noOfRecords;
    
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getNoOfRecords() {
		return noOfRecords;
	}
	public void setNoOfRecords(long noOfRecords) {
		this.noOfRecords = noOfRecords;
	}


}
