package com.mouritech.onlinefoodorderapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/orders")
public class OrderDetailsController {
	
	@Autowired
	private OrderService orderService;
	
	//save an order
		@PostMapping("/orders")
		public Order saveOrder(@Valid @RequestBody Order order)
		{
			return orderService.saveOrder(order);
		}
		//get all orders
		@GetMapping("/orders")
		public List<Order> getAllOrders()
		{
			return orderService.getAllOrders();
		}
		//update orders
		@PutMapping("/orders/{id}")
		public ResponseEntity<Order> updateOrder(@PathVariable(value = "id") int orderId) throws OrderNotFound {
		
			return orderService.updateOrders(orderId);
		
		}
		//delete order
		@DeleteMapping("/orders/{orderId}")
		public ResponseEntity<?> deleteOrder( 
				@PathVariable(value = "orderId") int orderId)
		throws OrderNotFound{
			return orderService.deleteOrder(orderId);
			
		}
		//get order by orderId
		@GetMapping("/orders/{id}")
	  public ResponseEntity<Order> getOrderById(@PathVariable(value = "id") int orderId)
	      throws OrderNotFound {
			return orderService.getOrderById(orderId);
			
			
		}
	}