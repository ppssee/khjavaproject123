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

		System.out.print("������ �Է��ϼ���:");
		int num = sc.nextInt();


		if(1 <= num && num <= 9 ) {
			int i = 1;
			while(i<=9) {
				System.out.println(num + " * " + i + " = " + num*i);
				i++;
			}

		}
		else {
			System.out.println("1~9 ������ ����� �Է��Ͽ��� �մϴ�.");
		}
	} //


	public void exercise3() {
		Scanner sc = new Scanner(System.in);

		int sum = 0;

		while(true) {
			System.out.print("���� �ϳ� �Է� : ");
			int num = sc.nextInt();

			if(num == -1) break;

			sum += num;
		}
		System.out.println("�Է��Ͻ� ���� ���� : " + sum);

	} //

}
