package com.kh.day14.exercise;

public class InformationRun {

	public static void main(String[] args) {

		InformationFunction info = new InformationFunction();


		Exit :
			while(true) {
				int num = info.printMenu();
				switch(num) {
				case 1: info.insert(); break;
				case 2: info.print(); break;
				case 3: info.save(); break;
				case 4: info.load(); break;
				case 0: break Exit;
				default : System.out.println("0~4 °ª ÀÔ·Â."); break;
				}
			}
	}

}
