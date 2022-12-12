package com.kh.day14.socket.calculator;

import java.io.*;
import java.net.*;

public class CalculatorServer {

	public static void main(String[] args) {
		int port = 8989;
		ServerSocket serverSocket;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		
		try {
			System.out.println("���� �������Դϴ�.");
			Thread.sleep(1000);
			serverSocket = new ServerSocket(port);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� �ֽ��ϴ�..");
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� ���� �Ǿ����ϴ�.");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			// �ޱ�
			// ���� �޽��� : 12 + 1
			// ������ ������
			while(true) {
				String recvMsg = dis.readUTF();
				if(recvMsg.equalsIgnoreCase("bye")) {
					System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
					break;
				}
				
				String[] recvMsgs = recvMsg.split(" ");
				if(recvMsgs.length != 3) {
					dos.writeUTF("end");
					continue;
				}
				
				int num1 = Integer.parseInt(recvMsgs[0]);
				int num2 = Integer.parseInt(recvMsgs[2]);
				String result = "";
				switch(recvMsgs[1]) {
				case "+" : result = num1 + num2 +""; break;
				case "-" : result = num1 - num2 +""; break;
				case "*" : result = num1 * num2 +""; break;
				case "/" : result = num1 / num2 +""; break;
				default : result = "�����ڸ� �߸� �Է��ϼ̽��ϴ�"; break;
				}
				String sendMsg = "����� : " + result; 
				// ������
				dos.writeUTF(sendMsg);
				
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
	}
}
