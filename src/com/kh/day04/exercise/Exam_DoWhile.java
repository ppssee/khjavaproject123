package com.kh.day04.exercise;

import java.util.Scanner;

public class Exam_DoWhile {

	public static void main(String[] args) {
		// �Է��� ���� -1�� �ɶ����� ~~~~�Ͻÿ�.
		int num=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("���� �Է� : ");
			num = sc.nextInt();
		}while(num!=-1);
		
	}

}
