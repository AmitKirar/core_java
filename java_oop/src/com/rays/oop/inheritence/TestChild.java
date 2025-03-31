package com.rays.oop.inheritence;

public class TestChild {

	public static void main(String[] args) {
		Child c1 = new Child();
		c1.setfood("orange");
		c1.setproperty("house");
		c1.setgame("cricket");
		
		System.out.println("food is orange "+ c1.getfood());
		System.out.println("property is "+ c1.getproperty());
		System.out.println( "gameis "+ c1.getgame());
	}
 
}
