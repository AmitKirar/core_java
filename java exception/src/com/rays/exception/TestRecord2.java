package com.rays.exception;

import java.util.Scanner;

public class TestRecord2 {

	public static void main(String[] args) throws AcessDeniedException {
		String email = "lucky@gmail";
		String password = "1234";
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Email");
		       String email1=sc.next();
		       System.out.println("Enter the password");
		       String password1=sc.next();
		if (!email.equals(email1)||!password.equals(password1)) {
			throw new AcessDeniedException("AcessDeniedException");
		}else {
			System.out.println("LoginSuccesfukk");
		}

	}

}
