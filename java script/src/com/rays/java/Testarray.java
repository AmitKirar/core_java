package com.rays.java;

public class Testarray {

	public static void main(String[] args) {
		 
		int [] i= {1,4,5,6,};
		
		System.out.println(i[0]+" " +i[1] );
		
		for (int j = 0; j < i[2]; j++) {
			System.out.println(j);
		}
		
		System.out.println("----for each loop---" );
		for (int a:i) { 
			
		System.out.println(a);	
		}

	}

}
