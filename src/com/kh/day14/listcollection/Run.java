package com.kh.day14.listcollection;

public class Run {
	public static void main(String[] args) {
		ObjectList objList = new ObjectList();
		objList.add(11);
		objList.add("월");
//		objList.add(23);
//		objList.add("일");
		Student std = new Student();
		objList.add(std);
		
		int num = (int)objList.get(0);
		String str = (String)objList.get(1);
		Student sOne = (Student)objList.get(2);
		
	}
	
	public void intExample() {

		IntList nums = new IntList();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		System.out.println("1번째 값 : " + nums.get(0));
		System.out.println("2번째 값 : " + nums.get(1));
		System.out.println("3번째 값 : " + nums.get(2));
		System.out.println("크기 : "  + nums.size());
		
		nums.clear();
		System.out.println("삭제 후 크기 : " + nums.size());

	}
}
