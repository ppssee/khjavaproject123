package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar { 	 
	public static void main(String[] args) {
		
		Reader reader = null;
		
		try {
			reader = new FileReader("src/iostream/filereader.txt");
			char[] cbuf = new char[2];
			int readCharNo;
			String data = "";
			
			while(true) {
				readCharNo = reader.read(cbuf);	  // �������� cbuf�� ����
				                                  // readCharNo���� ���� ������ ��.
				if(readCharNo == -1) break;		  // ���� ���� ������ ���Ͷ�.
				data += new String(cbuf, 0, readCharNo);
			}
			
			System.out.print(data);
			
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
