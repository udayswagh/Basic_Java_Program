package com.basic.customException;

public class InvalidAccountNumber extends Exception {

	public InvalidAccountNumber() {

	}

	public InvalidAccountNumber(String accountNumber) {
		super(accountNumber);
	}

}
