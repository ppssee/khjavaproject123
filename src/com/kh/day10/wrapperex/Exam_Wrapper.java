package com.kh.day10.wrapperex;

public class Exam_Wrapper {

	public static void main(String [] args) {
		Integer i = Integer.valueOf(500);
		int e = i.intValue();
		
		int d = i.intValue();
		
		Integer f = null;
		
		Character c = Character.valueOf('c');
		char ch = c.charValue();
		
		Double db = Double.valueOf(3.14);
		double dd = db.doubleValue();
		
		// 문자열을 기본 데ㅇ이터타입으로 변환
		
		int num = Integer.parseInt("123");
		System.out.println("변환된 값 : " + num);
		
		boolean isyn = Boolean.parseBoolean("true");
		double fNum = Double.parseDouble("3.14");
		
		// 기본 데이터 타입 (int , double, char) 를 문자열로 변환
		
		String sta = Integer.toString(123);
		String data3 = Double.toString(3.14);
	}
}
