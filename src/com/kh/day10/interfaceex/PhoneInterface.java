package com.kh.day10.interfaceex;

public interface PhoneInterface {
	// 추상메서드와 상수필드로만 구성.
	
	String name = "";
	public static final int TIME_OUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	void printLogo();
	void disyplayNumber();
	
	public default void showLogo( ) {
		// 하위 호환성을 위해서 작성한다.
		// 즉 , 하위 호환성을 유지하고 인터페이스의 보완을 위해 작성.
		System.out.println("** LG **");
	}
	
	
	
}

