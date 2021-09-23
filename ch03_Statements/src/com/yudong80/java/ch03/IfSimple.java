package com.yudong80.java.ch03;

public class IfSimple {
	public static void main(String[] args) {
		//1. 단순 if문 
		int even = 100; 
		if (even %2 == 0) { 
			System.out.println(even + "은 짝수입니다.");
		}
		
		int odd = 99;
		if (odd %2 == 1) { 
			System.out.println(odd + "는 홀수입니다.");
		}
	}
}
