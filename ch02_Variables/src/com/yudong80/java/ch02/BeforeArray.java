package com.yudong80.java.ch02;

public class BeforeArray {
	public static void main(String[] args) {
		int korean = 80;
		int math = 95;
		int english = 92;
		int science = 70;
		
		System.out.println("국어: " + korean);
		System.out.println("수학: " + math);
		System.out.println("영어: " + english);
		System.out.println("과학: " + science);
		
		double average = ((double)(korean + math + english + science)) / 4;
		
		System.out.println("유동의 평균 점수: " + average);
	}
}
