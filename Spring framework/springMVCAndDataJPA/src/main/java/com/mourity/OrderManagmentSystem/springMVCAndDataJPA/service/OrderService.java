package com.mourity.OrderManagmentSystem.springMVCAndDataJPA.service;
import java.util.List;

import com.mourity.OrderManagmentSystem.springMVCAndDataJPA.entity.Order;
import com.mourity.OrderManagmentSystem.springMVCAndDataJPA.exception.OrderNotFoundException;





public interface OrderService {

	List<Order> getAllOrders();

	void saveOrder(Order theNewOrder);

	Order getOrder(Long ordid) throws OrderNotFoundException;

	void deleteOrder(Long ordid);

}