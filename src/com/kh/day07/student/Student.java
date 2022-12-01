package com.kh.day07.student;

public class Student {

	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {}

	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// 이름
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// 국어
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	// 영어
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	// 수학
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	
	
}
