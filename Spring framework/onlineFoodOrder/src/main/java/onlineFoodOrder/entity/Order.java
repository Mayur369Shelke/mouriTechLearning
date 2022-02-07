package onlineFoodOrder.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.print.attribute.standard.DateTimeAtCompleted;

public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;
	
	private LocalDateTime dateTime;
	
	private int orderQuantity;
	
	private int orderAmount;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Food food;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Payment payment;

	public Order(long orderId, LocalDateTime dateTime, int orderQuantity, int orderAmount, Food food, Payment payment) {
		super();
		this.orderId = orderId;
		this.dateTime = dateTime;
		this.orderQuantity = orderQuantity;
		this.orderAmount = orderAmount;
		this.food = food;
		this.payment = payment;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	
	
}
