package com.kh.day05.array;

public class Exam_SortBubble {

	public static void main(String[] args) {
		
		// ���������̶�?
		// ������ �ΰ��� ���Ҹ� �˻��Ͽ� �����ϴ� ���
		// ������ ���ٴ� ������ �ְ�, �̹� ���ĵ� �����͸� ������ �� ���� ����.
		// �⺻������ �ٸ� ���Ŀ� ���� �ӵ��� ������,
		// �������� �����Ҷ� ���� ����.
		
		int[] arrs = {2, 5, 4, 1, 3} ;
		// i = 0 �϶�             // i = 1 �϶�          // i = 2 �϶�
		// 2, 5, 4, 1, 3          // 2, 4, 1, 3, 5       // 1, 2, 3, 4, 5
		// 2, 4, 5, 1, 3          // 2, 1, 4, 3, 5 
		// 2, 4, 1, 5, 3          // 2, 1, 3, 4, 5
		// 2, 4, 1, 3, 5     

		for(int i=0; i<arrs.length-1; i++) {

			for(int j=0; j < (arrs.length-1)-i; j++) {   //   i=0, j=0 j<4 j++  / i=0, j=1 j<4 j++
														 //   i=1, j=0 j<3 j++   
				if(arrs[j] > arrs[j+1])                  //   i=2, j=0 j<2 j+=
				{
					int temp = arrs[j+1];
					arrs[j+1] = arrs[j];
					arrs[j] = temp;
				}

			}

		}
		
		for(int i=0; i<arrs.length; i++) {
			System.out.print(arrs[i]+ " ");
		}

	}

}

