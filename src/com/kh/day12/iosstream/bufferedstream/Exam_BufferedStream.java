package com.kh.day12.iosstream.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exam_BufferedStream {
	public static void main(String[] args) {
		// 버퍼 크기를 5로하고, 표준 출력 스트림과 연결한
		// 버퍼 출력 스트림을 생성하라!
		// C:\\text2.txt 파일을 저장된 영문 텍스트를 읽어
		// 버퍼 출력 스트림을 출력하라!!
		
		//파일 입력용
		FileReader fir = null;
		int readChar;
		try {
			fir = new FileReader("C:\\img\\kh.txt");
			// 콘솔 출력용
			BufferedOutputStream bout = new BufferedOutputStream(System.out, 5);
			while((readChar = fir.read()) != -1) {
				bout.write(readChar);
			}
			new Scanner(System.in).nextLine();   // flush 기능을 보기 위해.
			bout.flush();	// 버퍼 5개씩 출력하다 마지막 1개 버퍼 대기중인걸 방출.
			bout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		
		// 콘솔 출력용
	}
	
}
