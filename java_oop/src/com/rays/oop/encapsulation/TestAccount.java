package com.rays.oop.encapsulation;



public class TestAccount {

	public static void main(String[] args) {
	Account a = new Account();
	a.setNumber("123456");
	a.setAccounttype("current");
	a.setBalance( 1000.0);

	System.out.println( "account no is " + a.getNumber()) ;
	System.out.println( "account type is " +a.getAccounttype());
	System.out.println( "account balance "+ a.getBalance());
	
	a.deposit(500);
	a.withrawal(200);
	a.fundtransfer(200);
	a.paybill(200);
	}
 

}
