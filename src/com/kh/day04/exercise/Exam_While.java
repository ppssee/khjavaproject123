package com.kh.day04.exercise;

public class Exam_While {

	public static void main(String[] args) {
		// while���� �̿��Ͽ� 1 ~ 100 ������ Ȧ���� ���� ����Ͻÿ�.
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
