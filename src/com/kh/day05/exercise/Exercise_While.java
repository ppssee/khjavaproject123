package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_While {

	public void exercise1() {
		int sum = 0;
		int i = 1;
		while(i<=100) {
			if(i%2 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);

	}
	
	
	public void exercise2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요:");
		int num = sc.nextInt();


		if(1 <= num && num <= 9 ) {
			int i = 1;
			while(i<=9) {
				System.out.println(num + " * " + i + " = " + num*i);
				i++;
			}

		}
		else {
			System.out.println("1~9 사이의 양수를 입력하여야 합니다.");
		}
	} //


	public void exercise3() {
		Scanner sc = new Scanner(System.in);

		int sum = 0;

		while(true) {
			System.out.print("정수 하나 입력 : ");
			int num = sc.nextInt();

			if(num == -1) break;

			sum += num;
		}
		System.out.println("입력하신 수의 합은 : " + sum);

	} //

}
