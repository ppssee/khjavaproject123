package com.kh.day08.student;
import java.util.Scanner;

public class StudentFunction {
	
	Student[] students;
	
	public StudentFunction() {
		students = new Student[3];
	}
	
	public int printMenu() {
		for (int i=0; i<25; i++) System.out.println(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("======= �л� ���� Ȯ�� ���α׷� =======");
		System.out.println("1. �л� ���� �Է�");
		System.out.println("2. �л� ���� ���");
		System.out.println("3. ���� ���� Ȯ��");
		System.out.println("4. ���α׷� ����");
		System.out.print("�޴� �Է� : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<25; i++) System.out.println(); 
		for(int i = 0; i < students.length; i++) {
					        
			System.out.println("======= "+ (i+1) + "��° �л� ���� �Է� =======");
			System.out.print("�л� �̸� �Է� : ");
			String name = sc.next();
			System.out.print("1�� ���� �Է� : ");
			int firstScore = sc.nextInt();
			System.out.print("2�� ���� �Է� : ");
			int secondScore = sc.nextInt();

			students[i] = new Student();
			students[i].setName(name);
			students[i].setFirstScore(firstScore);
			students[i].setSecondScore(secondScore);

		}
	}

	public void printScore() {
		for(int i = 0; i< students.length; i++) {
			System.out.println("======= "+ (i+1) + "��° �л� ���� ��� =======");
			System.out.println(students[i].getName() + "�л��� ������");
			System.out.println("1�� ���� : " + students[i].getFirstScore() + ", 2�� ���� : " + students[i].getFirstScore() + "�Դϴ�.");
		}
		
	}
	
	public void checkPass() {
		for(int i=0; i<students.length; i++) {
			// 0. ������ ���δ� 1��, 2���� ���� �ٸ���.
			// 1. ������ ������ 40�� �̸��� ��� �������� ���� ���.  �ϳ���
			// 2. 1�������� 2�������� ����� 60���� �Ѿ���Ѵ�.
			// 3. 1�������� 2�������� ����� 60�� �̸��� ��� 60�� �̸��� ���� ���ؼ� ���򰡸� ����.
			String name = students[i].getName();
			int score1 = students[i].getFirstScore();
			int score2 = students[i].getSecondScore();
			double aver = (score1 + score2)/(double)2;
			System.out.println((i+1)+ "��°," + name +"�л��� Ȯ�ΰ��");
			
			if(aver >= 60) {
				if(score1 < 40) {
					System.out.println("1�� ���� ���� ������Դϴ�.");
				}
				else if(score2 <40) {
					System.out.println("2�� ���� ���� ������Դϴ�.");
				}
				System.out.println("����Ͽ����ϴ�.");
			}
			else {
				if(score2 < 60) {
					System.out.println("2�� ���� ���� ������Դϴ�.");
				}else if(score1 <60) {
					System.out.println("1�� ���� ���� ������Դϴ�.");
				}else {
					
				}
				
				
			}
			
			
			
			
		}  // for�� ����.
	}
	
	public void printGoodBye() {}
	
	public void printException() {}
	
}