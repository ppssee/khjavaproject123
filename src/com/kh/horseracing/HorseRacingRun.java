package com.kh.horseracing;

public class HorseRacingRun {

	public static void main(String[] args) {
		
		HorseRacingFunction hrFunc = new HorseRacingFunction();
		hrFunc.startMenu();
		hrFunc.selectMenu();
		Bye :
		while(true) {
			
			int choice = hrFunc.mainMenu();
			
			switch(choice) {
			case 0 : hrFunc.selectMenu();  // ���ָ� ���� �޴�
				break;
			case 1 : hrFunc.racingMenu();  // ���� �޴�
				break;
			case 2 : hrFunc.restMenu();   // �޽� �޴�
				break;
			case 3 : hrFunc.gambleMenu();  // ���ָ� �̱� �޴�
				break;
			case 4 : hrFunc.byeMessage();
				break Bye;
			default : 
				System.out.println("0~3 �� �Է����ּ���.");
				break;
			}  // switch�� ����
		}  // while�� ����

	}

}
