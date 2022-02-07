package com.mouritech.ordermanagmentsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mouritech.ordermanagmentsystem.dao.OrderDao;
import com.mouritech.ordermanagmentsystem.model.Order;

@Service
public class OrderServiceImpl implements OrderService {


	@Autowired
	private OrderDao ordDao;

	@Transactional
	public List<Order> getAllOrders() {
		
		return ordDao.getAllOrders();
	}

	@Transactional
	public void saveOrder(Order theNewOrder) {
		
		 ordDao.saveOrder(theNewOrder);
	}

	@Transactional
	public Order getOrder(int ordid) {
		
		return ordDao.getOrder(ordid);
	}
	
	@Transactional
	public void deleteOrder(int ordid) {
		 ordDao.deleteOrder(ordid);
		
	}
}
