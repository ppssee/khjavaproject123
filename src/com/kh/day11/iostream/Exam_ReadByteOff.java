package com.kh.day11.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByteOff {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("src/iostream/inputStream.txt");			
			int readByteNo;
			byte[] readBytes = new byte[8];
			
			readByteNo = is.read(readBytes, 2, 3);

			
			for(int i =0; i< readBytes.length; i++) {
				System.out.print(readBytes[i]);
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
