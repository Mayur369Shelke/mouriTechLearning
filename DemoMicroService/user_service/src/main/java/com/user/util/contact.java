package com.user.util;

public class contact {
	
	private int contactId;
	private int userId;
	private String number;
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public contact(int contactId, int userId, String number) {
		super();
		this.contactId = contactId;
		this.userId = userId;
		this.number = number;
	}
	public contact() {
		super();
	
	}
	@Override
	public String toString() {
		return "contact [contactId=" + contactId + ", userId=" + userId + ", number=" + number + "]";
	}
	
	

}
