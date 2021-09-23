package com.yudong80.java.ch03;

public class WhileBasic {
	public static void main(String[] args) {
		//1. 구구단 (3단)
		int dan = 3;
		int i = 1;
		
		while (i <= 9) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
			i += 1;
		}
	}
}
