package com.yudong80.java.ch03;

public class WhileArray {
	public static void main(String[] args) {
		int[] numbers = {
			10, 77, 33, 66, 25, 100, 200, 1000, 9999, 8888,
		};
		
		int i=0;
		while (i < numbers.length) {
			int num = numbers[i];
			
			if (num %2 == 0) {
				System.out.println(num + "은 짝수입니다.");
			} else {
				System.out.println(num + "은 홀수입니다.");
			}
			i += 1;
		}
	}
}
