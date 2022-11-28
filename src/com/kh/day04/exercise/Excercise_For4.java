package com.kh.day04.exercise;

import java.util.Scanner;

public class Excercise_For4 {

	public static void main(String[] args) {
		// 정수를 하나 입력받아서 그 수가 1~9수일때만
		// 그 수의 구구단을 출력하세요.
		// 단 조건이 맞지 않으면 "1~9 사이의 양수를 입력하여야 합니다"출력

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
