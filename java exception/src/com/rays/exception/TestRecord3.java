package com.rays.exception;

import java.util.Scanner;

public class TestRecord3 {

	public static void main(String[] args) throws AcessDeniedException {
		// TODO Auto-generated method stub
		  // Check if the correct number of arguments are provided
      

        String email = "lucky@gmail.com"; // Corrected email format
        String password = "1234";

        String email1 = "lucky@gmail.com1"; // Corrected email format
        String password1= "1234";

        if (email!=email1 || password!=password1) {
            throw new AcessDeniedException("Access Denied: Invalid email or password.");
        } else {
            System.out.println("Login successful! This is the else statement.");
        }
    }

	}


