package com.kh.day11.exercise;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {
	public static void main(String[] args) {
		exercise1();
		
	}
	
	public static void exercise1() {
		// ȫ�浿/��ȭ/ȫ��/����/������ ���ڿ� �����͸�
		//  '/' �������� �ߤ��� ȫ�ø� ����Ͻÿ�.
		
		String str = "ȫ�浿/��ȭ/ȫ��/����/����";
		StringTokenizer st = new StringTokenizer(str, "/");
		
		while(st.hasMoreTokens()) {
			if(st.nextToken().equals("ȫ��")) {
				System.out.println("ȫ��");
			}
		}
		
	}
}
