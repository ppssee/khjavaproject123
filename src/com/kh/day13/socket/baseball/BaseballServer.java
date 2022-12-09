package com.kh.day13.socket.baseball;
import java.io.*;
import java.net.*;
import java.util.*;

public class BaseballServer {

	public static int calc(int[] numbers, String Num) {
		StringTokenizer st = new StringTokenizer(Num, " ");
		if(st.countTokens() != 3) System.out.println("error");
		int[] readNum = new int[3];
		int strike = 0;
		int ball = 0;

		for(int i=0; i<readNum.length; i++) {	 // ���� �Է�
			readNum[i] = Integer.parseInt(st.nextToken());
		} //        5              2         8
		// ���� numbers[0] , numbers[1], numbers[2]
		// �Է� �� readNum[0] = 3
		// �Է� �� readNum[1] = 5
		// �Է� �� readNum[2] = 8  
		for(int i=0; i<3; i++){ // for int j=0; j>3; j++
			for(int j=2; j<=i; j--) {
				if(numbers[i] == readNum[i]){
					strike++;// ��Ʈ����ũ
				}
				else if(numbers[i] == readNum[j]) {
					ball++;
				}
			}
		}
		
		return strike;
	}
//	numbers[0] -> readNum[0]   numbers[1] -> readNum[1]  numbers[2] -> readNum[2]
//			   -> readNum[1]              -> readNum[2]
//			   -> readNum[2]


	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		int port = 8589;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		int[] numbers = new int[3];
		Random rand = new Random();
		StringTokenizer st = null;

		try {
			System.out.println("���������� �����Ͽ����ϴ�.");
			serverSocket = new ServerSocket(port);
			Thread.sleep(2000);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�.");
			Socket socket = serverSocket.accept();
			System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			// ��ȣ 3���� ���� �Ŀ� ���� �غ��ؾ��� , �迭�� ����.
			for(int i=0; i<numbers.length; i++) {
				numbers[i] = rand.nextInt(9) + 1;			
				for (int j = 0; j < i; j++) {
					if (numbers[i] == numbers[j]) {     // �ߺ� ����
						i--;
						break;
					}
				}
			}
			System.out.println("���� ���� ->" + numbers[0] + " " + numbers[1] + " " + numbers[2]);
			System.out.println("���� �غ� �Ϸ�");
			
			int strike = 0;
			while(strike != 3) {
				//�� �ޱ�
				String readNum = dis.readUTF();
				System.out.println("�ޱ� : " + readNum);
				strike = calc(numbers, readNum);

				
				// �޼ҵ�� �ذ� ���Ұ� ������ �޼ҵ� ����� �������� ��������.
				// �� ���
				// Ŭ���̾�Ʈ�� ����� �����ֱ�!
				// ��Ʈ����ũ�� 3�̸� ���� �����ϱ�~

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
