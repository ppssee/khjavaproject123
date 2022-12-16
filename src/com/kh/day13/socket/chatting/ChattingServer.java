package com.kh.day13.socket.chatting;

import java.net.*;
import java.util.Scanner;
import java.io.*;
public class ChattingServer {

	public static void main(String[] args) {
		// ä�� ������ �������Դϴ�...
		// ä�� ������ �����Ͽ����ϴ�..
		// Ŭ���̾�Ʈ�� ������ ��ٸ��� �ֽ��ϴ�.
		// Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.
		// ä���� ���۵Ǿ����ϴ�.
		// ����(��) : ����
		// Ŭ���̾�Ʈ(���) : �׳�
		
		ServerSocket serverSocket = null;
		int port = 8507;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("ä�� ������ �������Դϴ�....");
			serverSocket = new ServerSocket(port);
			Thread.sleep(2000);
			System.out.println("ä�� ������ �����Ͽ����ϴ�...");
			Thread.sleep(2000);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� �ֽ��ϴ�.");
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
			
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("ä���� ���۵Ǿ����ϴ�.");

			while(true) {
				// ������
				System.out.print("����(��) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				
				// �ޱ�
				String recvMsg = dis.readUTF();
				System.out.println("Ŭ���̾�Ʈ(���) : " + recvMsg);
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
