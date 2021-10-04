package com.yudong80.java.ch02;

public class ArrayInt {
	public static void main(String [] args) { 
		int[] grades = {80, 95, 92, 70};
		
		System.out.println("국어: " + grades[0]);
		System.out.println("수학: " + grades[1]);
		System.out.println("영어: " + grades[2]);
		System.out.println("과학: " + grades[3]);
		
		double average = (grades[0] + grades[1] + grades[2] + grades[3]) / grades.length;
		
		System.out.println("유동의 평균 점수: " + average);		
	}
}
