package com.mouritech.ordermanagmentsystem.service;

import java.util.List;

import com.mouritech.ordermanagmentsystem.model.Order;

public interface OrderService {
	
	List<Order> getAllOrders();

	void saveOrder(Order theNewOrder);

	Order getOrder(int ordid);

	void deleteOrder(int ordid);
}
