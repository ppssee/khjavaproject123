package com.kh.day07.oop;

public class Rectangle {

	
	

	public int width;     //�ʺ�
	public int height;    //����
	
	public Rectangle() {}  //Ŭ������� �Ȱ��� �޼���, ��ü ����, ��ü �ʱ�ȭ
	
	public Rectangle(int width, int height) {   // �Ű����� �ִ� ������.
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width*height;
	}

	
	
	
	
}
