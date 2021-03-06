package com.mouritech.seller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Seller")
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "seller_id")
	private long sellerId;

	@Column(name = "seller_name")
	private String sellerName;
	
	@Column(name = "seller_email")
	private String selleremail;
	
	@Column(name = "seller_city")
	private String sellerCity;
	
	@Column(name = "seller_category")
	private String sellerCategory;
	
	@Column(name = "seller_mobile_no")
	private String sellerMobNo;

	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seller(long sellerID, String sellerName, String selleremail, String sellerCity, String sellerCategory,
			String sellerMobNo) {
		super();
		this.sellerId = sellerID;
		this.sellerName = sellerName;
		this.selleremail = selleremail;
		this.sellerCity = sellerCity;
		this.sellerCategory = sellerCategory;
		this.sellerMobNo = sellerMobNo;
	}

	public long getSellerID() {
		return sellerId;
	}

	public void setSellerID(long sellerID) {
		this.sellerId = sellerID;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSelleremail() {
		return selleremail;
	}

	public void setSelleremail(String selleremail) {
		this.selleremail = selleremail;
	}

	public String getSellerCity() {
		return sellerCity;
	}

	public void setSellerCity(String sellerCity) {
		this.sellerCity = sellerCity;
	}

	public String getSellerCategory() {
		return sellerCategory;
	}

	public void setSellerCategory(String sellerCategory) {
		this.sellerCategory = sellerCategory;
	}

	public String getSellerMobNo() {
		return sellerMobNo;
	}

	public void setSellerMobNo(String sellerMobNo) {
		this.sellerMobNo = sellerMobNo;
	}

	@Override
	public String toString() {
		return "Seller [sellerID=" + sellerId + ", sellerName=" + sellerName + ", selleremail=" + selleremail
				+ ", sellerCity=" + sellerCity + ", sellerCategory=" + sellerCategory + ", sellerMobNo=" + sellerMobNo
				+ "]";
	}
	
	

}
