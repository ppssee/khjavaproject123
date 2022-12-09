package com.kh.day13.socket.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		InputStream is = null; 		// ����Ʈ ��� �Է½�Ʈ��.
		OutputStream os = null;
		
		try {
			System.out.println("���� ��ٸ�...");
			serverSocket = new ServerSocket(4885);
			Socket socket = serverSocket.accept();
			System.out.println("���� ������!!");
			
			////////////////������ �ޱ� /////////////////////
			byte[] bytes =  new byte[100];
			is = socket.getInputStream();
			int readByteNo = is.read(bytes);
			String message = new String(bytes, 0 ,readByteNo);
			System.out.println("������ �ޱ� ����: " + message);
			///////////////////////////////////////////////
			
			////////////////������ ������ ////////////////
			os = socket.getOutputStream();       // 1. os = socket.getOutputStream()
			message = "Hello Server";			 // 2. ���� ���ڿ��� ����Ʈ�� �ڸ���.
			bytes = message.getBytes();			 // 3. ����Ʈ �迭�� ������.
			os.write(bytes);
			os.flush();
			System.out.println("������ ���� �Ϸ�");
			//////////////////////////////////////////////
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
