package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteStr {     // 문자기반 출력스트림 핵심
	public static void main(String[] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/iostream/filewriter.txt");
			String data = "오라클이 제일 쉬웠어요";
			
			writer.write(data);
			writer.flush();
			System.out.println("동작완료");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
