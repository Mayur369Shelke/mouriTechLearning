package com.mouritech.onlinefoodorderapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlinefoodorderapplication.entity.Customer;
import com.mouritech.onlinefoodorderapplication.entity.Orderdetails;
import com.mouritech.onlinefoodorderapplication.entity.Restaurant;

public interface OrderDetailsService {
	
	public Orderdetails addOrder(Orderdetails order);
	public Orderdetails updateOrder(Orderdetails order);
	public Orderdetails removeOrder(Orderdetails order);
	public Orderdetails viewOrder(Orderdetails order);
    public List<Orderdetails> viewAllOrders(Restaurant res);
    public List<Orderdetails> viewAllOrders(Customer customer);
    
    Orderdetails saveOrder(Orderdetails order);
	List<Orderdetails> getAllOrders();
	ResponseEntity<Orderdetails> updateOrders(int orderId);
	ResponseEntity<?> deleteOrder(int orderId) ;
	ResponseEntity<Orderdetails> getOrderById(int orderId);

}
