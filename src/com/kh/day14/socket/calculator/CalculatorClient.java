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
			System.out.println("서버와 연결되었습니다.");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);

			// 보내기
			// 계산식 (빈칸으로 띄어 입력, 예 24 + 42) >> 12 + 1 
			// 계산 결과: 13
			while(true) {
				System.out.print("(빈칸으로 띄어 입력, 예 24 + 42) >>");
				String sendMsg = sc.nextLine();
				
				dos.writeUTF(sendMsg);
				if(sendMsg.equalsIgnoreCase("bye")) {
					System.out.println("종료하였습니다.");
					break;
				}
				
				// 받기
				
				String recvMsg = dis.readUTF();
				if(recvMsg.equalsIgnoreCase("end")) {
					System.out.println("잘못 입력하셨습니다.");
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
