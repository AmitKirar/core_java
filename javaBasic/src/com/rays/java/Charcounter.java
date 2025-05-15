package com.rays.java;

public class Charcounter {

	public static void main(String[] args) {
		String name = "lucky";
		int count  = 0;
		
		for (int i =0; i<name.length (); i++) {  
			 if ('l' ==name.charAt(i)) {  
				 count++;
				 
			 }
		}
           System.out.println("l = "+ count);
	}

}
