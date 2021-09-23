package com.yudong80.java.ch03;

public class ForAccess {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		//1. 간격있게 접근하기 (예: 짝수만 출력)  	
		System.out.println("짝수만 출력하기");
		for (int i = 1; i < numbers.length; i += 2) {
			System.out.println("짝수: " + numbers[i]);
		}
		
		//2. 역순으로 접근하기 
		System.out.println("역순으로 출력하기");
		for (int i = 0; i < numbers.length; ++i ) {
			int number = numbers[numbers.length -1 -i];
			System.out.println("숫자: " + number);
		}
	}
}
