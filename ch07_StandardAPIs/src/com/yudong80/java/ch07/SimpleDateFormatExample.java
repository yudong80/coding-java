package com.yudong80.java.ch07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
	public static void main(String[] args) {
		//1. Date 클래스로 현재 시간 얻기
		Date now = new Date();
		
		//2. SimpleDateFormat 클래스로 양식 적용 
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy.MM.dd");
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat dateFormat3 = new SimpleDateFormat("yyyy/MM/dd");
		
		System.out.println("다양한 날짜 형식:");
		System.out.println("1: " + dateFormat1.format(now));
		System.out.println("2: " + dateFormat2.format(now));
		System.out.println("3: " + dateFormat3.format(now));
	}
}
