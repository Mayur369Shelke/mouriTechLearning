package com.mouritech.hibernetMapping.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_Id")
	private int orderId;
	
	@Column(name ="customer_id")
	private int customerId;
	
	@Column(name = "order_date")
	private LocalDate orderDate;
	
	@Column(name = "amount")
	private int amount;
	
	@ManyToMany( cascade = CascadeType.ALL)
	@JoinTable(name = "Items_Orders",joinColumns = {@JoinColumn(name = "order_Id")},
					inverseJoinColumns = {@JoinColumn(name = "item_Id")})
	private List<Items> items = new ArrayList<Items>();

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(int customerId, LocalDate orderDate, int amount) {
		super();
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.amount = amount;
	}

	public Orders(int customerId, LocalDate orderDate, int amount, List<Items> items) {
		super();
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.amount = amount;
		this.items = items;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", customerId=" + customerId + ", orderDate=" + orderDate + ", amount="
				+ amount + ", items=" + items + "]";
	}
	
	
	
	
}
