package com.rays.oop.encapsulation;

public class Account {

	private String number;
	private String accountType;
	private double balance;

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccounttype() {
		return this.accountType;
	}

	public void setAccounttype(String accountType) {
		this.accountType = accountType;

	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

//	deposit method 
	public  void  deposit (double amt) {  
		this.balance = this.balance+amt;
		System.out.println( " total balance after deposit :" + this.balance);
	}
	
//	withdrawal method
	public void withrawal (double amt) {  
		if (amt>this.balance) {  
			System.err.println("insufficient fund");
		}else {  
			this.balance= this.balance -amt;		
			System.out.println( "total balance after withdrawal :"+ this.balance);
	} 
}
	
//	fund transfer method
	
	public void fundtransfer (double amt) {  
		if (amt>this.balance) {
			System.err.println( "insufficient fund");
		}else {
			this.balance = this.balance-amt;
			System.out.println( "total balance after fund transfer :"+ this.balance);
		}
	}
		
//	pay bill method
	
	public void paybill (double amt) {  
		if (amt>this.balance) {
			System.err.println( "insufficient fund");
		}else {
			this .balance = this.balance-amt;
			System.out.println( "total balance after pay bill: "+ this.balance);
		}
	}
}