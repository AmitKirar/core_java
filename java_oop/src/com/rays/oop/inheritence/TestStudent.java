package com.rays.oop.inheritence;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class TestStudent {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Student s= new Student();
		
		s.setName("monty");
		System.out.println(s.getName());
		s.setAddress("murena");
		System.out.println(s.getAddress());
		s.setRollno("12345678");
		System.out.println(s.getRollno());
		s.setMarks(4);
		System.out.println( s.getMarks());
		s.setDateofbirth(sdf.parse("2002-02-03"));
		System.out.println(sdf.format(s.getDateofbirth()));

	}

}
