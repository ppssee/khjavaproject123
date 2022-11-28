package com.kh.day04.exercise;

public class Exercise_For1 {

	public static void main(String[] args) {
		// 1 ~ 10 누적합
		int sum = 0;
		for( int i = 1; i<= 10; i++) {
			sum = i + sum;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
	}

}
