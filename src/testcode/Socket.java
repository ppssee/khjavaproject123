package testcode;

import java.net.ServerSocket;

public class Socket {

	public static void main(String[] args) {

		// ���� �ۼ��� ���� ����
		/*
		 * 1. ServerSocket : ���� ������ �����Ѵ�. 
		 * 2. Socket : Ŭ�󿡼� ������ ���� ��û�� �Ѵ�.
		 * 3. accept : Ŭ���̾�Ʈ�� ��û�� �޾Ƶ��δ�.
		 * 4. BufferedReader, BufferedWriter : Ŭ�� <-> ����, ������ ����� 
		 * 5. socket.close : ����, Ŭ�� ������ �����Ѵ�.
		 * 
		 */
		
	     ///////////// ���� Ŭ���� //////////////////////////////
//		 ServerSocket serverSocket = new ServerSocket(9000);    // 1��. ��Ʈ9000�� �������� ����.
//		 Socket socket = serverSocket.accept();				    // 3��. Ŭ���� ��û�� ���� �����ϰ� 
//		 														// �� Ŭ��� �ְ���� �� Socket ��ü ��ȯ.
//		 														// ��û�� �� �� ���� ���ο� ������ �������.
//		 
//		 BufferedReader, InputStreamReader, socket.getInputStream()  -> Ŭ�� ��û�Ѱ� �о�;��ϴ� InputStream
//		 BufferedWriter, OutputStreamWriter, socket.getOutputStream() -> Ŭ�󿡰� �޼����� ���������ϴ� OutputStream
//		 
//		 ///////////// Ŭ���̾�Ʈ Ŭ���� ///////////////////////////
//		 
//		 Socket socket = new Socket(����ip, ����port);  
//			
//		BufferedReader in = new BufferedReader(
//				new InputStreamReader(socket.getInputStream())); 
//		BufferedWriter out = new BufferedWriter(
//				new OutputStreamWriter(socket.getOutputStream))
//	
//		ServerSocket serversocket = new ServerSocket(����ip, ������Ʈ);
//		Socket socket = serversocket.accept();
//		
//		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//		
//		
	
	}

}
