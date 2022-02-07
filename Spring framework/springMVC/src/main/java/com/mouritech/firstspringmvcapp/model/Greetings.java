package com.mouritech.firstspringmvcapp.model;

public class Greetings {
	private String message;
	private String datatime;
	public Greetings(String message, String datatime) {
		super();
		this.message = message;
		this.datatime = datatime;
	}
	public Greetings() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDatatime() {
		return datatime;
	}
	public void setDatatime(String datatime) {
		this.datatime = datatime;
	}
	
	

}
