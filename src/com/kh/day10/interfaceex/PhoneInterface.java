package com.kh.day10.interfaceex;

public interface PhoneInterface {
	// �߻�޼���� ����ʵ�θ� ����.
	
	String name = "";
	public static final int TIME_OUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	void printLogo();
	void disyplayNumber();
	
	public default void showLogo( ) {
		// ���� ȣȯ���� ���ؼ� �ۼ��Ѵ�.
		// �� , ���� ȣȯ���� �����ϰ� �������̽��� ������ ���� �ۼ�.
		System.out.println("** LG **");
	}
	
	
	
}

