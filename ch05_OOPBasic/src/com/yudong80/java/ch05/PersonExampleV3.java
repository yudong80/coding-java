package com.yudong80.java.ch05;

public class PersonExampleV3 {
	//멤버 변수
	private String firstName = "자바"; 
	private String lastName = "김";
	private int age = 25;
	private int height = 182;

	//생성자 
	public PersonExampleV3(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public PersonExampleV3(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public PersonExampleV3(String firstName, String lastName, int age, int height) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
	}
	
	//메서드
	public void goToOffice(String destination) { 
		System.out.println(getKoreanName() + "님이 " + destination + "으로 출근합니다.");
	}

	private String getKoreanName() {
		return lastName + " " + firstName;
	}
		
	public static void main(String[] args) {
//		PersonExampleV2 p = new PersonExampleV2(); -- 오류 발생 
		PersonExampleV3 p = new PersonExampleV3("Java", "Kim");
		p.goToOffice("마곡");
	}
}