package com.yudong80.java.ch07;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatV2 {
	public static void main(String[] args) {
		//1. Date 클래스로 현재 시간 얻기 
		Date now = new Date();
		
		//2. 다양한 날씨 형식 적용 
		SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
		SimpleDateFormat dateAndDay = new SimpleDateFormat("yyyy년 MM월 dd일 EEEE");
		SimpleDateFormat time24based = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat timeAMPM = new SimpleDateFormat("h:mm a", Locale.US);
		
		System.out.println("현재 시간: " + timeFormat.format(now));
		System.out.println("날짜와 시간: " + dateAndDay.format(now));
		System.out.println("현재 시간(24시간 기준): " + time24based.format(now));
		System.out.println("현재 시간(AM/PM 기준): " + timeAMPM.format(now));
	}
}
