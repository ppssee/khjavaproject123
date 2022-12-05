package com.kh.day09.overriding;

import java.util.Scanner;

public class MethodOverridingEx {

	static void paint(Shape p) {
		
		p.draw();
	}
	
	public static void main(String[] args) {
		Shape shpae = new Shape();
		Line line = new Line();
		Shape sh = new Line();
		
		shpae.draw();
		line.draw();
		
		sh.draw();
		
		
	
	}

}
