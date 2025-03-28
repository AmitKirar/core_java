package com.rays.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Person p = new Person();
		
		p.setName("Amit");
		System.out.println("name is : "+p.getName());
		
		p.setDob(sdf.parse("2002-01-03"));
		System.out.println("dob is :" + sdf.format(p.getDob()));
	
		p.setAddress("indore");
		System.out.println( "address is :"+ p.getAddress());
		
	}
}
