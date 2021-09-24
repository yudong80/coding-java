package com.yudong80.java.ch07;

import java.util.Calendar;
import java.util.Date;

public class Now {
	public static void main(String[] args) {
		//1. Date 클래스로 현재 시간 얻기 
		Date date = new Date(); 
		System.out.println("현재 시간:" + date.toString());
		
		//2. Calendar 클래스로 현재 시간 얻기 
		Calendar cal = Calendar.getInstance();
		System.out.println("현재 시간:" + cal.getTime());
	}
}
