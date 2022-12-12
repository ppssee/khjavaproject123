package com.kh.day14.socket.calculator;

import java.io.*;
import java.net.*;
import java.util.*;

public class CalculatorClient {

	public static void main(String[] args) {
		String address = "127.0.0.1"; 
		int port = 8989;
		
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);

		try {
			Socket socket = new Socket(address, port);
			System.out.println("������ ����Ǿ����ϴ�.");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);

			// ������
			// ���� (��ĭ���� ��� �Է�, �� 24 + 42) >> 12 + 1 
			// ��� ���: 13
			while(true) {
				System.out.print("(��ĭ���� ��� �Է�, �� 24 + 42) >>");
				String sendMsg = sc.nextLine();
				
				dos.writeUTF(sendMsg);
				if(sendMsg.equalsIgnoreCase("bye")) {
					System.out.println("�����Ͽ����ϴ�.");
					break;
				}
				
				// �ޱ�
				
				String recvMsg = dis.readUTF();
				if(recvMsg.equalsIgnoreCase("end")) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					continue;
				}
				System.out.println(recvMsg);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
