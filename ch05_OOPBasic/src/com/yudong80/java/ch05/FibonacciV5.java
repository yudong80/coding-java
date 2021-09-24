package com.yudong80.java.ch05;

public class FibonacciV5 {
	int[] numbers; //맴버 변수 
	
	void generateNumbers(int cnt) { //메서드 
		int a = 1;
		int b = 1;
		
		numbers = new int[cnt];
		for (int i=1; i <= numbers.length; ++i) {
			numbers[i-1] = a + b;
			a = b;
			b = numbers[i-1];
		}		
	}
	
	void printNumbers() { //메서드
		System.out.println("결과: ");
		for (int number : numbers) {
			System.out.println(number);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("파보나치 수열 만들기");	
		FibonacciV5 f = new FibonacciV5();
		f.generateNumbers(10);
		f.printNumbers();
	}
}
