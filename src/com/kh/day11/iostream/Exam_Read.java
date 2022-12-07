package com.kh.day11.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String[] args) {
		InputStream is = null;	

		try {
			is = new FileInputStream("src/iostream/inputStream.txt");     //   �� Ŭ������ ����Ϸ���
			int readByte;
			
//			while((readByte = is.read()) != -1) {
//				readByte = is.read();
//				System.out.print((char)readByte);
//				
//			}
			while(true) {
				readByte = is.read();
				
				if(readByte == -1) break;	// read()�� ���� ���� ������ -1 ��ȯ.
				System.out.print((char)readByte);
			}
			
			
		} catch (FileNotFoundException e) {   //   �ݵ�� try~catch ������ϴ� Exception
			e.printStackTrace();			  //   checked Exception
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
}
