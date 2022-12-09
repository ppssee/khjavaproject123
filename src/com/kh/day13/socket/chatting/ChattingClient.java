package com.kh.day13.socket.chatting;

import java.net.*;
import java.util.Scanner;
import java.io.*;
public class ChattingClient {

	public static void main(String[] args) {
		// ������ �������Դϴ�.
		// ä�ü����� �����Ͽ����ϴ�.
		// �������� ä���� �����մϴ�.
		// ����(���) : ����
		// Ŭ���̾�Ʈ(��) : �׳�
		
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 8507;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("������ �������Դϴ�...");
			socket = new Socket(address, port);
			System.out.println("ä�ü����� �����Ͽ����ϴ�.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("�������� ä���� �����մϴ�...");
			
			while(true) {
				// �ޱ�
				String recvMsg = dis.readUTF();
				System.out.println("����(���) : " + recvMsg);
				
				// ������
				System.out.print("Ŭ���̾�Ʈ(��) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
