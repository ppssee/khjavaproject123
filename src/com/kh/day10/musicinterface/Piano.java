package com.kh.day10.musicinterface;

public class Piano implements Instrument {
	public void play() {
		System.out.println("�������ļֶ�õ�");
	}

	@Override
	public void makeSoudn() {
		System.out.println("���ö��");
	}
}
