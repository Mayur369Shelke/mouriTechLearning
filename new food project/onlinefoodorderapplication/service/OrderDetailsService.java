package com.mouritech.onlinefoodorderapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlinefoodorderapplication.entity.Orderdetails;
import com.mouritech.onlinefoodorderapplication.exception.ResourceNotFoundException;

public interface OrderDetailsService {
	
    
    Orderdetails saveOrder(Orderdetails order);
	List<Orderdetails> getAllOrders();

}
