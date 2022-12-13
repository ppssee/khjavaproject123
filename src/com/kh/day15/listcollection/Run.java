package com.kh.day15.listcollection;

import java.util.ArrayList;
import java.util.List;

public class Run {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(23);
		list.add(5);
		list.add(2);
		
		int size = list.size();
		System.out.println("size : " + size);
		
		System.out.println("1번째 값 : " + list.get(0));
		
		list.add(2023);
		System.out.println("size : " + list.size());
		
//		list.clear();
//		System.out.println("size : " + list.size());
		System.out.println("~~~~~ 출력 ~~~~");
		for(int i = 0; i< list.size(); i++) {
			System.out.println((i+1) + "번째 값 : " + list.get(i));
		}
		list.add(2, 2022);
		System.out.println("~~~~ Foreach로 출력 ~~~~");
		for (Integer iOne : list) {
			System.out.println("출력 : " + iOne);
		}
		list.set(4,7);
		System.out.println("~~~~ 다시한번 출력 ~~~~");
		for (Integer iOne : list) {
			System.out.println("출력 : " + iOne);
		}
		
	}
	
	public void genericExample() {
		RList<Integer> list = new RList<Integer>();
		
		list.add(11);
		list.add(23);
		list.add(5);
		
		int num = list.get(0);
		num = list.get(1);
	}
	
	
	public void objectExample() {
		ObjectList list = new ObjectList();
		list.add(11);
		list.add("월");
		list.add(new Student());
		int num = (int)list.get(0);
		String word = (String)list.get(1);
		Student sOne = (Student)list.get(2);
		
	}
	
	public void intExample() {
		ObjectList list = new ObjectList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println("첫번째 : " + list.get(0));
		System.out.println("두번째 : " + list.get(1));
		System.out.println("세번째 : " + list.get(2));
		System.out.println("크기 : " + list.size());
		
		list.clear();
	}
}
