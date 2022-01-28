package curdUsingHibernet;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	int customerID;
	
	String customerName;
	
	String customerEmail;
	
	String customerMobNo;
	
	String customerAddress;

	public Customer(int customerID, String customerName, String customerEmail, String customerMobNo,
			String customerAddress) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerMobNo = customerMobNo;
		this.customerAddress = customerAddress;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerMobNo() {
		return customerMobNo;
	}

	public void setCustomerMobNo(String customerMobNo) {
		this.customerMobNo = customerMobNo;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerMobNo=" + customerMobNo + ", customerAddress=" + customerAddress + "]";
	}
	

	
	
	
}
