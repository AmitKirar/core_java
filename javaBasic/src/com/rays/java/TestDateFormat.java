package com.rays.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {

	public static void main(String[] args) throws ParseException {
		
     Date date = new Date();
     System.out.println( "date before format =" + date);
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
     System.out.println( " date after format =" + sdf.format(date));
     
     System.out.println("--------------");
     String dob = " 03/01/2002";
     Date mydob = sdf.parse(dob);
     System.out.println("mydob =" +mydob);
		
		
		

	}

}
