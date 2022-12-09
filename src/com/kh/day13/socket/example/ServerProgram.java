package com.kh.day13.socket.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		InputStream is = null; 		// 바이트 기반 입력스트림.
		OutputStream os = null;
		
		try {
			System.out.println("연결 기다림...");
			serverSocket = new ServerSocket(4885);
			Socket socket = serverSocket.accept();
			System.out.println("연결 수락됨!!");
			
			////////////////데이터 받기 /////////////////////
			byte[] bytes =  new byte[100];
			is = socket.getInputStream();
			int readByteNo = is.read(bytes);
			String message = new String(bytes, 0 ,readByteNo);
			System.out.println("데이터 받기 성공: " + message);
			///////////////////////////////////////////////
			
			////////////////데이터 보내기 ////////////////
			os = socket.getOutputStream();       // 1. os = socket.getOutputStream()
			message = "Hello Server";			 // 2. 보낼 문자열을 바이트로 자른다.
			bytes = message.getBytes();			 // 3. 바이트 배열을 보낸다.
			os.write(bytes);
			os.flush();
			System.out.println("데이터 전송 완료");
			//////////////////////////////////////////////
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
