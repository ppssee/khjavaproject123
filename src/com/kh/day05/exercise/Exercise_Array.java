package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_Array {

	public void exercise1() {
		// 길이가 100인 배열을 선언하고 1부터 100까지의 값을
		// 순서대로 넣어 그 값을 출력하는 코드를 작성.

		int[] nums = new int[100];

		for(int i=0; i<100; i++) {
			nums[i] = i+1;
			System.out.print(nums[i] + " ");
		}



	}

	public void exercise2() {
		// 길이가 5인 String 배열을 선언하고
		// "딸기", "복숭아", "키위", "사과", "바나나"로
		// 초기화 후, for문 활용해 바나나가 있으면 바나나를 출력.

		String[] fruit = new String[5];
		fruit[0]="딸기";
		fruit[1]="복숭아";
		fruit[2]="키위";
		fruit[3]="사과";
		fruit[4]="바나나";

		String[] fruitGoods = {"딸기", "사과", "키위", "바나나", "사과"};
		for(int i=0; i<fruit.length; i++) {

			if(fruit[i] == "바나나") {
				System.out.println("바나나");
			}

		}


	}

	public void exercise3() {
		// 양의 정수 5개를 입력받아 배열에 저장하고
		// 입력받은 값들의 평균을 구하는 프로그램.

		Scanner sc = new Scanner(System.in);
		int[] arrs = new int[5];
		int sum = 0;

		System.out.println("양의 정수 5개를 입력하세요: ");

		for(int i=0; i<5; i++) {
			arrs[i] = sc.nextInt();
			sum += arrs[i];
		}
		System.out.println("평균: " + (double)sum/arrs.length + "입니다.");


	}

	public void exercise4() {
		// 양의 정수 5개를 입력받아 배열에 저장하고
		// 제일 큰 수를 출력하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);
		int[] arrs = new int[5];
		int max = 0;

		System.out.println("양의 정수 5개를 입력하세요: ");

		for(int i=0; i<5; i++) {
			arrs[i] = sc.nextInt();
			if(max < arrs[i]) {
				max = arrs[i];
			}
		}


		System.out.println("가장 큰 수: " + max + "입니다.");

	}

	public void exercise5()	{
		/*
		 * 사용자에게 주민번호를 입력 받은 후
		 * 성별 자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오
		 * 210618-1124600 -> 210618-1******
		 * 200518-3233920 -> 200518-3******
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		char[] origin = new char[14];
		
		System.out.print("주민번호를 입력( - 포함 ) : ");  // 941224-1012218
		String memberNum = sc.next();
		
		for(int i=0; i<origin.length; i++) {
			origin[i] = memberNum.charAt(i);
		}
		
		char[] copy = new char[14];
		
		for(int i=0; i<origin.length; i++) {
			if(i < 8) {
				copy[i] = origin[i];
			}
			else {
				copy[i] = '*';
			}
			System.out.print(copy[i]);
		}
	

	}

	public void exercise6()	{   // forEach문 , 인덱스 값으로 뭘 하지않고 처음부터 끝까지 반복이 필요할 때.
		int[] nums = { 1, 2, 3, 4, 5 };
		
		for (int a : nums) {
			System.out.print(a + " ");
		}
	
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+ " ");
		}
	}
	
	public void exercise7() {
		String[] fruits = { "딸기", "복숭아", " 포도", "체리", "망고"};
		for(String str : fruits) {
			System.out.print(str);
		}
	}
	


}
