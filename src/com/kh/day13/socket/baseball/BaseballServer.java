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

		for(int i=0; i<readNum.length; i++) {	 // 숫자 입력
			readNum[i] = Integer.parseInt(st.nextToken());
		} //        5              2         8
		// 정답 numbers[0] , numbers[1], numbers[2]
		// 입력 값 readNum[0] = 3
		// 입력 값 readNum[1] = 5
		// 입력 값 readNum[2] = 8  
		for(int i=0; i<3; i++){ // for int j=0; j>3; j++
			for(int j=2; j<=i; j--) {
				if(numbers[i] == readNum[i]){
					strike++;// 스트라이크
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
			System.out.println("서버소켓을 생성하였습니다.");
			serverSocket = new ServerSocket(port);
			Thread.sleep(2000);
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			// 번호 3개를 뽑은 후에 게임 준비해야함 , 배열에 저장.
			for(int i=0; i<numbers.length; i++) {
				numbers[i] = rand.nextInt(9) + 1;			
				for (int j = 0; j < i; j++) {
					if (numbers[i] == numbers[j]) {     // 중복 숫자
						i--;
						break;
					}
				}
			}
			System.out.println("서버 숫자 ->" + numbers[0] + " " + numbers[1] + " " + numbers[2]);
			System.out.println("서버 준비 완료");
			
			int strike = 0;
			while(strike != 3) {
				//값 받기
				String readNum = dis.readUTF();
				System.out.println("받기 : " + readNum);
				strike = calc(numbers, readNum);

				
				// 메소드로 해결 못할것 같으면 메소드 지우고 메인으로 가져오기.
				// 값 출력
				// 클라이언트로 결과값 보내주기!
				// 스트라이크가 3이면 게임 종료하기~

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
