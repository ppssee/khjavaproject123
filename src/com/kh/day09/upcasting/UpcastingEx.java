package com.kh.day09.upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student();
		p = s;
		Person ps = new Student();
		
		System.out.println(p.name);

//		System.out.println(((Student)p).grade);
//		System.out.println( ((Student)p).department );
	}

}
