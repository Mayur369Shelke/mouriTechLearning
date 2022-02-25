package com.mouritech.onlinefoodorderapplication.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlinefoodorderapplication.entity.Orderdetails;
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
	public  ResponseEntity<Orderdetails> updateOrders(Long orderId) {
		Orderdetails order =  orderRepository.findByOrderId(orderId).orElseThrow(() -> new ResourceNotFoundException());
		
		     
		        order.setOrderStatus(order.getOrderStatus());
			        final Orderdetails updatedOrder = orderRepository.save(order);
			        return ResponseEntity.ok(updatedOrder);
	}
	@Override
	public ResponseEntity<?> deleteOrder(int orderId) {
		
		return orderRepository.findByOrderId(orderId).map(order -> {
			orderRepository.delete(order);
		return ResponseEntity.ok().build();
		}).orElseThrow(()->new OrderNotFound("order not found"));
	}
	@Override
	public ResponseEntity<Order> getOrderById(int orderId) {
		Orderdetails order = orderRepository.findByOrderId(orderId)
		        .orElseThrow(() -> new ResourceNotFoundException());
		      return ResponseEntity.ok().body(order);
	}
}

}
