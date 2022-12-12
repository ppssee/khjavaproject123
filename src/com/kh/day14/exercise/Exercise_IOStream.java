package com.kh.day14.exercise;

import java.io.*;
import java.util.*;


public class Exercise_IOStream {
	
	static String name = "";
	static int age = 0;
	static String address ="";
	
	public static void main(String[] args) {
//		1. �����Է�
//		2. �������
//		3. ��������(save)
//		4. �����ҷ�����(load)
//		0.����
//		�޴� �Է�: 1 
//		
//		�̸� �Է� : �Ͽ���
//		���� �Է� : 33
//		�ּ� �Է� : ����� ���α� 
//		
//		�޴� �Է�: 2
//		�̸� : �Ͽ���
//		���� : 33
//		�ּ� : ����� ���α�
//		
//		�޴� �Է�: 3
//		���Ͽ� ���� �� ������ �����
//      ��, ������ �̸��� �̸������Ѵ�. 
//		�Ͽ���.txt -> �Ͽ���/33/����� ���α�
//		�̿���.txt -> �̿���/23/����� �߱�
//		�����.txt -> �����/11/����� ���빮��		
		
//		�޴� �Է�: 4
//		������ ������ �Է��Ͽ� �ε��� �Ŀ�
//		2���� �����ϸ� ������ ��µ�.
		Scanner sc = new Scanner(System.in);

		
		
		Exit :
		while(true) {
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ��������");
			System.out.println("4. �����ҷ�����");
			System.out.println("0. ����");
			System.out.print("�޴� �Է�: ");
			int num = sc.nextInt();
			
			switch(num){
				case 1: input(); break;
					
				case 2: output(); break;
				
				case 3: save(); break;
				
				case 4: load(); break;
				
				case 0: break Exit;
				
				default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");break;
					
			}
			
			
		}
		
		
	}

	static void input() { 
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�̸� �Է� : ");
			name = sc.nextLine();
			System.out.print("���� �Է� : ");
			age = sc.nextInt();
			System.out.print("�ּ� �Է� : ");
			sc.nextLine();
			address = sc.nextLine();
			
//			�̸� �Է� : �Ͽ���
//			���� �Է� : 33
//			�ּ� �Է� : ����� ���α� 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	static void output() {
		
	}
	
	static void save() {
		Writer writer = null;
		String result = name+"/"+age+"/"+address;
		
		try {
			writer = new FileWriter("src/iostream/"+name+".txt");
			writer.write(result);
			writer.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	static void load() { }
}

