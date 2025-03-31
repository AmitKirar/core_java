package com.rays.oop.inheritence;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestDoctor {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		 Doctor d = new Doctor();
		 d.setName("lucky");
		 System.out.println(d.getName());
		 d.setAddress("gwalior");
		 System.out.println(d.getAddress());
		 d.setDateofbirth(sdf.parse("2002-09-09"));
		 System.out.println(sdf.format(d.getDateofbirth()));

	}

}
