package com.kh.day07.score;

import java.util.Scanner;

public class ScoreRun {
	public static void main(String[] args) {

		ScoreFunction scfu = new ScoreFunction();
		
		ByeBye :
		while(true) {
			int choice = scfu.printMenu();
			
			switch(choice) {
			case 1:
				scfu.inputScore();
				break;
			case 2: 
				scfu.printScore();
				break;
			case 3:
				scfu.goodByeMsg();
				break ByeBye;
			default : 
				scfu.exceptionMsg();
				break;
				}

			}
		
		
	}
}
