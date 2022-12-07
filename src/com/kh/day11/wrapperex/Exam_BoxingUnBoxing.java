package com.kh.day11.wrapperex;

public class Exam_BoxingUnBoxing {
	public static void main(String[] args) {
	
		Integer num = Integer.valueOf(0)	;
		// BOXING
		Integer su = 100;
		
		int soo = num.intValue();
		soo = num;
		//UnBoxing
		
		
		int n = 10;
		Integer intObject = n;   // ¹Ú½Ì
		System.out.println("intOjbect : " + intObject);
		
		int m = intObject + 10;
		System.out.println("m = " + m);

		
	

	
	}
}
