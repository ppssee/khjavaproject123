package com.kh.day10.wrapperex;

public class Exam_Wrapper {

	public static void main(String [] args) {
		Integer i = Integer.valueOf(500);
		int e = i.intValue();
		
		int d = i.intValue();
		
		Integer f = null;
		
		Character c = Character.valueOf('c');
		char ch = c.charValue();
		
		Double db = Double.valueOf(3.14);
		double dd = db.doubleValue();
		
		// ���ڿ��� �⺻ ��������Ÿ������ ��ȯ
		
		int num = Integer.parseInt("123");
		System.out.println("��ȯ�� �� : " + num);
		
		boolean isyn = Boolean.parseBoolean("true");
		double fNum = Double.parseDouble("3.14");
		
		// �⺻ ������ Ÿ�� (int , double, char) �� ���ڿ��� ��ȯ
		
		String sta = Integer.toString(123);
		String data3 = Double.toString(3.14);
	}
}
