package com.kh.day06.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {

	public void practice1() {  //  ����ó��-> 0���� ���� ���.

		while(true) {
			try {

				Scanner sc = new Scanner(System.in);
				System.out.print("���� �ϳ� �Է����ּ���: ");
				int num1 = sc.nextInt();
				System.out.print("���� �ϳ� �� �Է����ּ���: ");
				int num2 = sc.nextInt();
				System.out.println("�����帱�Կ� ^^");

				int result = num1 / num2;

				System.out.println("���� " + result + "�Դϴ�~");
				break;
			} catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
				
				
			}
		}

	}

	public void practice2() {
		//		���� 3���� �Է��ϼ���
		//		0>>5
		//		1>>R
		//		������ �ƴմϴ�. �ٽ� �Է��ϼ���!
		//		1>>4
		//		2>>6
		//		���� 15

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		for(int i = 0; i<3; i++) {
			System.out.print(i + ">>");
			try {	
				num = sc.nextInt();                 // �Է��� �޼��尡 ����� �� ���ۿ� ������ �ִ��� Ȯ���ϰ� �׿� �°� ������. ó���̴� �ƹ��͵� ����.
			}catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�.");
				sc.next(); // �Է��� R�� ����         // ���۸� ����� ������� ���ۿ� �״�� ���ڰ� �����ֱ� ������ �ݺ��Ҷ����� ���ܰ� �߻���.
				i--;	   // 1�� �ٽ� ������ -1����, i++�� ����
				continue;   // sum+= num; �� ��ŵ.
			}
			sum += num;
		}
		System.out.println("���� " +sum);
	}
}
