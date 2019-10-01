package com.basic.customException;

public class BankService {
	private int accNumber;
	private double balance = 5000;

	public BankService() {

	}

	public BankService(int accNumber, double balance) {
		this.accNumber = accNumber;
		this.balance = balance;

	}

	public void withdraw(int accNumber, double amount) throws InvalidAccountNumber, InsufficientBalance {
		if (accNumber != 201) {
			throw new InvalidAccountNumber("wrong accountNumber");

		}
		if (amount > balance) {
			throw new InsufficientBalance("insufficientBalance");

		}
		balance = balance - amount;
		System.out.println(balance);

	}

}
