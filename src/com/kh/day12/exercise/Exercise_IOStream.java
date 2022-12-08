package com.kh.day12.exercise;

import java.io.*;
import java.util.Scanner;
public class Exercise_IOStream {    // 이미지 파일 읽은 후 복사하기.
	// c:\\img\\moomeokpan.png   -> D:\\moomeok.png
	
	InputStream is = null;
	OutputStream os = null;
	
	Reader reader = null;
	Writer writer = null;
	
	Scanner sc = null;
	
	public void fileCopy() {  		// 이미지 파일 복사.
		try {
			is = new FileInputStream("c:\\img\\moomeokpan.png");
			os = new FileOutputStream("D:\\moomeok.png");
			
		
			byte[] readBytes = new byte[100];    
			int dataNo; 
			while((dataNo = is.read(readBytes)) != -1) {  // 파일 읽기 성공.
				os.write(readBytes, 0, dataNo);    // 0번부터 읽은 개수만큼만.
			}
			System.out.println("복사 완료.");
			
		}
		
		  catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void memoFileMake() {    // 텍스트 파일 생성과 내용 입력하기.
		/*
		 * 저장할 파일명 입력 : khtext.txt
		 * 'khtext.txt'' 파일에 저장될 내용 입력 :
		 * 종료는 exit
		 * 1 : 1111
		 * 2 : text input
		 * 3 : good
		 * 4 : gogogo
		 * 5 : exit
		 * 파일 저장 완료 (exit는 제외하고 저장)
		 * 
		 */

		try {
			sc = new Scanner(System.in);
			System.out.print("저장할 파일명 입력 : ");
			String filename = sc.nextLine();
			writer = new FileWriter("src/iostream/"+filename);
			
			System.out.println("'"+ filename + "'" + " 파일에 저장될 내용 입력 : ");
			System.out.println("종료는 exit");
			
			int i = 1;
			while(true) {
				System.out.print(i + " : ");
				String text = sc.nextLine() + "\n";
				if("exit\n".equals(text)) break;
				writer.write(text);
				i++; 
			}
			
			System.out.println("파일 저장 완료");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
		
		
}
