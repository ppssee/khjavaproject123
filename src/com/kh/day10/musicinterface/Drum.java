package com.kh.day10.musicinterface;

public class Drum implements Instrument{
	public void play() {
		System.out.println("µÕµÕÅ¸ µÎµÒÄ©");
	}

	@Override
	public void makeSoudn() {
		System.out.println("µÕÅ¸Å¸µÕ µÎÄ©µÒ");
	}
}
