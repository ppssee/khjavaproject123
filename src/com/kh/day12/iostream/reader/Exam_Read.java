package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {
	public static void main(String[] args) {
		// 문자 기반 스트림
		Reader reader = null;
		try {
			reader = new FileReader("src/iostream/filereader.txt");
			while(true) {
				int readData = reader.read();
				if(readData == -1 ) break;
				System.out.print((char)readData);
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		} // finally 종료.
		
	}
}
