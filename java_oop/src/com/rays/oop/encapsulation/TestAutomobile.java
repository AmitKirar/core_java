package com.rays.oop.encapsulation;

import java.util.Scanner;

public class TestAutomobile{

	public static void main(String[] args) {
		
		Automobile a = new Automobile();
		
		a.setcolour("black");
		System.out.println( "colour is " + a.getColour());
		
		a.setSpeed(50);
		System.out.println( "speed is "+ a.getSpeed());
		
		a.setMake("audi");
		System.out.println( "make is "+ a.getMake());
		
		a.carBreak();
        a.carAccelarator();
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter your gear ");
        int gear=sc.nextInt();
        a.changeGear(gear);
        
	}

}
