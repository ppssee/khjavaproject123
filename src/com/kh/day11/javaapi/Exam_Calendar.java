package com.kh.day11.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String[] args) {
		
		Exam_Calendar exCal = new Exam_Calendar();
		
		Calendar today = Calendar.getInstance();
		exCal.printCalendar("현재", today);  		// 출력 메소드 호출
		
		System.out.println();
		
		Calendar someDate = Calendar.getInstance();
		someDate.clear();
		someDate.set(2022, 10, 23);
		someDate.set(Calendar.HOUR_OF_DAY, 9);
		someDate.set(Calendar.MINUTE, 0);
		exCal.printCalendar("개강일", someDate);  	// 출력 메소드 호출
		
		System.out.println();
		
		Calendar endDate = Calendar.getInstance();
		endDate.clear();
		endDate.set(2023, 04, 03);
		endDate.set(Calendar.HOUR_OF_DAY, 8);
		endDate.set(Calendar.MINUTE, 10);
		
		exCal.printCalendar("수료일", endDate); 	// 출력 메소드 호출
		
	}

	public void printCalendar(String msg, Calendar cal) {
		// Calendar today = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) +1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);   //요일 표시
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);  // 24시간 표시
		int ampm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND); //밀리세컨드
		
		// 현재 2022/12/7/수요일(11시) 오전 11시 42분 33초 234밀리초
		System.out.print(msg+ " " + year + "/" + month + "/" + day + "/");
		switch(dayOfWeek) {
		//	case Calendar.SUNDAY :     System.out.print("일요일"); break;
			case Calendar.MONDAY :     System.out.print("월요일"); break;
			case Calendar.THURSDAY :   System.out.print("화요일"); break;
			case Calendar.WEDNESDAY :  System.out.print("수요일"); break;
		//	case Calendar.THURSDAY :   System.out.print("목요일"); break;
			case Calendar.FRIDAY :     System.out.print("금요일"); break;
			case Calendar.SATURDAY :   System.out.print("토요일"); break;
		}
		System.out.print("(" + hourOfDay + "시)" );
		if(ampm == Calendar.AM) System.out.print(" 오전");
		else System.out.print(" 오후 ");
		System.out.print(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초");
		
		
	}
}
