package com.yudong80.java.ch03;

public class ForGugudan {
	public static void main(String[] args) {
		//1. 구구단 (3단)
		int dan = 3;
		for (int i=1; i <= 9; ++i) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
}
