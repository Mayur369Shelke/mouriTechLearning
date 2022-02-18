package com.user.util;

import java.util.List;

public class UserContact {
	
	private int userId;
	private String name;
	private List<contact> contacts;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<contact> contacts) {
		this.contacts = contacts;
	}
	public UserContact(int userId, String name, List<contact> contacts) {
		super();
		this.userId = userId;
		this.name = name;
		this.contacts = contacts;
	}
	public UserContact() {
		super();
	}
	@Override
	public String toString() {
		return "UserContact [userId=" + userId + ", name=" + name + ", contacts=" + contacts + "]";
	}

	
}
