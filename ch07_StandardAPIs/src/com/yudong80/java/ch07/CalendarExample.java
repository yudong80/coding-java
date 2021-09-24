package com.yudong80.java.ch07;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		//1. 날짜 양식 정하기
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		//2. 오늘 날짜 
		Calendar cal = Calendar.getInstance();
		String today = dateFormat.format(cal.getTime());
		System.out.println("오늘은 " + today);
		
		//3. 어제 날짜 
		cal.add(Calendar.DATE, -1);
		String yesterday = dateFormat.format(cal.getTime());
		System.out.println("어제는 " + yesterday);
		
		//4. 5개월 후 
		Calendar now = Calendar.getInstance();
		now.add(Calendar.MONTH, +5);
		String afterFiveMonths = dateFormat.format(now.getTime());
		System.out.println("5개월후 날짜는 " + afterFiveMonths);
	}
}
