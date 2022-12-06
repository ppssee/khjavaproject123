package com.kh.day10.musicinterface;

public class Piano implements Instrument {
	public void play() {
		System.out.println("도레미파솔라시도");
	}

	@Override
	public void makeSoudn() {
		System.out.println("도시라솔");
	}
}
