package com.kh.day07.oop;

public class Rectangle {

	
	

	public int width;     //너비
	public int height;    //높이
	
	public Rectangle() {}  //클래스명과 똑같은 메서드, 객체 생성, 객체 초기화
	
	public Rectangle(int width, int height) {   // 매개변수 있는 생성자.
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width*height;
	}

	
	
	
	
}
