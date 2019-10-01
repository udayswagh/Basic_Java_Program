package com.basic.customException;

public class BankTest {
	public static void main(String[] args) {
		BankService bankService = new BankService();

		try {
			bankService.withdraw(201,11000);
		} catch (InvalidAccountNumber e) {
			System.out.println(e.getMessage());
		} catch (InsufficientBalance e) {
			System.out.println(e.getMessage());

		}
	}

}
