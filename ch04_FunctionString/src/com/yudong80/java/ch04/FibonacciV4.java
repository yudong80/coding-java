package com.yudong80.java.ch04;

import java.util.Scanner;

public class FibonacciV4 {
	static int getUserInput() {
		Scanner s = new Scanner(System.in);	
		System.out.println("수열 개수를 입력하세요");
		int num = s.nextInt();
		s.close(); //사용하면 최대한 빨리 닫아 줍니다 
		return num;
	}
	
	static void getFibonacci(int fibonacci[]) {
		int a = 1;
		int b = 1;
		
		int num = fibonacci.length;
		fibonacci[0] = a;
		fibonacci[1] = b;
		for (int i=0; i < num-2; ++i) {
			fibonacci[i+2] = a + b;
			a = b;
			b = fibonacci[i+2];
		}
	}
	
	static void printNumbers(int[] numbers) {
		System.out.println("결과: ");
		for (int number : numbers) {
			System.out.println(number);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("파보나치 수열 만들기");
		
		int num = getUserInput();
		
		int[] fibonacci = new int[num]; 
		getFibonacci(fibonacci);
		
		printNumbers(fibonacci);
	}
}
