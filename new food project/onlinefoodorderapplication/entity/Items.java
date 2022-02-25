package com.mouritech.onlinefoodorderapplication.entity;

import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "items")
public class Items {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_Id")
		private long itemId;
		
		private String itemName;
		
		private int itemPrice;
		
		private String itemDescription;
		
		private int itemQuantity;
		
		@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
		@JoinColumn(name = "restaurant_id", nullable = false)
		 @JsonIgnore
		private Restaurant restaurant;
		

		public long getItemId() {
			return itemId;
		}

		public void setItemId(long itemId) {
			this.itemId = itemId;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public int getItemPrice() {
			return itemPrice;
		}

		public void setItemPrice(int itemPrice) {
			this.itemPrice = itemPrice;
		}

		public String getItemDescription() {
			return itemDescription;
		}

		public void setItemDescription(String itemDescription) {
			this.itemDescription = itemDescription;
		}

		public int getItemQuantity() {
			return itemQuantity;
		}

		public void setItemQuantity(int itemQuantity) {
			this.itemQuantity = itemQuantity;
		}

		public Restaurant getRestaurant() {
			return restaurant;
		}

		public void setRestaurant(Restaurant restaurant) {
			this.restaurant = restaurant;
		}
		
		

			}

