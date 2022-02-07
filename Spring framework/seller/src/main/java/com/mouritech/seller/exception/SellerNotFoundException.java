package com.mouritech.seller.exception;

public class SellerNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4056674730866329680L;

public SellerNotFoundException(Object sellid) {
	super(sellid != null ?sellid.toString() : null);
}

}