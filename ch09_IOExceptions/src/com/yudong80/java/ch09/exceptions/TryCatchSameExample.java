package com.yudong80.java.ch09.exceptions;

public class TryCatchSameExample {
	public static void main(String[] args) {
		//1. try catch 문 (catch문 축약)
		try {
			throw new ArithmeticException("예외 발생");						
		} catch (NullPointerException | ArithmeticException e) {
			System.out.println("NullPointerException 혹은 ArithmeticException 발생: " + e.getMessage());
		} 
	}
}
