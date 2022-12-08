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

			byte[] readBytes = new byte[2]; 	// [3] 대신 is.available() 사용하면 총 길이 값 저장됨.	

			while((readByteNo = is.read(readBytes)) != -1) {
				//	readByteNo = is.read(readBytes); 	//  readBytes의 길이 값
				
				data += new String(readBytes, 0, readByteNo);  // String(Byte[] byte, int offset, int length)
				// 문자열생성( 바이트배열, 시작위치, 길이 )
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
