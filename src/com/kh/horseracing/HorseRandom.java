package com.kh.horseracing;

import java.util.Random;

public class HorseRandom { 	// ���, ü��, ���ǵ�
	
	public HorseRandom(){} 	 
	
	public String randGrade() { 
		
		Random rand = new Random();
		int a = rand.nextInt(100) + 1;  
		if(a > 0 && a <= 50) {    // 50% ��  
			return "��";
		}
		else if (a > 50 && a <= 80) {  // 30% ��
			return "��";
		}
		else {   // 20% ��
			return "��";
		}
		
	}
	
	public int randSpeed(String grade) {
		Random rand = new Random();
		int speed = 0;
		if(grade == "��") {	
			speed = rand.nextInt(35)+1; 	// ���ǵ尪: 1~35     
			return speed;		
		}
		else if(grade == "��") {
			speed = rand.nextInt(40)+10;    // ���ǵ尪: 10~49
			return speed;
		}
		else {
			speed = rand.nextInt(50)+20;    // ���ǵ尪: 20~70
			return speed;
		}
	}
	
	
}
