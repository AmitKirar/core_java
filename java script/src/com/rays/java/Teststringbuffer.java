package com.rays.java;

public class Teststringbuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer ( "Ram");
		System.out.println( "sb  = "+sb );
		sb.append( " lucky");
		System.out.println( "sb =" + sb);
		
		sb.reverse();
		System.out.println( "sb =" + sb);
		
		sb.delete(2, 8);
		System.out.println( "sb =" + sb);
		
	
	}

}
