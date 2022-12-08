package com.kh.day12.exercise;

import java.io.*;
import java.util.Scanner;
public class Exercise_IOStream {    // �̹��� ���� ���� �� �����ϱ�.
	// c:\\img\\moomeokpan.png   -> D:\\moomeok.png
	
	InputStream is = null;
	OutputStream os = null;
	
	Reader reader = null;
	Writer writer = null;
	
	Scanner sc = null;
	
	public void fileCopy() {  		// �̹��� ���� ����.
		try {
			is = new FileInputStream("c:\\img\\moomeokpan.png");
			os = new FileOutputStream("D:\\moomeok.png");
			
		
			byte[] readBytes = new byte[100];    
			int dataNo; 
			while((dataNo = is.read(readBytes)) != -1) {  // ���� �б� ����.
				os.write(readBytes, 0, dataNo);    // 0������ ���� ������ŭ��.
			}
			System.out.println("���� �Ϸ�.");
			
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
	
	public void memoFileMake() {    // �ؽ�Ʈ ���� ������ ���� �Է��ϱ�.
		/*
		 * ������ ���ϸ� �Է� : khtext.txt
		 * 'khtext.txt'' ���Ͽ� ����� ���� �Է� :
		 * ����� exit
		 * 1 : 1111
		 * 2 : text input
		 * 3 : good
		 * 4 : gogogo
		 * 5 : exit
		 * ���� ���� �Ϸ� (exit�� �����ϰ� ����)
		 * 
		 */

		try {
			sc = new Scanner(System.in);
			System.out.print("������ ���ϸ� �Է� : ");
			String filename = sc.nextLine();
			writer = new FileWriter("src/iostream/"+filename);
			
			System.out.println("'"+ filename + "'" + " ���Ͽ� ����� ���� �Է� : ");
			System.out.println("����� exit");
			
			int i = 1;
			while(true) {
				System.out.print(i + " : ");
				String text = sc.nextLine() + "\n";
				if("exit\n".equals(text)) break;
				writer.write(text);
				i++; 
			}
			
			System.out.println("���� ���� �Ϸ�");
			
			
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
