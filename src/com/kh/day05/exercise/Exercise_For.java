package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_For {

	public void exercise1() {

		int sum = 0;
		for( int i = 1; i<= 10; i++) {
			sum = i + sum;
		}
		System.out.println("1부터 10까지의 합 : " + sum);

	}

	public void exercise2() {

		int sum = 0;
		for( int i = 1; i<= 10; i++) {
			sum = i + sum;
		}
		System.out.println("1부터 10까지의 합 : " + sum);

	}

	public void exercise3()	{

		for(int i =1; i<10; i++) {
			System.out.println("2 * " + i + " = " + 2*i);
		}

	}

	public void exercise4()	{
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요:");
		int num = sc.nextInt();

		if(1 <= num && num <= 9 ) {

			for(int i=1; i<=9; i++) {
				System.out.println(num + " * " + i + " = " + num*i);
			}

		}
		else {
			System.out.println("1~9 사이의 양수를 입력하여야 합니다.");
		}

	}



}
