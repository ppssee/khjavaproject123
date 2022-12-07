package com.kh.day11.exercise;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {
	public static void main(String[] args) {
		exercise1();
		
	}
	
	public static void exercise1() {
		// È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁãÀÇ ¹®ÀÚ¿­ µ¥ÀÌÅÍ¸¦
		//  '/' ±âÁØÀ¸·Î Àß¤©¶ó¼­ È«·Ã¸¸ Ãâ·ÂÇÏ½Ã¿À.
		
		String str = "È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã";
		StringTokenizer st = new StringTokenizer(str, "/");
		
		while(st.hasMoreTokens()) {
			if(st.nextToken().equals("È«·Ã")) {
				System.out.println("È«·Ã");
			}
		}
		
	}
}
