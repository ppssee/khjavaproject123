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
		OutputStream os = null;		// ����Ʈ ��� ��½�Ʈ��.
		InputStream is = null;
		
		try {		// Ŭ���̾�Ʈ  // 
			System.out.println("�����û");
			socket = new Socket("127.0.0.1", 4885);
			System.out.println("���Ἲ��");
			
			////////////////// ������ ������ ////////////////
			byte[] buf = null;
			String message = "";
			os = socket.getOutputStream();
			message = "Hello Server";
			buf = message.getBytes();
			os.write(buf);
			os.flush();
			System.out.println("������ ���� �Ϸ�");
			
            /////////////////// ������ �ޱ� ///////////////////////
			buf = new byte[100];		     	// 1. �޾ƿ� ũ���� ����Ʈ�迭 ����
			is = socket.getInputStream(); 		// 2. �迭�� ũ�⸸ŭ �о��.
			int readByteNo = is.read(buf);    
			message = new String(buf, 0, readByteNo);
			System.out.println("������ �ޱ� ���� : " + message);
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
