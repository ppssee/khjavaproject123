package com.kh.day08.student;

public class StudentRun {

	public static void main(String[] args) {
		StudentFunction sFunc = new StudentFunction();
		
		Bye :
		while(true) {
			int choice = sFunc.printMenu();
			switch(choice) {
			case 1 : 
				sFunc.inputScore();
				break;
			case 2 : 
				sFunc.printScore();
				break;
			case 3 : 
				
				break;
			case 4 : 
				sFunc.printGoodBye();
				break Bye;
			default : 
				sFunc.printException();
				break;
			}  // switch문 종료
		}  // while문 종료
		
	}

}
