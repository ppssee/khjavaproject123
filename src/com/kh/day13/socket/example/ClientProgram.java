package com.kh.day13.socket.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProgram {

	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;		// 바이트 기반 출력스트림.
		InputStream is = null;
		
		try {		// 클라이언트  // 
			System.out.println("연결요청");
			socket = new Socket("127.0.0.1", 4885);
			System.out.println("연결성공");
			
			////////////////// 데이터 보내기 ////////////////
			byte[] buf = null;
			String message = "";
			os = socket.getOutputStream();
			message = "Hello Server";
			buf = message.getBytes();
			os.write(buf);
			os.flush();
			System.out.println("데이터 전송 완료");
			
            /////////////////// 데이터 받기 ///////////////////////
			buf = new byte[100];		     	// 1. 받아올 크기의 바이트배열 만듬
			is = socket.getInputStream(); 		// 2. 배열의 크기만큼 읽어옴.
			int readByteNo = is.read(buf);    
			message = new String(buf, 0, readByteNo);
			System.out.println("데이터 받기 성공 : " + message);
			//////////////////////////////////////////////////////
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
