package com.kh.day10.exercise;

import java.util.Scanner;

public class GoodCalc extends Calculator{

	public static void main(String[] args) {
		GoodCalc calc = new GoodCalc();
	
		int[] a = { 3, 4, 5, 6, 7, 8, 9, 10 };
		
		System.out.println("Че : " + calc.add(1, 2));
		System.out.println("Тї : " + calc.substarct(1, 2));
		System.out.println("ЦђБе : " + calc.average(a));
		
		
	}

	@Override
	public int add(int a, int b) {
		int result = a+b;
		return a+b;
	}

	@Override
	public int substarct(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		double aver = 0;
		int sum = 0;
		
		for(int i = 0; i< a.length; i++) {
			sum += a[i];
		}
		aver = sum / (double)a.length;
		
		return aver;
	}
	
}
