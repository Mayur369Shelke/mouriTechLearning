package com.mouritech.onlinefoodorderapplication.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlinefoodorderapplication.entity.Bill;
import com.mouritech.onlinefoodorderapplication.exception.ResourceNotFoundException;
import com.mouritech.onlinefoodorderapplication.repository.BillRepository;
import com.mouritech.onlinefoodorderapplication.service.BillService;
@Service
public class BillServiceImpl implements BillService {
	
	@Autowired
	private BillRepository billRepository;

	@Override
	public Bill saveBill(Bill bill) {
		return billRepository.save(bill);
	}

	@Override
	public List<Bill> getAllBills() {
		return billRepository.findAll();
	}



	@Override
	public ResponseEntity<?> deleteBill(int billId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Bill> getBillById(Long billId) throws ResourceNotFoundException {

		Bill existingbill = billRepository.findById(billId).orElseThrow(() -> new ResourceNotFoundException());

		 return ResponseEntity.ok(existingbill);
	}
	
	@Override
	public ResponseEntity<Bill> updateBills(Long billId, Bill bill) throws ResourceNotFoundException {

		Bill existingbill = billRepository.findById(billId).orElseThrow(() -> new ResourceNotFoundException());
			 existingbill.setBillDate(bill.getBillDate());
				existingbill.setTotalCost(bill.getTotalCost());
				existingbill.setTotalItem(bill.getTotalItem());
				existingbill.setTotalItem(bill.getTotalItem());
				existingbill.setTotalItem(bill.getTotalItem());
				
				billRepository.save(existingbill);
				 return ResponseEntity.ok(existingbill);

			
		}
		
	}


