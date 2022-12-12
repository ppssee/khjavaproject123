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
			System.out.println("Ŭ���̾�Ʈ�� ������ �����Ͽ����ϴ�.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("���� �غ� �Ϸ�");
			
			while(true) {
			//�� ������
			System.out.print("--> ");
			String input = sc.nextLine();
			dos.writeUTF(input);
			
			//�� �ޱ�
			String resultMsg = dis.readUTF();
			System.out.println(resultMsg);
			if(resultMsg.startsWith("3")) {
				System.out.println("�����մϴ�. �ƿ��Դϴ�!");
				break;
			}
			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				dis.close();
				os.close();
				is.close();
				socket.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}

}
