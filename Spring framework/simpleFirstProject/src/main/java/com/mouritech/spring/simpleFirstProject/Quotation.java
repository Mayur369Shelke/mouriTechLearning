package com.mouritech.spring.simpleFirstProject;

import org.springframework.stereotype.Service;

@Service("quotationService")
public class Quotation {
	
	private String quate;

	public String getQuate() {
		return quate;
	}

	public void setQuate(String quate) {
		this.quate = quate;
	}
	
	

}
