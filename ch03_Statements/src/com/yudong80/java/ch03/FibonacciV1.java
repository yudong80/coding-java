package com.yudong80.java.ch03;

import java.util.Scanner;

public class FibonacciV1 {	
	public static void main(String[] args) {
		System.out.println("파보나치 수열 만들기");
		
		Scanner s = new Scanner(System.in);	
		System.out.println("수열 개수를 입력하세요");
		int num = s.nextInt();
		s.close(); //사용하면 최대한 빨리 닫아 줍니다 
		
		int a = 1;
		int b = 1;
		
		int[] fibonacci = new int[num];
		fibonacci[0] = a;
		fibonacci[1] = b;
		for (int i=0; i < (num - 2); ++i) {
			fibonacci[i+2] = a + b;
			a = b;
			b = fibonacci[i+2];
		}
		
		System.out.println("결과: ");
		for (int i=0; i < num; ++i) {
			System.out.println(fibonacci[i]);
		}
	}
}
