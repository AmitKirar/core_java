package com.rays.thread;

public class Account {
	
private int balance;

public int getBalance() {
	try {
		Thread.sleep(200);
	}catch(InterruptedException e) {
		System.out.println(e);
	}
	return balance;
}

public void setBalance(int balance) {
	try {
		Thread.sleep(200);
	}catch(InterruptedException e) {
		System.out.println(e);
	}
	this.balance = balance;
}
public synchronized void deposit(String name,int amount) {
	int total= getBalance() + amount;
	setBalance(total);

	System.out.println(name+" "+getBalance());

}
	
	
}
