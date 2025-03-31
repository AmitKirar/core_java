package com.rays.oop.inheritence;

public class TestShape2 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();

		r.setLength(2);
		r.setWidth(2);
		r.setColour("green");
		r.setBorderwidth(2);

		System.out.println("length :" + r.getLength());
		System.out.println(" width :" + r.getWidth());
		System.out.println( "colour:" + r.getColour());
		System.out.println("borderWidth:" + r.borderwidth);
		System.out.println( "area of recatangle:" + r.area());
	}

}
