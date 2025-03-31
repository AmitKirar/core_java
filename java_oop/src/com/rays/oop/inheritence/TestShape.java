package com.rays.oop.inheritence;

public class TestShape {

	public static void main(String[] args) {
	 
		Circle c = new Circle();
		c.setColour("yellow");
        c.setBorderwidth(2);
        c.setRadius(2);
        
        System.out.println("colour :"+ c.getColour() );
        System.out.println( "borderwidth :"+ c.getBorderwidth());
        System.out.println( "radius :"+ c.getRadius());
        System.out.println( " area of circle:" + c.area());
	}

}
