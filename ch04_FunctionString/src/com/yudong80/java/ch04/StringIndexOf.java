package com.yudong80.java.ch04;

public class StringIndexOf {
	public static void main(String[] args) {
		//1. indexOf() 
		String poem = 
		"Two roads diverged in a yellow wood,\n" + 
		"And sorry I could not travel both";

		int firstAndPosition = poem.indexOf("And");
		int firstIPosition = poem.indexOf("I");
		System.out.println("And 의 첫 위치는 " + firstAndPosition + " 입니다.");
		System.out.println("I 의 첫 위치는 " + firstIPosition + " 입니다.");
		
		int secondLineIndex = firstAndPosition;
		System.out.println("두번째 줄의 위치는 " + secondLineIndex + " 입니다.");
		System.out.println("두번째 줄의 내용은 " + poem.substring(secondLineIndex) + " 입니다.");
				
		//2. lastIndexOf()
		poem += "\nAnd be one traveller, long I stood";
		
		int lastAndPostion = poem.lastIndexOf("And");
		System.out.println("And 의 마지막 위치는 " + lastAndPostion + " 입니다.");
	}
}
