package com.yudong80.java.ch05;

public class PersonExampleV2 {
	//멤버 변수
	String firstName = "자바"; 
	String lastName = "김";
	int age = 25;
	int height = 182;

	//생성자 
	PersonExampleV2(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	PersonExampleV2(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	PersonExampleV2(String firstName, String lastName, int age, int height) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
	}
	
	//메서드
	void goToOffice(String destination) { 
		System.out.println(getKoreanName() + "님이 " + destination + "으로 출근합니다.");
	}

	String getKoreanName() {
		return lastName + " " + firstName;
	}
		
	public static void main(String[] args) {
//		PersonExampleV2 p = new PersonExampleV2(); -- 오류 발생 
		PersonExampleV2 p = new PersonExampleV2("Java", "Kim");
		p.goToOffice("마곡");
	}
}