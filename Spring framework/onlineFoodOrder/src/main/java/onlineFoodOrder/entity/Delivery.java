package onlineFoodOrder.entity;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Delivery {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long deliveryId;
	
	private String department;
	
	private LocalDateTime deliveryDataAndTime;
	
	private boolean Arrival;
	
	private String deliveryBoyName;

	public Delivery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Delivery(long deliveryId, String department, LocalDateTime deliveryDataAndTime, boolean arrival,
			String deliveryBoyName) {
		super();
		this.deliveryId = deliveryId;
		this.department = department;
		this.deliveryDataAndTime = deliveryDataAndTime;
		Arrival = arrival;
		this.deliveryBoyName = deliveryBoyName;
	}

	public long getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(long deliveryId) {
		this.deliveryId = deliveryId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public LocalDateTime getDeliveryDataAndTime() {
		return deliveryDataAndTime;
	}

	public void setDeliveryDataAndTime(LocalDateTime deliveryDataAndTime) {
		this.deliveryDataAndTime = deliveryDataAndTime;
	}

	public boolean isArrival() {
		return Arrival;
	}

	public void setArrival(boolean arrival) {
		Arrival = arrival;
	}

	public String getDeliveryBoyName() {
		return deliveryBoyName;
	}

	public void setDeliveryBoyName(String deliveryBoyName) {
		this.deliveryBoyName = deliveryBoyName;
	}
	

}
