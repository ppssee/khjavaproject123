package com.kh.day10.interfaceex;

public class SamsunPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("�ѷ����");
	}

	@Override
	public void receiveCall() {
		System.out.println("�������� ����");
	}

	@Override
	public void printLogo() {
		System.out.println("======= Samsung ======");
	}

	@Override
	public void disyplayNumber() {
		System.out.println("�� �޴���ȭ ���� : xxx - xxxx - xxxxx");
	}
	
	///////////
	
	public void flash() {
		System.out.println("��¦��¦");
	}

}
