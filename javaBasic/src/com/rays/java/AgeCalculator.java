package com.rays.java;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
         LocalDate yourdob = LocalDate.of(2002, 01, 03);
         System.out.println("todaydate ="+ now);
         System.out.println("youdob ="+ yourdob);
		 Period between = Period.between(yourdob, now);
		 System.out.println("your age=" + between.getYears());
		
		
	}

}
