package com.kh.day13.socket.baseball;
import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class BaseballServer {
//
//	public static int calc(int[] numbers, String Num) {
//		StringTokenizer st = new StringTokenizer(Num, " ");
//		if(st.countTokens() != 3) System.out.println("error");
//		int[] readNum = new int[3];
//		int strike = 0;
//		int ball = 0;
//
//		for(int i=0; i<readNum.length; i++) {	 // 숫자 입력
//			readNum[i] = Integer.parseInt(st.nextToken());
//		} 
// 
//		for(int i=0; i<3; i++){ // for int j=0; j>3; j++
//			for(int j=2; j<=i; j--) {
//				if(numbers[i] == readNum[i]){
//					strike++;// 스트라이크
//				}
//				else if(numbers[i] == readNum[j]) {
//					ball++;
//				}
//			}
//		}
//		
//		return strike;
//	}



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
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS");
		
		try {
			System.out.println("서버소켓을 생성하였습니다.");
			serverSocket = new ServerSocket(port);
			Thread.sleep(2000);
			
			Date date = new Date();
			System.out.println(trans.format(date));
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


			while(true) {
				//값 받기
				String readNum = dis.readUTF();
				System.out.println("받기 : " + readNum);

				int strike = 0;
				int ball = 0;
				
				String[] readNums = readNum.split(" ");
				for(int i =0; i<numbers.length; i++) {
					for(int e=0; e<readNums.length; e++) {
						if(numbers[i] == Integer.parseInt(readNums[e])) {
							if(i == e) {
								strike ++;
							}
							else {
								ball++;						}
						}
					}
				}
				String result = strike + "스트라이크 " + ball + "볼";
				System.out.println(result);
				dos.writeUTF(result);
				
				if(strike == 3) {
					System.out.println("아웃! 게임종료!");
					break;
				}
				
			}
		}
	
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				dis.close();
				is.close();
				os.close();
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
