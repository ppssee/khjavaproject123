package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_Array {

	public void exercise1() {
		// ���̰� 100�� �迭�� �����ϰ� 1���� 100������ ����
		// ������� �־� �� ���� ����ϴ� �ڵ带 �ۼ�.

		int[] nums = new int[100];

		for(int i=0; i<100; i++) {
			nums[i] = i+1;
			System.out.print(nums[i] + " ");
		}



	}

	public void exercise2() {
		// ���̰� 5�� String �迭�� �����ϰ�
		// "����", "������", "Ű��", "���", "�ٳ���"��
		// �ʱ�ȭ ��, for�� Ȱ���� �ٳ����� ������ �ٳ����� ���.

		String[] fruit = new String[5];
		fruit[0]="����";
		fruit[1]="������";
		fruit[2]="Ű��";
		fruit[3]="���";
		fruit[4]="�ٳ���";

		String[] fruitGoods = {"����", "���", "Ű��", "�ٳ���", "���"};
		for(int i=0; i<fruit.length; i++) {

			if(fruit[i] == "�ٳ���") {
				System.out.println("�ٳ���");
			}

		}


	}

	public void exercise3() {
		// ���� ���� 5���� �Է¹޾� �迭�� �����ϰ�
		// �Է¹��� ������ ����� ���ϴ� ���α׷�.

		Scanner sc = new Scanner(System.in);
		int[] arrs = new int[5];
		int sum = 0;

		System.out.println("���� ���� 5���� �Է��ϼ���: ");

		for(int i=0; i<5; i++) {
			arrs[i] = sc.nextInt();
			sum += arrs[i];
		}
		System.out.println("���: " + (double)sum/arrs.length + "�Դϴ�.");


	}

	public void exercise4() {
		// ���� ���� 5���� �Է¹޾� �迭�� �����ϰ�
		// ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		Scanner sc = new Scanner(System.in);
		int[] arrs = new int[5];
		int max = 0;

		System.out.println("���� ���� 5���� �Է��ϼ���: ");

		for(int i=0; i<5; i++) {
			arrs[i] = sc.nextInt();
			if(max < arrs[i]) {
				max = arrs[i];
			}
		}


		System.out.println("���� ū ��: " + max + "�Դϴ�.");

	}

	public void exercise5()	{
		/*
		 * ����ڿ��� �ֹι�ȣ�� �Է� ���� ��
		 * ���� �ڸ� ���ĺ��� *�� ����Ǿ� ��µǵ��� ���α׷��� �ۼ��Ͻÿ�
		 * 210618-1124600 -> 210618-1******
		 * 200518-3233920 -> 200518-3******
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		char[] origin = new char[14];
		
		System.out.print("�ֹι�ȣ�� �Է�( - ���� ) : ");  // 941224-1012218
		String memberNum = sc.next();
		
		for(int i=0; i<origin.length; i++) {
			origin[i] = memberNum.charAt(i);
		}
		
		char[] copy = new char[14];
		
		for(int i=0; i<origin.length; i++) {
			if(i < 8) {
				copy[i] = origin[i];
			}
			else {
				copy[i] = '*';
			}
			System.out.print(copy[i]);
		}
	

	}

	public void exercise6()	{   // forEach�� , �ε��� ������ �� �����ʰ� ó������ ������ �ݺ��� �ʿ��� ��.
		int[] nums = { 1, 2, 3, 4, 5 };
		
		for (int a : nums) {
			System.out.print(a + " ");
		}
	
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+ " ");
		}
	}
	
	public void exercise7() {
		String[] fruits = { "����", "������", " ����", "ü��", "����"};
		for(String str : fruits) {
			System.out.print(str);
		}
	}
	


}
