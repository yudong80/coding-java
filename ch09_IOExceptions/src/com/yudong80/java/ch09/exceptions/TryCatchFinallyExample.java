package com.yudong80.java.ch09.exceptions;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		//1. 정상적인 코드  
		try {
			System.out.println("정상적인 코드");
		} catch (Exception e) {
			System.out.println("Exception 발생: " + e.getMessage());
		} finally {
			System.out.println("예외가 발생하지 않아도 실행됩니다!");
		}
		
		//2. 산술 예외 발생 
		try {
			throw new ArithmeticException("산술 예외 발생"); 			
		} catch (NullPointerException e1) {
			System.out.println("NullPointerException 발생: " + 
				e1.getMessage());
		} catch (ArithmeticException e2) {
			System.out.println("ArithmeticException 발생: " + 
				e2.getMessage());
		} finally { 
			System.out.println("이 문장은 finally 실행됩니다!!");
		}
	}
}
