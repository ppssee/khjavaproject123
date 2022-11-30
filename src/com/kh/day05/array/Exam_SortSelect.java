package com.kh.day05.array;

public class Exam_SortSelect {

	public static void main(String[] args) {
		// 정렬 알고리즘
		// 1. 삽입정렬
		// 2. 선택정렬
		// 3. 버블정렬


		// 선택정렬이란?
		// 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
		// 특징 : 데이터 양이 적을때 좋은 성능을 보여주는 정렬이지만
		// 데이터 양이 많을 때 급격한 성능 저하를 보임.
		// 배열의 N번 인덱스값을 N+1번 ~ 마지막 인덱스까지 비교함.

		
		int[] arrs = {2, 5, 4, 1, 3};
		int min;  // 배열의 제일 작은 숫자의 인덱스 값 저장.
		for(int i =0; i<arrs.length; i++) {
			min = i;   // 가장 작을때 인덱스 값
			
			for(int j=i+1; j<arrs.length; j++ ) {    // i=1, min=1, j=2 j<5; j++
				if(arrs[min] > arrs[j]) {
					min = j;
				}
			}
			
			int temp = arrs[min];
			arrs[min] = arrs[i];
			arrs[i] = temp;
			
		}
		
		// i = 0일때 1, 5, 4, 2, 3
		// i = 1일때 1, 2, 4, 5, 3
		// i = 2일때 1, 2, 3, 5, 4
		// i = 3일때 1, 2, 3, 4, 5
		for(int i=0; i<arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		
	}

}
