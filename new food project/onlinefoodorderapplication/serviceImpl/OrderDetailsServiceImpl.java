package com.mouritech.onlinefoodorderapplication.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlinefoodorderapplication.entity.Customer;
import com.mouritech.onlinefoodorderapplication.entity.Orderdetails;
import com.mouritech.onlinefoodorderapplication.entity.Restaurant;
import com.mouritech.onlinefoodorderapplication.exception.ResourceNotFoundException;
import com.mouritech.onlinefoodorderapplication.repository.OrderDetailsRepository;
import com.mouritech.onlinefoodorderapplication.service.OrderDetailsService;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {
	
	@Autowired
	private OrderDetailsRepository orderRepository;
	
	
	@Override
	public Orderdetails saveOrder(Orderdetails order) {
	
		return orderRepository.save(order);
	}

	
	@Override
	public List<Orderdetails> getAllOrders() {
		return  orderRepository.findAll();
	}

	//Orderdetails orderdetails = orderRepository.findById(orderId).orElseThrow(() -> new ResourceNotFoundException());

	

}


