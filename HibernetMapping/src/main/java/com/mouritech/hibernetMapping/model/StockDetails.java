package com.mouritech.hibernetMapping.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Stock_Details")
public class StockDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Stock_Id")
	private long stockDetailsId;
	@Column(name = "company_Name")
	private String companyName;
	@Column(name = "company_Desc")
	private String companyDesc;
	@Column(name = "remark")
	private String remark;
	public long getStockDetailsId() {
		return stockDetailsId;
	}
	public void setStockDetailsId(long stockDetailsId) {
		this.stockDetailsId = stockDetailsId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyDesc() {
		return companyDesc;
	}
	public void setCompanyDesc(String companyDesc) {
		this.companyDesc = companyDesc;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public StockDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StockDetails(long stockDetailsId, String companyName, String companyDesc, String remark) {
		super();
		this.stockDetailsId = stockDetailsId;
		this.companyName = companyName;
		this.companyDesc = companyDesc;
		this.remark = remark;
	}
	public StockDetails(String companyName, String companyDesc, String remark) {
		super();
		this.companyName = companyName;
		this.companyDesc = companyDesc;
		this.remark = remark;
	}
	
	
	

}
