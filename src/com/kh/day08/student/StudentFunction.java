package com.kh.day08.student;
import java.util.Scanner;

public class StudentFunction {
	
	Student[] students;
	
	public StudentFunction() {
		students = new Student[3];
	}
	
	public int printMenu() {
		for (int i=0; i<25; i++) System.out.println(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("======= 학생 성적 확인 프로그램 =======");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<25; i++) System.out.println(); 
		for(int i = 0; i < students.length; i++) {
					        
			System.out.println("======= "+ (i+1) + "번째 학생 정보 입력 =======");
			System.out.print("학생 이름 입력 : ");
			String name = sc.next();
			System.out.print("1차 점수 입력 : ");
			int firstScore = sc.nextInt();
			System.out.print("2차 점수 입력 : ");
			int secondScore = sc.nextInt();

			students[i] = new Student();
			students[i].setName(name);
			students[i].setFirstScore(firstScore);
			students[i].setSecondScore(secondScore);

		}
	}

	public void printScore() {
		for(int i = 0; i< students.length; i++) {
			System.out.println("======= "+ (i+1) + "번째 학생 정보 출력 =======");
			System.out.println(students[i].getName() + "학생의 점수는");
			System.out.println("1차 점수 : " + students[i].getFirstScore() + ", 2차 점수 : " + students[i].getFirstScore() + "입니다.");
		}
		
	}
	
	public void checkPass() {
		for(int i=0; i<students.length; i++) {
			// 0. 재평가의 여부는 1차, 2차가 각각 다르다.
			// 1. 각각의 점수가 40점 미만의 경우 과락으로 재평가 대상.  하나라도
			// 2. 1차점수와 2차점수의 평균은 60점을 넘어야한다.
			// 3. 1차점수와 2차점수의 평균이 60점 미만의 경우 60점 미만의 과목에 대해서 재평가를 본다.
			String name = students[i].getName();
			int score1 = students[i].getFirstScore();
			int score2 = students[i].getSecondScore();
			double aver = (score1 + score2)/(double)2;
			System.out.println((i+1)+ "번째," + name +"학생의 확인결과");
			
			if(aver >= 60) {
				if(score1 < 40) {
					System.out.println("1차 시험 재평가 대상자입니다.");
				}
				else if(score2 <40) {
					System.out.println("2차 시험 재평가 대상자입니다.");
				}
				System.out.println("통과하였습니다.");
			}
			else {
				if(score2 < 60) {
					System.out.println("2차 시험 재평가 대상자입니다.");
				}else if(score1 <60) {
					System.out.println("1차 시험 재평가 대상자입니다.");
				}else {
					
				}
				
				
			}
			
			
			
			
		}  // for문 종료.
	}
	
	public void printGoodBye() {}
	
	public void printException() {}
	
}