package com.mouritech.ordermanagmentsystem.dao;

import java.util.List;

import com.mouritech.ordermanagmentsystem.model.Order;

public interface OrderDao {
	
	List<Order> getAllOrders();

	void saveOrder(Order theNewOrder);

	Order getOrder(int ordid);

	void deleteOrder(int ordid);


}
