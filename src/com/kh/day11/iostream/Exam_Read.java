package com.kh.day11.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String[] args) {

		try {
			InputStream is = new FileInputStream("src/iostream/inputStream.txt");     //   �� Ŭ������ ����Ϸ���
			int readByte;
			while( (readByte = is.read()) != -1 ) {   // is.read �� �ϳ��� �������� ���̻� ���� ��� -1�� ��ȯ��. �׷��ϱ� ó������ ������ ����ϰ� ���̻� ������ �ݺ����� ����.
				System.out.print((char)readByte);
				is.read();
			}
			
			
			
			
			
		} catch (FileNotFoundException e) {   //   �ݵ�� try~catch ������ϴ� Exception
			e.printStackTrace();			  //   checked Exception
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
}
