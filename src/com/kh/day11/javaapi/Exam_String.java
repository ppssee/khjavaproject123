package com.kh.day11.javaapi;
public class Exam_String {
	public static void main(String[] args) {
		String msg = "Hello Java";
		msg = new String("Hello J");
		
		String data1 = new String(" C#");
		String data2 = new String(",C++ ");
		
		System.out.println(data1 + "�� ���̴� " + data1.length());
		System.out.println(data2 + "�� ���̴� " + data2.length());
		System.out.println("#�� �ִ°�? : " + data1.contains("#"));

		// ���ڿ� ����
		data1 = data1.concat(data2); // C3,C++
		System.out.println("����� ���ڿ� : " + data1);
		
		// ���� ����
		data1 = data1.trim();
		System.out.println("���� ���ŵ� ���ڿ� : " + data1);
		
		// C# -> JAVA
		data1 = data1.replace("C#", "JAVA");
		System.out.println("���ڿ� ��ü : " + data1);
	
		// ���ڿ� �и�
		String[] words=data1.split(",");
		for(int i=0; i<words.length; i++) {
			System.out.println("�и��� ���ڿ� : " + i + " : " + words[i]);
		}
		
		// ���ڿ� �ڸ���
		data1 = data1.substring(5); 	//0~5 �ε��� �� ����.
		System.out.println("���ڿ� �ڸ��� :" + data1);
		
		char word = data1.charAt(0);
		System.out.println("���� �ڸ��� " + word);
		
		
		
		
	}
}
