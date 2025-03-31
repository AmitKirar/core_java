package com.rays.oop.inheritence;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Testbussinessmen {

	public static void main(String[] args) throws Exception {
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Bussinessmen b = new Bussinessmen();
		
		b.setName("lucky");
		System.out.println(b.getName());
		b.setAddress("indore");
		System.out.println(b.getAddress());
		
		b.setDateofbirth(sdf.parse("2002-02-03"));
		System.out.println(sdf.format(b.getDateofbirth()));
		
		
        
	}

}
