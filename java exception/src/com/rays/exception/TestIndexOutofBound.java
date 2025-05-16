package com.rays.exception;

public class TestIndexOutofBound {

	public static void main(String[] args) {
		
		int [] i = { 2,3,4,5,6};
		
		try {
			System.out.println(i[5]);
		} catch (Exception e) {
		System.out.println( "exception :"+e.getMessage() );
		}
		

	}

}
