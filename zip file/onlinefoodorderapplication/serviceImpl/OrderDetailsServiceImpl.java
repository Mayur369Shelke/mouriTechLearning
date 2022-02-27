package com.mouritech.onlinefoodorderapplication.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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


	@Override
	public ResponseEntity<Orderdetails> updateOrders(Long orderId, Orderdetails orderdetails) throws ResourceNotFoundException {
		Orderdetails existingOrderDetails = orderRepository.findById(orderId).orElseThrow(() -> new ResourceNotFoundException());
		existingOrderDetails.setOrderDate(orderdetails.getOrderDate());
		existingOrderDetails.setOrderStatus(orderdetails.getOrderStatus());
		existingOrderDetails.setCart(orderdetails.getCart());
		existingOrderDetails.setCart(orderdetails.getCart());
		existingOrderDetails.setBill(orderdetails.getBill());
		
		orderRepository.save(existingOrderDetails);
		
		
		return ResponseEntity.ok(existingOrderDetails);
	}


	@Override
	public ResponseEntity<?> deleteOrder(Long orderId) throws ResourceNotFoundException {

		Orderdetails existingOrderDetails = orderRepository.findById(orderId).orElseThrow(() -> new ResourceNotFoundException());

		 if(existingOrderDetails==null) {
			 
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("order ID is not present");
				 
			 }
			 else {
				
				 orderRepository.delete(existingOrderDetails);
				 
				 return ResponseEntity.status(HttpStatus.OK).body(existingOrderDetails);

			}
		
	}


	@Override
	public ResponseEntity<Orderdetails> getOrderById(long orderId) throws ResourceNotFoundException {
		
		Orderdetails existingOrderDetails = orderRepository.findById(orderId).orElseThrow(() -> new ResourceNotFoundException());
				 
				 return ResponseEntity.status(HttpStatus.OK).body(existingOrderDetails);

		

	}





	

}


