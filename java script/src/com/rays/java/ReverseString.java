package com.rays.java;

public class ReverseString {

	public static void main(String[] args) {
		String str = "google";
		System.out.println( "beofe reverse:" +str );
		
		int a =str.length();
		System.out.println("length of str = " +a);

		System.out.println("after reverse:" +str);
       for (int i =5; i>=0; i--) { 
    	   System.out.print(str.charAt(i));
       }
	}

}
