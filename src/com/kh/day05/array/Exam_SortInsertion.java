package com.kh.day05.array;

public class Exam_SortInsertion {

	public static void main(String[] args) {
		// ���� �˰���
		// 1. ��������
		// 2. ��������
		// 3. ��������


		// ���������̶�?
		// ���� �˰��� �߿� �ϳ��̸鼭 ���� �����ϰ� �⺻�� �Ǵ�
		// �˰���
		// �迭�� n�� �ε������� 0������ n-1�� �ε������� ��
		// { 2, 5, 4, 1, 3 }

		int[] arrs = {2, 5, 4, 1, 3} ;
		
		for(int i = 1; i<arrs.length; i++) {  
			
			for(int j = i; j>0; j--) {     //i=1,j=1 j>0
				if(arrs[j-1]>arrs[j]) 
				{     
					int temp = arrs[j-1];
					arrs[j-1] = arrs[j];
					arrs[j] = temp;
				}
			}
			
		}
		
		// i=1, j=1 j>0 j--  // 2, 5, 4, 1, 3
		// i=2, j=2 j>0 j--  // 
		
		
		for(int i=0; i<arrs.length; i++) {
			System.out.println(arrs[i] + " ");
		}
	}

}
