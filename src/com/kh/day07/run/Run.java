package com.kh.day07.run;

import java.util.Scanner;

import com.kh.day07.exercise.Exercise_Lotto;
import com.kh.day07.oop.Person;
import com.kh.day07.oop.Rectangle;

public class Run {

	public static void main(String[] args) {

//		Exercise_Lotto exLotto = new Exercise_Lotto();
//		exLotto.lottoProgram();                             //�ζ�
//		
//		Person person = new Person();
//		person.eat();
//		person.sleep();
//		person.walking();
//		person.speak();
		
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		
		
		System.out.print("�ʺ� �Է����ּ��� : ");
		rect.width = sc.nextInt();
		System.out.print("���̸� �Է����ּ��� : ");
		rect.height = sc.nextInt();
		
		//int result = rect.getArea(rect.width, rect.height);
		
	//	System.out.println("�簢���� ������ : " + result);
		
	}

}
