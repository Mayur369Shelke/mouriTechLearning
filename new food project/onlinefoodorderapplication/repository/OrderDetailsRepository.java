package com.mouritech.onlinefoodorderapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.mouritech.onlinefoodorderapplication.entity.Orderdetails;

@Repository
public interface OrderDetailsRepository extends JpaRepository<Orderdetails, Long>{

	Object findByOrderId(Long orderId);
	
	Orderdetails saveOrder(Orderdetails order);
	List<Orderdetails> getAllOrders();
	ResponseEntity<Orderdetails> updateOrders(int orderId, Orderdetails order) ;
	ResponseEntity<?> deleteOrder(int orderId) ;
	ResponseEntity<Orderdetails> getOrderById(int orderId) ;

}
