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
			os.write(data, 2, 4);    // data 배열에서 2번째 인덱스부터 길이4 출력 2,3,4,5  
			os.flush();
			System.out.println("write완료!!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
