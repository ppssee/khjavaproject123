package com.kh.day04.exercise;

import java.util.Scanner;

public class Exam_DoWhile {

	public static void main(String[] args) {
		// 입력한 수가 -1이 될때까지 ~~~~하시오.
		int num=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
		}while(num!=-1);
		
	}

}
