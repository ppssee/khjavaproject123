package com.kh.day13.socket.chatting;

import java.net.*;
import java.util.Scanner;
import java.io.*;
public class ChattingClient {

	public static void main(String[] args) {
		// 서버에 연결중입니다.
		// 채팅서버에 접속하였습니다.
		// 서버와의 채팅을 시작합니다.
		// 서버(상대) : 하이
		// 클라이언트(나) : 네네
		
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 8507;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("서버에 연결중입니다...");
			socket = new Socket(address, port);
			System.out.println("채팅서버에 접속하였습니다.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("서버와의 채팅을 시작합니다...");
			
			while(true) {
				// 받기
				String recvMsg = dis.readUTF();
				System.out.println("서버(상대) : " + recvMsg);
				
				// 보내기
				System.out.print("클라이언트(나) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
