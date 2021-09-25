package com.yudong80.java.ch09.exceptions;

public class MakeNullPointerExceptionV1 {
	public static void main(String[] args) {
		//1. null 객체 만들기 
		Object nullObj = null;
		
		//2. NullPointerException 발생
		// 어떤 메서드를 호출해도 죽습니다. 
		nullObj.toString();
		
		//3. 볼 수 없는 문장 
		System.out.println("이 문장은 실행되지 않습니다");
	}
}
