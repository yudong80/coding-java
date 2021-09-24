package com.yudong80.java.ch05;

public class StudentExample {
	//맴버 변수들 
	String name = "유동";
	String major = "컴퓨터공학";
	String minor = "경영학";
	int[] grades = {80, 70, 100, 90};
	
	//메서드
	void printInfo() {
		System.out.println("학생 이름: " + name);
		System.out.println("전공: " + major);
		System.out.println("부전공: " + minor);
		System.out.println("성적:");
		for (int grade : grades) {
			System.out.println(grade + "점");
		}
	}
	
	public static void main(String[] args) {
		new StudentExample().printInfo();
	}
}
