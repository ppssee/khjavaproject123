package com.kh.day09.overriding;

class Weapon{
	protected int fire() {
		return 1;
	}
	protected int fire(int steampack) {
		return steampack*100;
	}
	protected int fire(int steampack, int medicine) {
		return steampack+medicine;
	}
	protected int fire(String steampack) {
		System.out.println(steampack);
		return 1;
	}
	
}

class Cannon extends Weapon{
	protected int fire() {
		return 10;
	}
	
}



public class MethodOverloadingEx {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("hello world");
		System.out.println(1);
		System.out.println('H');
		System.out.println(true);

	}

}
