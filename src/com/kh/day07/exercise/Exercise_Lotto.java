package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기!!
	// 단, 결과는 오름차순으로 정렬
	// 로또 번호 6개, 1~45, 번호가 같으면 다시 뽑음. 6개의 숫자를 배열에 저장
	
	public void lottoProgram() {
		Random rand = new Random();
		int[] numbers = new int[6];

		for(int i=0; i<numbers.length; i++) {
			numbers[i] = (rand.nextInt(45) + 1 );			
		
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {     // 중복 숫자
					i--;
					break;
				}
				
				if (numbers[i] < numbers[j]) {			// 오름차순 정렬
	                int LottoNumberTemp = numbers[i];
	                numbers[i] = numbers[j];
	                numbers[j] = LottoNumberTemp;
	            }
			}
	
		}
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println("로또 번호-> " + numbers[i] );
		}

	}
}
