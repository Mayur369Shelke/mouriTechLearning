package omswithREST.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mourity.OrderManagmentSystem.springMVCAndDataJPA.entity.Order;

@Repository("orderRepository")
public interface OrderRepository extends JpaRepository<Order, Long> {

}