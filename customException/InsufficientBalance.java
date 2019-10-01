package com.basic.customException;

public class InsufficientBalance extends Exception {
	public InsufficientBalance() {
	}

	public InsufficientBalance(String balance) {
		super(balance);
	}

}
