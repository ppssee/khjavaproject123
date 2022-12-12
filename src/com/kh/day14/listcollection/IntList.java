package com.kh.day14.listcollection;

import java.util.Arrays;

public class IntList {
	
	private int[] nums;
 	private int size;    // 요소 개수
	
	
	public IntList() {
		nums = new int[3];
		size = 0;
	}
	
	private void resize() {
		int array_capacity = nums.length;
		 
		// 용량이 꽉 찰 경우
		// 용량을 2배로 해줌.
		if(size == array_capacity) {
			int new_capacity = array_capacity * 2; // 용량을 2배
			nums = Arrays.copyOf(nums, new_capacity);
		}
	}
	
	public void add(int input) {
		// 꽉차있는 상태라면 크기 재할당 배열 생성.
		// 마지막 위치에 요소 추가.
		if(size == nums.length) {
			resize();
		}
		nums[size] = input;
		size++;
	}
	public int get(int index) {
		return nums[index];
	}
		
	public int size() {
		return size;
	}
	
	public void clear() {
		nums = new int[3];
		size = 0;
	}
}
