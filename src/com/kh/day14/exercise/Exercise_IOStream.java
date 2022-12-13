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
				default : System.out.println("1~4 값 입력.");
				}

			}


		
	}
	static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 정보입력");
		System.out.println("2. 정보출력");
		System.out.println("3. 정보저장");
		System.out.println("4. 정보불러오기");
		System.out.println("0. 종료");
		int select = sc.nextInt();
		return select;

	}
	
	static void insert() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		System.out.print("주소 입력 : ");
		sc.nextLine();
		address = sc.nextLine();
	}
	
	static void print() {
		System.out.println("====== 정보 출력 ======");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("====== ======= ======== ");
	}
	
	static void save() {
	
		Writer os = null;
		String result = name+"/"+age+"/"+address;
		
		try {
			os = new FileWriter("src/iostream/"+name+".txt");
			os.write(result);
			os.flush();
			System.out.println("저장완료되었습니다.");
			System.out.println("=== === === === === ===");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	static void load() { 
		try {
			System.out.print("파일명 입력 : ");
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

