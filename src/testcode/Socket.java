package testcode;

import java.net.ServerSocket;

public class Socket {

	public static void main(String[] args) {

		// 소켓 송수신 과정 설명
		/*
		 * 1. ServerSocket : 서버 소켓을 생성한다. 
		 * 2. Socket : 클라에서 서버에 접속 요청을 한다.
		 * 3. accept : 클라이언트의 요청을 받아들인다.
		 * 4. BufferedReader, BufferedWriter : 클라 <-> 서버, 데이터 입출력 
		 * 5. socket.close : 서버, 클라 소켓을 종료한다.
		 * 
		 */
		
	     ///////////// 서버 클래스 //////////////////////////////
//		 ServerSocket serverSocket = new ServerSocket(9000);    // 1번. 포트9000의 서버소켓 생성.
//		 Socket socket = serverSocket.accept();				    // 3번. 클라의 요청이 오면 수락하고 
//		 														// 그 클라와 주고받을 새 Socket 객체 반환.
//		 														// 요청이 올 때 마다 새로운 소켓이 만들어짐.
//		 
//		 BufferedReader, InputStreamReader, socket.getInputStream()  -> 클라가 요청한걸 읽어와야하니 InputStream
//		 BufferedWriter, OutputStreamWriter, socket.getOutputStream() -> 클라에게 메세지를 출력해줘야하니 OutputStream
//		 
//		 ///////////// 클라이언트 클래스 ///////////////////////////
//		 
//		 Socket socket = new Socket(서버ip, 서버port);  
//			
//		BufferedReader in = new BufferedReader(
//				new InputStreamReader(socket.getInputStream())); 
//		BufferedWriter out = new BufferedWriter(
//				new OutputStreamWriter(socket.getOutputStream))
//	
//		ServerSocket serversocket = new ServerSocket(서버ip, 서버포트);
//		Socket socket = serversocket.accept();
//		
//		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//		
//		
	
	}

}
