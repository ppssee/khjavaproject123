package com.kh.day04.random;

import java.util.Random;

public class Exam_Random {

	public static void main(String[] args) {

		Random rand = new Random();

		int a = rand.nextInt(35);
		
		for(int i=0; i<50; i++) {
			
			System.out.println(rand.nextInt(14)+10); 
		}

		//10~23 »çÀÌ
	}

}
