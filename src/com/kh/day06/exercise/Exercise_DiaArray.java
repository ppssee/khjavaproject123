package com.kh.day06.exercise;

public class Exercise_DiaArray {
	
	
	public void exercise1()	{
		//  5   4   3   2   1             
		// 10   9   8   7   6
		// 15  14  13  12  11
		// 20  19  18  17  16
		// 25  24  23  22  21

		//     ->    ->    ->      ->     ->
		/*  [0][4] [0][3] [0][2] [0][1] [0][0]   // 1씩 증가되는 인덱스 순서임.
		 *  [1][4] [1][3] [1][2] [1][1] [1][0]
		 *  앞 값은 고정이니 i로, 뒷 값은 4로 시작하고 감소. ( 4 는 배열길이 -1 )
		 */
		
		
		int[][] arrs = new int[5][5];
		int k = 1;

		for(int i=0; i<arrs.length; i++) {

			for(int j=arrs.length-1; j >= 0; j--) {
				arrs[i][j] = k;
				System.out.printf("%2d ", arrs[i][j]);
				k++;
			}
			
			System.out.println();
		}




	}

	public void exercise2() {
		// 5   10   15   20   25
		// 4    9   14   19   24
		// 3    8   13   18   23
		// 2    7   12   17   22
		// 1    6   11   16   21
		
		
		//    ->      ->    ->     ->      ->
		/*  [4][0] [3][0] [2][0] [1][0] [4][0]   // 뒷 값은 고정이니 i로 넣고 앞 값은 계속 감소하니 j로 넣음.
		 *  [4][1] [3][1] [2][1] [1][1] [0][1]
		 *  [4][2] [3][2] [2][2] [1][2] [0][2]
		 *  
		 */
		int k = 1;
		int[][] arrs = new int[5][5];

		for(int i=0; i<arrs.length; i++) {

			for(int j=arrs.length-1; j>=0 ; j--) {
				arrs[j][i] = k;
				k++;
			}
		}
		
		for(int i =0; i<arrs.length; i++) {
			for(int e=0; e<arrs[i].length; e++) {
				System.out.printf("%2d " , arrs[i][e]);
			}
			System.out.println();
		}
		

	}
	public void exercise3() {
		//  1   6   11   16   21
		//  2   7   12   17   22
		//  3   8   13   18   23
		//  4   9   14   19   24
		//  5  10   15   20   25
		
		//    ->     ->     ->     ->      ->
		/*  [0][0] [1][0] [2][0] [3][0] [4][0]
		 *  [0][1] [1][1] [2][1] [3][1] [4][1]
		 *  [0][2] [1][2] [2][2] [3][2] [4][2]
		 *  뒷 값은 고정이고 뒤 반복문이 끝날때 증가하므로 i로 지정.
		 *  앞 값은 계속 증가하니 j로 지정.
		 */
		
		
		int[][] arrs = new int[5][5];
		int k = 1;
		
		for(int i=0; i<arrs.length; i++) {
			
			for(int j=0; j<arrs[i].length; j++) {
				arrs[j][i] = k;
				k++;
			}
						
		}
		
		for(int i =0; i<arrs.length; i++) {
			for(int e=0; e<arrs[i].length; e++) {
				System.out.printf("%2d " , arrs[i][e]);
			}
			System.out.println();
		}
			

	}

	public void exercise4() {

		//  1    2    3    4    5
		// 10    9    8    7    6
		// 11   12   13   14   15
		// 20   19   18   17   16
		// 21   22   23   24   25

		//    ->    ->      ->     ->    ->
		/*  [0][0] [0][1] [0][2] [0][3] [0][4] 
		 *  [1][4] [1][3] [1][2] [1][1] [1][0]
		 *  [2][0] [2][1] [2][2] [2][3] [2][4]
		 *  [3][4] [3][3] [3][2] [3][1] [3][0]
		 *  홀수행은 앞값=i, 뒷값=j j++
		 *  짝수행은 앞값=i, 뒷값=4 j--  (4 = 배열의길이-1)
		 */
		
		int[][] arrs = new int[5][5];
		int k = 1;

		for(int i=0; i<arrs.length; i++) {
			if(i%2 ==0) {
				for(int j=0; j<arrs[i].length; j++) {
					arrs[i][j] = k;
					k++;
				}
			}
			else {
				for(int j=arrs[i].length-1; j>=0; j--) {
					arrs[i][j] = k;
					k++;
				}

			}
		}

		for(int i =0; i<arrs.length; i++) {
			for(int e=0; e<arrs[i].length; e++) {
				System.out.printf("%2d " , arrs[i][e]);
			}
			System.out.println();
		}


		
	}
	
	public void exercise5() {
		// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		// 4년간 전체 평점 평균을 출력하라.
		double [][] score = { {3.3, 3.4} , {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2} };
		
		
		double sum = 0;
		int count = 0;
		for(int i=0; i<score.length; i++) {
			
			for(int e=0; e<score[i].length; e++) {
				sum += score[i][e];
				count += 1;
			}
		}
		System.out.println("전체평균 : " + (sum/count));
		
		
		
	}

	
	
	
}
