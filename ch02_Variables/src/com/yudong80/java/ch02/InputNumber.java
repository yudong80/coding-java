package com.yudong80.java.ch02;

import java.util.Scanner;

public class InputNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요? ");
		int first = s.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요? ");
		int second = s.nextInt();
		
		int added = first + second;
		System.out.println("두 숫자의 합은 " + added + " 입니다.");
	}
}
