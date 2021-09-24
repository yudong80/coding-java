package com.yudong80.java.ch04;

public class StringLengthCharAt {
	public static void main(String[] args) {
		//1. length() 사용법
		String java = "Java";
		int len = java.length();
		System.out.println(java + "의  길이는 " + len + " 입니다.");
		
		String emptyString = "";
		System.out.println("빈 문자열의  길이는 " + emptyString.length() + " 입니다.");
		
		//2. charAt() 사용법
		String[] stars = {
				"물병자리", "쌍둥이자리", "게자리",
		};
		
		for (String star : stars) {
			char firstChar = star.charAt(0);
			char lastChar = star.charAt(star.length() -1);
			System.out.println(star + "의 첫번째 글자는 " + firstChar + " 입니다");
			System.out.println(star + "의 마지막 글자는 " + lastChar + " 입니다");
		}
	}
}
