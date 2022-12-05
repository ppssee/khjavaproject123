package com.kh.day09.point;

public class ColorPoint extends Point {
	private String color;
	
	ColorPoint(){}
		
	ColorPoint(int x, int y, String color){
		super(x, y);
		this.color = color;
	}
	
	
//	public void setColor(String color) {
//		this.color= color;
//	}
	public void showColorPoint() {   // 색, 좌표 출력
		System.out.println(color);
		showPoint();  // point 클래스의 showPoint() 호출
	}
	
	
	
	
}
