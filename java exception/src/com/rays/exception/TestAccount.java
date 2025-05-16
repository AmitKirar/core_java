package com.rays.exception;

public class TestAccount {

	public static void main(String[] args) throws InsufficientFundTransfer {

		double balance = 500.0;
		double withdrawlAmt = 1000.0;
		
		if (withdrawlAmt > balance) {
			throw new InsufficientFundTransfer("InsufficientFundTransfer");
		} else {
			balance = balance - withdrawlAmt;
			System.out.println(balance);
		}

	}

}
