package com.kh.day09.point;

public class Point {
	public int pub;
	int def;
	protected int pro;
	private int pri;
	private int x , y;
	
	public Point () {
		this.x = this.y = 0;
	}
	
	public Point(int x , int y) {
		this.x = x;
		this.y = y;
	}

	
//	public void set(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}
