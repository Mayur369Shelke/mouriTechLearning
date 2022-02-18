package com.contact.dto;

public class ContactDto {
	
	
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

	public ContactDto(int contactId, int userId, String number) {
		super();
		this.contactId = contactId;
		this.userId = userId;
		this.number = number;
	}

	public ContactDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ContactDto [contactId=" + contactId + ", userId=" + userId + ", number=" + number + "]";
	}

	
}
