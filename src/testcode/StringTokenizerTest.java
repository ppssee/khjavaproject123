package testcode;

import java.net.ServerSocket;
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		
		String str = "name = A & age = 15, name = B & age = 19";
		StringTokenizer st = new StringTokenizer(str, "&");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			System.out.println(st.countTokens());
		}
		
	}
	

}
