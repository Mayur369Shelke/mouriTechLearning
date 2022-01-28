package com.mouritech.hibernetMapping.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Stock")
public class Stock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Stock_Id")
	private long stockId;
	
	@Column(name = "Stock_Code")
	private String stockCode;
	
	@Column(name="Stock_name")
	private String stockName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="stock_detail_id")
	private StockDetails stockDetails;

	public long getStockId() {
		return stockId;
	}

	public void setStockId(long stockId) {
		this.stockId = stockId;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public StockDetails getStockDetails() {
		return stockDetails;
	}

	public void setStockDetails(StockDetails stockDetails) {
		this.stockDetails = stockDetails;
	}

	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stock(long stockId, String stockCode, String stockName, StockDetails stockDetails) {
		super();
		this.stockId = stockId;
		this.stockCode = stockCode;
		this.stockName = stockName;
		this.stockDetails = stockDetails;
	}

	public Stock(String stockCode, String stockName, StockDetails stockDetails) {
		super();
		this.stockCode = stockCode;
		this.stockName = stockName;
		this.stockDetails = stockDetails;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockCode=" + stockCode + ", stockName=" + stockName + ", stockDetails="
				+ stockDetails + "]";
	}

	
	
}
