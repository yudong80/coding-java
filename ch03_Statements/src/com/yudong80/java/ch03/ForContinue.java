package com.yudong80.java.ch03;

public class ForContinue {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		for (int i=0; i < numbers.length; ++i) {
			int num = numbers[i];
			if (num < 5) {
				continue; //for 문에서는 정상동작합니다.
			}
			
			System.out.println("이번 숫자는 " + num + " 입니다.");
		}
	}
}