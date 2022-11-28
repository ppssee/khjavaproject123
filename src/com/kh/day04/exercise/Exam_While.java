package com.kh.day04.exercise;

public class Exam_While {

	public static void main(String[] args) {
		// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
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
}
