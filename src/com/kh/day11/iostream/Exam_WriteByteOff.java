package com.kh.day11.iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByteOff {
	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("src/iostream/outputStream.txt");
			byte[] data = "JaVAscrpit".getBytes();
			os.write(data, 2, 4);    // data �迭���� 2��° �ε������� ����4 ��� 2,3,4,5  
			os.flush();
			System.out.println("write�Ϸ�!!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
