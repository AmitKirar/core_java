package com.rays.oop.encapsulation;

import java.util.Scanner;

public class Automobile {
	private String colour;
	private int speed;
	private String make;

	public String getColour() {
		return this.colour;
	}

	public void setcolour(String colour) {
		this.colour = colour;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;

	}

	public void carBreak() {
		System.out.println("Stop Car");
	}

	public void carAccelarator() {
		System.out.println("push accelerator car run high");

	}

	public void changeGear(int gear) {

		switch (gear) {
		case 1:
			System.out.println("Speed of car is 20km/h in " + gear + " gear");
			break;

		case 2:
			System.out.println("Speed of car is 40km/h in " + gear + " gear");
			break;

		case 3:
			System.out.println("Speed of car is 60km/h in " + gear + " gear");
			break;
			
		case 4:
			System.out.println("Speed of car is 80km/h in " + gear + " gear");
			break;
			
		case 5:
			System.out.println("Speed of car is 120km/h in " + gear + " gear");
			break;
			
		case 6:
			System.out.println("Speed of car is 150km/h in " + gear + " gear");
			break;
			
		}

	}
}
