package com.yudong80.java.ch04;

import java.util.Scanner;

public class EvenOddNumbersV2 {
	public static boolean isEven(int num) { 
		return num % 2 == 0;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//0보다 작으면 프로그램 종료 
		while(true) {
			System.out.println("[짝수홀수 판별기] 수를 입력하세요? ");
			int num = s.nextInt();
			
			if (num < 0) break;
			
			if (isEven(num)) {
				System.out.println(num + "은 짝수입니다.");
			} else {
				System.out.println(num + "은 홀수입니다.");
			}
		}
		
		System.out.println("프로그램이 종료되었습니다.");
		s.close();
	}
}