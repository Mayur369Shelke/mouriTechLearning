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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "foodcart")
public class FoodCart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cartid")
	private Long cartId;
	
	private String cardName;
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "foodcard_id")
	private List<Items> items;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerId")
	private Customer customer;


	public Long getCartId() {
		return cartId;
	}


	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}


	public String getCardName() {
		return cardName;
	}


	public void setCardName(String cardName) {
		this.cardName = cardName;
	}


	public List<Items> getItems() {
		return items;
	}


	public void setItems(List<Items> items) {
		this.items = items;
	}


	public FoodCart() {
		super();
		// TODO Auto-generated constructor stub
	}


	public FoodCart(String cardName, List<Items> items) {
		super();
		this.cardName = cardName;
		this.items = items;
	}
	
	
	

}
