package com.rays.java;

public class Method {
	public void sum(int a, int b) {
		System.out.println("sum =" + (a + b));
	}

	public void multiply(int a, int b) {
		System.out.println("multiply =" + (a * b));
	}

	public void greeting() {
		System.out.println();

	}
	public static void main(String[] args) {
		Method m= new Method();
		m.sum(5, 10);
		m.greeting();
		m.multiply(2, 3);
	}
}
