package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {

	public static void main(String[] args) {

		/*
		 * ====== 메인 메뉴 ======= 
		 * 1. 성적입력
		 * 2. 성적출력
		 * 3. 종료
		 * 선택 : 1
		 * 
		 * ====== 성적 입력 =======
		 * 국어 : 50
		 * 영어 : 40
		 * 수학 : 30
		 * 
		 * 
		 * ====== 메인 메뉴 =======
		 * 1. 성적입력
		 * 2. 성적출력
		 * 3. 종료
		 * 선택 : 2
		 * 
		 * ====== 성적 출력 ======
		 * 국어 : 50
		 * 영어 : 40
		 * 수학 : 30
		 * 
		 * 총점 : 120
		 * 평균 : 40.00
		 * 
		 * ====== 메인 메뉴 =======
		 * 1. 성적입력
		 * 2. 성적출력
		 * 3. 종료
		 * 선택 : 3 
		 * 
		 * Good Bye~
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int korean = 0, eng = 0 , math = 0;
		boolean is = true;

		ESCAPE :
		while(true) {

			int num = 0;
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			System.out.println();

			num = sc.nextInt();

			switch(num) {

			case 1:
				System.out.println("====== 성적 입력 ======");
				System.out.print("국어 : ");
				korean = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				math = sc.nextInt();
				System.out.println();
				break;

			case 2:
				int sum = korean + eng + math;
				double avg = (double)sum/3; 
				System.out.println("====== 성적 출력 ======");
				System.out.println("국어 : " + korean);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);
				System.out.println("");
				System.out.println("총점 : " + sum);
				System.out.printf("평균 : %.2f \n", avg);
				System.out.println();
				break;
			case 3:
				System.out.println("Good Bye~");
				break ESCAPE;

			}


		}
	}

}