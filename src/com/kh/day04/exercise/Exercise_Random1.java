package com.kh.day04.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {

	public static void main(String[] args) {
		// ���� �յ� ���߱�!!
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		while(true) {
			System.out.println("====== ���� �� �� ���߱� ======= ");
			System.out.print("���ڸ� �Է����ּ��� (1.�ո� / 2.�޸�) : ");
			int choice = sc.nextInt();

			int computer = rand.nextInt(2)+1;

			if(computer == choice) {
				System.out.println("������ϴ�.");
			}

			else if(choice ==1 || choice == 2) {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}

			else {
				System.out.println("1~2�� �Է����ּ���.");
			}

			System.out.println(computer);
			
		}
	}


}
