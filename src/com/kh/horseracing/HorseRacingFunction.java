package com.kh.horseracing;

import java.util.Random;
import java.util.Scanner;

public class HorseRacingFunction {

	Horse[] horse;
	Scanner sc;
	HorseMoney hm;
	Random rand;
	HorseRandom horseRand;

	public HorseRacingFunction() {
		horse = new Horse[20];
		sc = new Scanner(System.in);
		rand = new Random();
		horseRand = new HorseRandom();
		hm = HorseMoney.getinstance();
	};


	public void startMenu() { 		// ���� �޴�
		
		System.out.println("================== �渶 ���α׷� ==================");
		System.out.println("�⺻ ���ָ��� �����մϴ�.");
		System.out.println("����Ͻ� ���ָ��� ������ �Է����ּ���.");
		System.out.print("���ָ��� �̸� : ");
		String name = sc.nextLine();
		horse[0] = new Horse();
		horse[0].setGrade("��");
		horse[0].setSpeed(horseRand.randSpeed(horse[0].getGrade()));
		horse[0].setName(name);



	};	

	public int mainMenu() { // ���� �޴�
		clearScreen();
		System.out.println("==================== ���� �޴� ====================");
		System.out.printf("�̸�: %-6s\t \n", horse[hm.getState()].getName());
		System.out.printf("ü��: %3d | ���ǵ�: %2d | ���: %s | ���: %d |  \n", horse[hm.getState()].getHp(), horse[hm.getState()].getSpeed(), horse[hm.getState()].getGrade(), hm.getMoney());
		System.out.println();
		System.out.println("0. ����");
		System.out.println("1. ����");
		System.out.println("2. �޽�");
		System.out.println("3. �̱�");
		System.out.println("4. ����");
		System.out.print("�Է�: ");
		int choice = sc.nextInt();
		sc.nextLine();
		return choice;
	};		

	public void selectMenu() { 	// 0. ����
		clearScreen();
		System.out.println("=================== ���ָ� ���� ===================");
		for(int i = 0; i<horse.length; i++) {
			if(horse[i] != null) {
				System.out.printf("%2d. �̸�: %-6s\t| ���ǵ�: %2d | ���: %s\n", i, horse[i].getName(), horse[i].getSpeed(), horse[i].getGrade());
				
			}
		}
		System.out.println();
		System.out.print("�Է�: ");	
		int choice = sc.nextInt();
		sc.nextLine();
		hm.setState(choice);
	};	

	public void racingMenu() { 	//  1. ����
		clearScreen();
		try {
			if(horse[hm.getState()].getHp() >= 60) {		// ü�� 60 �̻� ���� ����
				for(int i=0; i<20; i++) {
					clearScreen();
					System.out.println("===============1�� ����===============");
					while(true) {
						int random = rand.nextInt(100);
						
						if(horse[hm.getState()].getSpeed() > random) {	 // �������ں��� ���ǵ尡 Ŭ ��쿡�� ��ĭ�� �̵� (��������)
							for(int j=0; j<=i; j++) {
								if(j==i) {
									
									System.out.print("��");
								}
								System.out.print("  ");
							}
							System.out.println();
							System.out.println("======================================");
							Thread.sleep(200); 
							break;
						} 
						
					}
				} // ���� ��
				horse[hm.getState()].setHp(horse[hm.getState()].getHp() - rand.nextInt(30));	// ���� �� 0~29 ü�°���.
				hm.setMoney(hm.getMoney() + rand.nextInt(100));		// ���� �� 0~99�� ȹ��.
			} 
			else {
				clearScreen();
				System.out.println("ü�� 60 �̻� �����մϴ�.");
				System.out.println("�޽��� ���� ü���� ȸ���ϼ���.");
				System.out.println("���� ü��: " + horse[hm.getState()].getHp());
				Thread.sleep(2000);
			}
		}
		catch(Exception e) {}
	}
	public void  restMenu() {	// 2. �޽�
		clearScreen();
		
		try {
			for(int i=0; horse[hm.getState()].getHp() < 100; i++) {
				if(horse[hm.getState()].getHp() == i) {
					System.out.println("=================== �޽� �޴� ===================");
					System.out.println("�޽� �� ... ���� ü�� : " + horse[hm.getState()].getHp());
					horse[hm.getState()].setHp(horse[hm.getState()].getHp()+1);
					Thread.sleep(200); 
					clearScreen();
				}
			}
		}
		catch(Exception e) { }
	};    

	public void  gambleMenu() {		// 3. �̱�
		clearScreen();
		System.out.println("=================== ���ָ� �̱� ===================");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("200���� ����� ���ָ��� �����ðڽ��ϱ�?");
			System.out.println("1. YES ");
			System.out.println("2. NO ");
			System.out.print("����: ");
			int select = sc.nextInt();
			sc.nextLine();

			switch(select) {
			case 1:
				if( hm.getMoney() >= 200) {
					for(int i = 0; i<horse.length; i++) {
						if(horse[i] == null) {
							horse[i] = new Horse();
							System.out.println();
							System.out.println("���ָ� �̱� �Ϸ�.");
							System.out.print("���ָ��� �̸��� �Է����ּ���: ");
							horse[i].setName(sc.nextLine());
							break;
						}
					}
					hm.setMoney(hm.getMoney()-200);
				}
				else {
					System.out.println();
					System.out.println("�ݾ��� �����մϴ�.");
					Thread.sleep(2000);
				}
				break;

			case 2:

				break;
			default :
				System.out.println("1���� 2���� �Է����ּ���.");
				break;
			}
		}
		catch(Exception e) { }
	};	// 3. �̱�
	
	public void byeMessage() {
		System.out.println();
		System.out.println("���α׷� ����.");
	}

	public void clearScreen() {
		for (int i = 0; i < 80; i++)
			System.out.println("");  
	}

}
