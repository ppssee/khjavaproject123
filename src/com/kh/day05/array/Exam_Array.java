package com.kh.day05.array;

public class Exam_Array {

	public static void main(String[] args) {

		int[] nums = new int[10];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		System.out.println("첫 번째 값 : " + nums[0]);
		System.out.println("두 번째 값 : " + nums[1]);
		System.out.println("세 번째 값 : " + nums[2]);
		System.out.println("배열의 크기 : " + nums.length);

		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = 100;
			System.out.println(nums[i]);
		}
	}

}
