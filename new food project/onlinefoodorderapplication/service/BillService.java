package com.mouritech.onlinefoodorderapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlinefoodorderapplication.entity.Bill;

public interface BillService {
	
	Bill saveBill(Bill bill);

	List<Bill> getAllBills();

	ResponseEntity<Bill> updateBills(int billId);

	ResponseEntity<?> deleteBill(int billId)  ;

	ResponseEntity<Bill> getBillById(int billId) ;

}
