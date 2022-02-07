package com.mouritech.practicecustomer.model;

public class Customer {
	private int customerId;
	private String customerDate;
	private float customerValue;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String customerDate, float customerValue) {
		super();
		this.customerId = customerId;
		this.customerDate = customerDate;
		this.customerValue = customerValue;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerDate() {
		return customerDate;
	}

	public void setCustomerDate(String customerDate) {
		this.customerDate = customerDate;
	}

	public float getCustomerValue() {
		return customerValue;
	}

	public void setCustomerValue(float customerValue) {
		this.customerValue = customerValue;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerDate=" + customerDate + ", customerValue="
				+ customerValue + "]";
	}

	
}