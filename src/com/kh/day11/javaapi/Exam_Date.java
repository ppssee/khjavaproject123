package com.kh.day11.javaapi;

import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Date {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);	 // Wed Dec 07 12:34:12 KST 2022 출력
	
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); //ss는 초
		SimpleDateFormat trans2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:SS");//SS는 밀리초
		
		
		String transDate1= trans.format(date);
		String transDate2= trans.format(date);
		System.out.println(transDate1);	//  2022/12/07 12:34:29 출력
		System.out.println(transDate2);
		////////////////////////////////////
		
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.getTime());		// Wed Dec 07 12:35:23 KST 2022
		String changed = trans2.format(calendar.getTime());
		System.out.println(changed);    // 2022/12/07 12:36:20 출력
		
				
	}

}
