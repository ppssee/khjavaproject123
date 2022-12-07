package com.kh.day11.wrapperex;
public class Exam_Wrapper {
	public static void main(String[] args) {
		
		Integer a = Integer.valueOf(30);
		int b = a.intValue();
		
		System.out.println(Character.toLowerCase('A'));
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1)){        // c1이 숫자이면 true
			System.out.println(c1 + "은 숫자 ");
		}
		if(Character.isAlphabetic(c2)) {	// c2가 문자이면 true
			System.out.println(c1 + "는 영문자 ");
		}
		
		
		
		
	}
}
