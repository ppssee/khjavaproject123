package com.kh.day11.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String[] args) {

		try {
			InputStream is = new FileInputStream("src/iostream/inputStream.txt");     //   이 클래스를 사용하려면
			int readByte;
			while( (readByte = is.read()) != -1 ) {   // is.read 로 하나씩 가져오다 더이상 없을 경우 -1이 반환됨. 그러니까 처음부터 끝까지 출력하고 더이상 없으면 반복하지 않음.
				System.out.print((char)readByte);
				is.read();
			}
			
			
			
			
			
		} catch (FileNotFoundException e) {   //   반드시 try~catch 해줘야하는 Exception
			e.printStackTrace();			  //   checked Exception
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
}
