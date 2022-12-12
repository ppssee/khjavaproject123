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
			System.out.println("서버 구동중입니다.");
			Thread.sleep(1000);
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다..");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결 되었습니다.");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			// 받기
			// 받은 메시지 : 12 + 1
			// 연산결과 보내기
			while(true) {
				String recvMsg = dis.readUTF();
				if(recvMsg.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트가 종료하였습니다.");
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
				default : result = "연산자를 잘못 입력하셨습니다"; break;
				}
				String sendMsg = "계산결과 : " + result; 
				// 보내기
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
