package com.kh.day14.exercise;

import java.io.*;
import java.util.*;


public class Exercise_IOStream {
	private static String name;
	private static int age;
	private static String address;

	public static void main(String[] args) {
	
		end :
			while(true){
				int choice = printMenu();
				switch(choice){
				case 1 : insert(); break;
				case 2 : print(); break;
				case 3 : save(); break;
				case 4 : load(); break;
				case 0 : break end;
				default : System.out.println("1~4 �� �Է�.");
				}

			}


		
	}
	static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ��������");
		System.out.println("4. �����ҷ�����");
		System.out.println("0. ����");
		int select = sc.nextInt();
		return select;

	}
	
	static void insert() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		name = sc.next();
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		System.out.print("�ּ� �Է� : ");
		sc.nextLine();
		address = sc.nextLine();
	}
	
	static void print() {
		System.out.println("====== ���� ��� ======");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
		System.out.println("====== ======= ======== ");
	}
	
	static void save() {
	
		Writer os = null;
		String result = name+"/"+age+"/"+address;
		
		try {
			os = new FileWriter("src/iostream/"+name+".txt");
			os.write(result);
			os.flush();
			System.out.println("����Ϸ�Ǿ����ϴ�.");
			System.out.println("=== === === === === ===");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	static void load() { 
		try {
			System.out.print("���ϸ� �Է� : ");
			BufferedReader bfReader = null;
			Scanner sc = new Scanner(System.in);
			String fileName = sc.next();
			Reader reader = new FileReader("src/iostream/" + fileName  +".txt");
			bfReader = new BufferedReader(reader);
			
			String result = bfReader.readLine();
			
			StringTokenizer st = new StringTokenizer(result, "/");
			name = st.nextToken();
			age = Integer.parseInt(st.nextToken());
			address = st.nextToken();
			
			System.out.println("�ε尡 �Ϸ�Ǿ����ϴ�!!");
			System.out.println("���� ��� �����մϴ�. 2���� �����ּ���");
			System.out.println("=== === === === === === === ===");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

