package com.kh.day04.exercise;

import java.util.Scanner;

public class Excercise_For4 {

	public static void main(String[] args) {
		// ������ �ϳ� �Է¹޾Ƽ� �� ���� 1~9���϶���
		// �� ���� �������� ����ϼ���.
		// �� ������ ���� ������ "1~9 ������ ����� �Է��Ͽ��� �մϴ�"���

		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���:");
		int num = sc.nextInt();

		if(1 <= num && num <= 9 ) {

			for(int i=1; i<=9; i++) {
				System.out.println(num + " * " + i + " = " + num*i);
			}

			}
			else {
				System.out.println("1~9 ������ ����� �Է��Ͽ��� �մϴ�.");
			}

		}

	}
