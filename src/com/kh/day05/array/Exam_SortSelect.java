package com.kh.day05.array;

public class Exam_SortSelect {

	public static void main(String[] args) {
		// ���� �˰���
		// 1. ��������
		// 2. ��������
		// 3. ��������


		// ���������̶�?
		// �迭�� ���� �˻��Ͽ� �ּҰ��� ���� ���ʺ��� ä�������� ����� ����
		// Ư¡ : ������ ���� ������ ���� ������ �����ִ� ����������
		// ������ ���� ���� �� �ް��� ���� ���ϸ� ����.
		// �迭�� N�� �ε������� N+1�� ~ ������ �ε������� ����.

		
		int[] arrs = {2, 5, 4, 1, 3};
		int min;  // �迭�� ���� ���� ������ �ε��� �� ����.
		for(int i =0; i<arrs.length; i++) {
			min = i;   // ���� ������ �ε��� ��
			
			for(int j=i+1; j<arrs.length; j++ ) {    // i=1, min=1, j=2 j<5; j++
				if(arrs[min] > arrs[j]) {
					min = j;
				}
			}
			
			int temp = arrs[min];
			arrs[min] = arrs[i];
			arrs[i] = temp;
			
		}
		
		// i = 0�϶� 1, 5, 4, 2, 3
		// i = 1�϶� 1, 2, 4, 5, 3
		// i = 2�϶� 1, 2, 3, 5, 4
		// i = 3�϶� 1, 2, 3, 4, 5
		for(int i=0; i<arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		
	}

}
