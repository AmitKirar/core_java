package com.rays.exception;

public class TestNullPointerException {

	public static void main(String[] args) {

		String str = null;
		
		
		try {
			for (int i = 0; i < str.length(); i++) { 
				System.out.println(str);
			}
		} catch (Exception e) {
			System.out.println("exception "+ e.getMessage());
		}
		
		
			
		}
		
		

	}


