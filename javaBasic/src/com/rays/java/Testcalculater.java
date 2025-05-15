package com.rays.java;

import java.util.Scanner;

public class Testcalculater {

	public static void main(String[] args) {
		int firstno = 0;
		int secondno = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println(" enter your first no ");
		firstno = sc.nextInt();
		System.out.println(" enter your second no ");
		secondno = sc.nextInt();

		System.out.println("first no is = " + firstno + "second no is =" + secondno);

		System.out.println("select your operation + or - or * or /");
		String operation = "";
		operation = sc.next();

		switch (operation) {
		case "+":
			System.out.println("result = " + (firstno + secondno));
			break;
		case "-":
			System.out.println("result = " + (firstno - secondno));
			break;
		case "*":
			System.out.println((firstno + secondno)+" "+(firstno * secondno));
			break;
		case "/":
			System.out.println("result = " + (firstno / secondno));
			break;

		}

	}

}
