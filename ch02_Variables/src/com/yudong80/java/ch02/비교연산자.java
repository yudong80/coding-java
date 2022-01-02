package com.yudong80.java.ch02;

public class 비교연산자 {
	public static void main(String[] args) {
		int a = 100;
		int b = 100;
		int c = 200;
		int d = 95;
		
		System.out.println("a 와 b는 같다? " + (a == b));
		System.out.println("a 와 c는 다르다? " + (a != c));
		System.out.println("c 는 a보다 크다? " + (c > a));
		System.out.println("a 는 c보다 작다? " + (a < c));
		System.out.println("a 는 d 이상이다? " + (a >= d));
		System.out.println("a 는 c 이하이다? " + (a <= c));		
	}    
}
