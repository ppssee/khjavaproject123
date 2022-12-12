package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadCharOff {
	public static void main(String[] args) {

		Reader reader = null;
		
		try {
			reader = new FileReader("src/iostream/filereader.txt");
			char[] cbuf = new char[3];
			reader.read(cbuf, 1, 2);
			
			for(int i = 0; i<cbuf.length; i++) {
				System.out.print(cbuf[i]);
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
		}
		
	}

}
