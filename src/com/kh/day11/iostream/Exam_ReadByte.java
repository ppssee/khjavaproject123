package com.kh.day11.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("src/iostream/inputStream.txt");
			int readByteNo;
			String data = "";

			byte[] readBytes = new byte[2]; 	// [3] ��� is.available() ����ϸ� �� ���� �� �����.	

			while((readByteNo = is.read(readBytes)) != -1) {
				//	readByteNo = is.read(readBytes); 	//  readBytes�� ���� ��
				
				data += new String(readBytes, 0, readByteNo);  // String(Byte[] byte, int offset, int length)
				// ���ڿ�����( ����Ʈ�迭, ������ġ, ���� )
			}
			System.out.print(data);

			/////////////////////////////////////
//			byte[] readBytes = new byte[is.available()]; 	
//
//			while((readByteNo = is.read(readBytes)) != -1) {
//				data = new String(readBytes, 0, readByteNo);
//			}
//
//			System.out.print(data);



			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
