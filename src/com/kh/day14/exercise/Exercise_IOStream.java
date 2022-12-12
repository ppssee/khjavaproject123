package com.kh.day14.exercise;

import java.io.*;
import java.util.*;


public class Exercise_IOStream {
	
	static String name = "";
	static int age = 0;
	static String address ="";
	
	public static void main(String[] args) {
//		1. 정보입력
//		2. 정보출력
//		3. 정보저장(save)
//		4. 정보불러오기(load)
//		0.종료
//		메뉴 입력: 1 
//		
//		이름 입력 : 일용자
//		나이 입력 : 33
//		주소 입력 : 서울시 종로구 
//		
//		메뉴 입력: 2
//		이름 : 일용자
//		나이 : 33
//		주소 : 서울시 종로구
//		
//		메뉴 입력: 3
//		파일에 저장 후 파일을 열어보면
//      단, 파일의 이름은 이름으로한다. 
//		일용자.txt -> 일용자/33/서울시 종로구
//		이용자.txt -> 이용자/23/서울시 중구
//		삼용자.txt -> 삼용자/11/서울시 서대문구		
		
//		메뉴 입력: 4
//		파일의 제목을 입력하여 로드한 후에
//		2번을 선택하면 정보가 출력됨.
		Scanner sc = new Scanner(System.in);

		
		
		Exit :
		while(true) {
			System.out.println("1. 정보입력");
			System.out.println("2. 정보출력");
			System.out.println("3. 정보저장");
			System.out.println("4. 정보불러오기");
			System.out.println("0. 종료");
			System.out.print("메뉴 입력: ");
			int num = sc.nextInt();
			
			switch(num){
				case 1: input(); break;
					
				case 2: output(); break;
				
				case 3: save(); break;
				
				case 4: load(); break;
				
				case 0: break Exit;
				
				default : System.out.println("잘못 입력하셨습니다.");break;
					
			}
			
			
		}
		
		
	}

	static void input() { 
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름 입력 : ");
			name = sc.nextLine();
			System.out.print("나이 입력 : ");
			age = sc.nextInt();
			System.out.print("주소 입력 : ");
			sc.nextLine();
			address = sc.nextLine();
			
//			이름 입력 : 일용자
//			나이 입력 : 33
//			주소 입력 : 서울시 종로구 
			
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

