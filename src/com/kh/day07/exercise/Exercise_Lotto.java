package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	// �ζ� ��ȣ �ڵ� ������ ���α׷�, �ߺ� ���� �����ϱ�!!
	// ��, ����� ������������ ����
	// �ζ� ��ȣ 6��, 1~45, ��ȣ�� ������ �ٽ� ����. 6���� ���ڸ� �迭�� ����
	
	public void lottoProgram() {
		Random rand = new Random();
		int[] numbers = new int[6];

		for(int i=0; i<numbers.length; i++) {
			numbers[i] = (rand.nextInt(45) + 1 );			
		
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {     // �ߺ� ����
					i--;
					break;
				}
				
				if (numbers[i] < numbers[j]) {			// �������� ����
	                int LottoNumberTemp = numbers[i];
	                numbers[i] = numbers[j];
	                numbers[j] = LottoNumberTemp;
	            }
			}
	
		}
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println("�ζ� ��ȣ-> " + numbers[i] );
		}

	}
}
