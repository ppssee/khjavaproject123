package com.kh.day07.oop;

public class Circle {  

	public int radius;
	public String name;
	
	public Circle() {
		this.radius = 1;
		this.name = "¿ø";
	}
	
	public double getArea() {
		double area = 3.14*radius*radius;
		return area;
	}
	
}
