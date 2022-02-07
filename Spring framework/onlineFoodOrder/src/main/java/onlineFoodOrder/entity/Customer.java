package onlineFoodOrder.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name="Customer")
public class Customer {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "customerid")
		private Long customerId;
		
		@Column(name = "cus_name")
		private String customerName;
		
		@Column(name = "cus_email")
		@Email
		private String customerEmail;
		
		@Column(name = "cus_no")
		private int customerNo;
		
		@Column(name = "cus_password")
		private String password;
		
		@OneToMany(cascade = CascadeType.ALL)
		//@JoinColumn(name ="order_id" )
		private Order order;

		public Customer(Long customerId, String customerName, String customerEmail, int customerNo, String password) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.customerEmail = customerEmail;
			this.customerNo = customerNo;
			this.password = password;
		}

		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Long getCustomerId() {
			return customerId;
		}

		public void setCustomerId(Long customerId) {
			this.customerId = customerId;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getCustomerEmail() {
			return customerEmail;
		}

		public void setCustomerEmail(String customerEmail) {
			this.customerEmail = customerEmail;
		}

		public int getCustomerNo() {
			return customerNo;
		}

		public void setCustomerNo(int customerNo) {
			this.customerNo = customerNo;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Order getOrder() {
			return order;
		}

		public void setOrder(Order order) {
			this.order = order;
		}
	
		
		
	

}
