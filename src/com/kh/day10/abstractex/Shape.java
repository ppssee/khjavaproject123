package com.kh.day10.abstractex;

class Line extends Shape{

	@Override
	public void draw() {
		
	}
	
	
}

public abstract class Shape {
	public Shape() {}
	public void paint()	{}
	abstract public void draw();
	
	
}
