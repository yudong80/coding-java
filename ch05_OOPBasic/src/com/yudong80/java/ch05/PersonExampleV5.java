package com.yudong80.java.ch05;

public class PersonExampleV5 {
	private static final String DEFAULT_DESTINATION = "집";
	private static final int DEFAULT_AGE = 0;
	private static final int DEFAULT_HEIGHT = 0;
	
	//멤버 변수
	private String firstName; 
	private String lastName;
	private int age = DEFAULT_AGE;
	private int height = DEFAULT_HEIGHT;
	private String destination = DEFAULT_DESTINATION;

	//생성자 
	public PersonExampleV5(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public PersonExampleV5(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public PersonExampleV5(String firstName, String lastName, int age, int height) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
	}
	
	//메서드
	public void goToOffice(final String destination) {
		this.destination = destination;
		System.out.println(getKoreanName(firstName, lastName) + 
				"님이 " + destination + "로 출근합니다.");
	}

	public String getPlace() {
		return destination;
	}
	
	private static String getKoreanName(final String firstName, final String lastName) {
		return lastName + " " + firstName;
	}
		
	public static void main(String[] args) {
		final String firstName = "Java";
		final String lastName = "Kim";
		PersonExampleV5 p = new PersonExampleV5(firstName, lastName);
		
		String now = p.getPlace();
		System.out.println(getKoreanName(firstName, lastName) + 
				"님은 현재 " + now + "에 있습니다.");
		
		if ("집".equals(now)) {
			p.goToOffice("회사");
		}
	}
}