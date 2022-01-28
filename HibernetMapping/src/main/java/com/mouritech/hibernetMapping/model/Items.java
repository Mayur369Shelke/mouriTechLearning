package com.mouritech.hibernetMapping.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Items")
public class Items {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_Id")
	private int itemId;
	
	@Column(name = "item_name")
	private String itemName;
	
	@Column(name = "item_description")
	private String itemDescription;
	
	@ManyToMany(mappedBy ="Items",cascade = {CascadeType.ALL})
	private List<Orders> orders = new ArrayList<Orders>();

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public Items(String itemName, String itemDescription, List<Orders> orders) {
		super();
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.orders = orders;
	}

	public Items(String itemName, String itemDescription) {
		super();
		this.itemName = itemName;
		this.itemDescription = itemDescription;
	}

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemName=" + itemName + ", itemDescription=" + itemDescription
				+ ", orders=" + orders + "]";
	}
	
	
}
