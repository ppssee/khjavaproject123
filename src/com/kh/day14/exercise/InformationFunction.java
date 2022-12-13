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
		System.out.println("1. 정보입력");
		System.out.println("2. 정보출력");
		System.out.println("3. 정보저장");
		System.out.println("4. 정보불러오기");
		System.out.println("0. 종료");
		int select = sc.nextInt();
		return select;
	}
	
	public void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		info.setName(sc.next());
		System.out.print("나이 입력 : ");
		info.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("주소 입력 : ");
		info.setAddress(sc.nextLine());
		
	}
	
	public void print() {
		System.out.println("====== 정보 출력 ======");
		System.out.println("이름 : " + info.getName() );
		System.out.println("나이 : " + info.getAge());
		System.out.println("주소 : " + info.getAddress());
		System.out.println("====== ======= ======== ");
	}
	
	public void save() {
		String result = info.getName()+ "/" + info.getAge()+ "/" +info.getAddress();
		try {
			Writer writer = new FileWriter("src/iostream/"+info.getName()+".txt");
			writer.write(result);
			writer.flush();
			System.out.println("저장완료되었습니다.");
			System.out.println("=== === === === === ===");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void load() {
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명 입력 : ");
		String fileName = sc.nextLine();
		
		try {
			Reader reader = new FileReader("src/iostream/"+fileName+".txt");
			BufferedReader br = new BufferedReader(reader);
			String a = br.readLine();
			StringTokenizer st = new StringTokenizer(a, "/");
			info.setName(st.nextToken());
			info.setAge(Integer.parseInt(st.nextToken()));
			info.setAddress(st.nextToken());
			
			System.out.println("로드가 완료되었습니다!!");
			System.out.println("정보 출력 가능합니다. 2번을 눌러주세요");
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
