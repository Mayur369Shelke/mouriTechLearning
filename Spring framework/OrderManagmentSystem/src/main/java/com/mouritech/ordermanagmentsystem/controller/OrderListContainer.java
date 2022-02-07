package com.mouritech.ordermanagmentsystem.controller;

import java.util.List;

import com.mouritech.ordermanagmentsystem.model.Order;

public class OrderListContainer {
	
	 private List<Order> orders;

		public List<Order> getOrders() {
			return orders;
		}

		public void setOrders(List<Order> orders) {
			this.orders = orders;
		}

}
