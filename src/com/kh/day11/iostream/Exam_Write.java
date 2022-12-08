package com.kh.day11.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_Write {
	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("src/iostream/outputStream.txt");
			byte[] data = "Hello I/O".getBytes();
			
			for(int i=0; i<data.length; i++)
				os.write(data[i]);		
			os.flush();
			System.out.println("쓰기완료!!!");
		
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
