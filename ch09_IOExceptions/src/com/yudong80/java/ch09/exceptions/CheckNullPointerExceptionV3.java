package com.yudong80.java.ch09.exceptions;

public class CheckNullPointerExceptionV3 {		
	public static void main(String[] args) {
		String text = "Hello Java";
		
		//1. 정상적인 경우 
		boolean endsWithJava = text.endsWith("Java");
		System.out.println(text + "는 Java로 끝나나요? " + endsWithJava);
				
		//2. NPE 발생 
		boolean endsWithNull = text.endsWith(null);
		System.out.println(text + "는 null로 끝나나요? " + endsWithNull);
	}
}


