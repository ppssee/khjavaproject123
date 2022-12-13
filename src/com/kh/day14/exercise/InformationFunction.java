package com.kh.day14.exercise;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InformationFunction {

	Information info = null;
	
	public InformationFunction(){
		info = new Information();
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ��������");
		System.out.println("4. �����ҷ�����");
		System.out.println("0. ����");
		int select = sc.nextInt();
		return select;
	}
	
	public void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� �Է� : ");
		info.setName(sc.next());
		System.out.print("���� �Է� : ");
		info.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("�ּ� �Է� : ");
		info.setAddress(sc.nextLine());
		
	}
	
	public void print() {
		System.out.println("====== ���� ��� ======");
		System.out.println("�̸� : " + info.getName() );
		System.out.println("���� : " + info.getAge());
		System.out.println("�ּ� : " + info.getAddress());
		System.out.println("====== ======= ======== ");
	}
	
	public void save() {
		String result = info.getName()+ "/" + info.getAge()+ "/" +info.getAddress();
		try {
			Writer writer = new FileWriter("src/iostream/"+info.getName()+".txt");
			writer.write(result);
			writer.flush();
			System.out.println("����Ϸ�Ǿ����ϴ�.");
			System.out.println("=== === === === === ===");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void load() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϸ� �Է� : ");
		String fileName = sc.nextLine();
		
		try {
			Reader reader = new FileReader("src/iostream/"+fileName+".txt");
			BufferedReader br = new BufferedReader(reader);
			String a = br.readLine();
			StringTokenizer st = new StringTokenizer(a, "/");
			info.setName(st.nextToken());
			info.setAge(Integer.parseInt(st.nextToken()));
			info.setAddress(st.nextToken());
			
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
