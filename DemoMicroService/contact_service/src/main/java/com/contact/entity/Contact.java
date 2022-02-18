package com.contact.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "contactId")
	private int contactId;
	@Column(name = "userId")
	private int userId;
	@Column(name = "number")
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
	public Contact(int contactId, int userId, String number) {
		super();
		this.contactId = contactId;
		this.userId = userId;
		this.number = number;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
