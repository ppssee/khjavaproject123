package com.kh.day10.musicinterface;

public class Drum implements Instrument{
	public void play() {
		System.out.println("�յ�Ÿ �ε�ĩ");
	}

	@Override
	public void makeSoudn() {
		System.out.println("��ŸŸ�� ��ĩ��");
	}
}
