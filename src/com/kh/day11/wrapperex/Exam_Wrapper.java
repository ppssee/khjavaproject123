package com.kh.day11.wrapperex;
public class Exam_Wrapper {
	public static void main(String[] args) {
		
		Integer a = Integer.valueOf(30);
		int b = a.intValue();
		
		System.out.println(Character.toLowerCase('A'));
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1)){        // c1�� �����̸� true
			System.out.println(c1 + "�� ���� ");
		}
		if(Character.isAlphabetic(c2)) {	// c2�� �����̸� true
			System.out.println(c1 + "�� ������ ");
		}
		
		
		
		
	}
}
