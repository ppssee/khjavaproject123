package com.kh.day13.socket.baseball;
import java.io.*;
import java.net.*;
import java.util.*;

public class BaseballClient {

	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 8589;
		
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket(address, port);
			System.out.println("클라이언트가 소켓을 생성하였습니다.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("게임 준비 완료");
			
			//값 보내기
			System.out.print("--> ");
			String input = sc.nextLine();
			dos.writeUTF(input);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
