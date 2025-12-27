package com.constructors.level1;

public class Circle {
	double radius ;
	
	Circle() {
		this(0);
		System.out.println("Default constructor is called");
	}
	Circle (double radius) {
		this.radius = radius;
		System.out.println("Parameterized constructor is called");
	}
	public void show() {
		System.out.println(radius);
	}
	
	public static void main (String [] args) {
		Circle c1 = new Circle();
		c1.show();
		Circle c2 = new Circle(20.8);
		c2.show();
	}
}
