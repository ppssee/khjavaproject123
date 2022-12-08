package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Write {
	public static void main(String[] args) {
		Writer writer = null;    // 문자 기반의 출력 스트림
		
		try {
			writer = new FileWriter("src/iostream/filewriter.txt");
			char[] data = "스프링&클라우드 웹 개발자 양성과정".toCharArray();
			
			for(int i=0; i < data.length; i++) {
				writer.write(data[i]);
			}
			writer.flush();
			System.out.println("쓰기 완료!");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
