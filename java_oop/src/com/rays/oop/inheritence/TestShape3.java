package com.rays.oop.inheritence;

public class TestShape3 {

	public static void main(String[] args) {
		 
		Triangle t = new Triangle();
		t.setBase(2);
		t.setHight(2);
        t.setColour("orange");
        t.setBorderwidth(2);
        
        System.out.println("base :"+t.getBase());
        System.out.println("hight :"+t.getHight());
        System.out.println("colour :"+t.getColour());
        System.out.println("borderwidthc:"+t.getBorderwidth());
        System.out.println("area of triangle :"+t.area());
	}

}
