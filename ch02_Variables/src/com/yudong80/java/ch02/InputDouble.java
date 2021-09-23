package com.yudong80.java.ch02;

import java.util.Scanner;

public class InputDouble {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 실수를 입력하세요? ");
		double first = s.nextDouble();
		
		System.out.println("두번째 실수를 입력하세요? ");
		double second = s.nextDouble();
		
		double added = first + second;
		System.out.println("두 실수의 합은 " + added + " 입니다.");		
	}
}
