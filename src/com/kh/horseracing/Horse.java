package com.kh.horseracing;

public class Horse {

	private String name = "";
	private String grade = "";
	private int hp = 100;
	private int speed = 0;
	
	HorseRandom horseRand;
	
	public Horse() {  		// ���ָ� ������ ���ÿ� ��ް� ���ǵ� ���� ������ �ʱ�ȭ.
		horseRand = new HorseRandom();
		grade = horseRand.randGrade(); 
		speed = horseRand.randSpeed(getGrade());
	}

	
	public Horse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
