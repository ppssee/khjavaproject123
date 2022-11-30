package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {

	public static void main(String[] args) {

		/*
		 * ====== ���� �޴� ======= 
		 * 1. �����Է�
		 * 2. �������
		 * 3. ����
		 * ���� : 1
		 * 
		 * ====== ���� �Է� =======
		 * ���� : 50
		 * ���� : 40
		 * ���� : 30
		 * 
		 * 
		 * ====== ���� �޴� =======
		 * 1. �����Է�
		 * 2. �������
		 * 3. ����
		 * ���� : 2
		 * 
		 * ====== ���� ��� ======
		 * ���� : 50
		 * ���� : 40
		 * ���� : 30
		 * 
		 * ���� : 120
		 * ��� : 40.00
		 * 
		 * ====== ���� �޴� =======
		 * 1. �����Է�
		 * 2. �������
		 * 3. ����
		 * ���� : 3 
		 * 
		 * Good Bye~
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int korean = 0, eng = 0 , math = 0;
		boolean is = true;

		ESCAPE :
		while(true) {

			int num = 0;
			System.out.println("====== ���� �޴� ======");
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ����");
			System.out.print("���� : ");
			System.out.println();

			num = sc.nextInt();

			switch(num) {

			case 1:
				System.out.println("====== ���� �Է� ======");
				System.out.print("���� : ");
				korean = sc.nextInt();
				System.out.print("���� : ");
				eng = sc.nextInt();
				System.out.print("���� : ");
				math = sc.nextInt();
				System.out.println();
				break;

			case 2:
				int sum = korean + eng + math;
				double avg = (double)sum/3; 
				System.out.println("====== ���� ��� ======");
				System.out.println("���� : " + korean);
				System.out.println("���� : " + eng);
				System.out.println("���� : " + math);
				System.out.println("");
				System.out.println("���� : " + sum);
				System.out.printf("��� : %.2f \n", avg);
				System.out.println();
				break;
			case 3:
				System.out.println("Good Bye~");
				break ESCAPE;

			}


		}
	}

}