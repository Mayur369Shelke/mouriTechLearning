package onlineFoodOrder.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Payment {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long paymentId;
	
	private int netPrice;
	
	private boolean paymentInCash;
	
	private boolean paymentInOnline;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(long paymentId, int netPrice, boolean paymentInCash, boolean paymentInOnline) {
		super();
		this.paymentId = paymentId;
		this.netPrice = netPrice;
		this.paymentInCash = paymentInCash;
		this.paymentInOnline = paymentInOnline;
	}

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public int getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(int netPrice) {
		this.netPrice = netPrice;
	}

	public boolean isPaymentInCash() {
		return paymentInCash;
	}

	public void setPaymentInCash(boolean paymentInCash) {
		this.paymentInCash = paymentInCash;
	}

	public boolean isPaymentInOnline() {
		return paymentInOnline;
	}

	public void setPaymentInOnline(boolean paymentInOnline) {
		this.paymentInOnline = paymentInOnline;
	}
	

	
}
