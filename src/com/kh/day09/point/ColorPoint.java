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
	public void showColorPoint() {   // ��, ��ǥ ���
		System.out.println(color);
		showPoint();  // point Ŭ������ showPoint() ȣ��
	}
	
	
	
	
}
