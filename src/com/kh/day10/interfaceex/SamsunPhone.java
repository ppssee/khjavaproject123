package com.kh.day10.interfaceex;

public class SamsunPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("뚜루루루루");
	}

	@Override
	public void receiveCall() {
		System.out.println("여보세요 나야");
	}

	@Override
	public void printLogo() {
		System.out.println("======= Samsung ======");
	}

	@Override
	public void disyplayNumber() {
		System.out.println("내 휴대전화 정보 : xxx - xxxx - xxxxx");
	}
	
	///////////
	
	public void flash() {
		System.out.println("반짝반짝");
	}

}
