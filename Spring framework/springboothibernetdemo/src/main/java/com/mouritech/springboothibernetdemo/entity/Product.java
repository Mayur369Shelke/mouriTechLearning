package com.mouritech.springboothibernetdemo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "product")
@EntityListeners(AuditingEntityListener.class)

public class Product {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;
	
	private String productName;
	
	private float productPrice;
	
	@LastModifiedDate
	private LocalDate productMfgDate;
	@LastModifiedDate
	private LocalDate productExpDate;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productName, float productPrice, LocalDate productMfgDate, LocalDate productExpDate) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productMfgDate = productMfgDate;
		this.productExpDate = productExpDate;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public LocalDate getProductMfgDate() {
		return productMfgDate;
	}

	public void setProductMfgDate(LocalDate productMfgDate) {
		this.productMfgDate = productMfgDate;
	}

	public LocalDate getProductExpDate() {
		return productExpDate;
	}

	public void setProductExpDate(LocalDate productExpDate) {
		this.productExpDate = productExpDate;
	}
	
	

}
