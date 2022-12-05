package com.kh.day09.point;

public class ColorPointEx {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(3,4, "red");
//		cp.set(3, 4);  			// Point의 set() 호출
//		cp.setColor("red");		// ColorPoint의 setColor() 호출
		
		
		cp.showColorPoint();	// 컬러와 좌표 출력
	}
}
