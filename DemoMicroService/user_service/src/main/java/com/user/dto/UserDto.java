package com.user.dto;
public class UserDto {
	
	private int userId;
	private String name;
	
	
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
	public UserDto(int userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", name=" + name + "]";
	}
	
	

}
