package com.rays.java;

public class NewString {

	public static void main(String[] args) {
		String name = "Vijay Dinanath Chauhan";
		System.out.println( "String Length " + name.length ());
		System.out.println("seventh character is " + name.charAt(6));
		System.out.println( "Dina index is " + name.indexOf("Dina"));
		System.out.println("First i position " + name.indexOf("i"));
		System.out.println( "last i position " +name.indexOf( "i"));
		System.out.println( "a is replaced by b " + name.replace( "a","b"));
		System.out.println( "chhota vijay "+name.toLowerCase());
		System.out.println( "Bada vijay " + name.toUpperCase());
		System.out.println( "Starts With Vijay " + name.startsWith( "Vijay"));
		System.out.println("End With han "+name.endsWith("han"));
		System.out.println("substring " + name.substring(6));

	}

}
