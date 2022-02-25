package com.mouritech.onlinefoodorderapplication.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bill")
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bill_id")
	private Long billId;
	@Column(name = "bill_date")
	private LocalDate billDate;
	@Column(name = "total_item")
	private int totalItem;
	@Column(name = "total_cost")
	private double totalCost;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="order_id" )
    private Orderdetails orderdetails;

	public Long getBillId() {
		return billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
	}

	public LocalDate getBillDate() {
		return billDate;
	}

	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}

	public int getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public Orderdetails getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(Orderdetails orderdetails) {
		this.orderdetails = orderdetails;
	}
	
	
}