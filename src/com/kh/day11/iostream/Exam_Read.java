package com.kh.day11.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String[] args) {
		InputStream is = null;	

		try {
			is = new FileInputStream("src/iostream/inputStream.txt");     //   이 클래스를 사용하려면
			int readByte;
			
//			while((readByte = is.read()) != -1) {
//				readByte = is.read();
//				System.out.print((char)readByte);
//				
//			}
			while(true) {
				readByte = is.read();
				
				if(readByte == -1) break;	// read()는 파일 끝을 만나면 -1 반환.
				System.out.print((char)readByte);
			}
			
			
		} catch (FileNotFoundException e) {   //   반드시 try~catch 해줘야하는 Exception
			e.printStackTrace();			  //   checked Exception
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
}
