package com.yudong80.java.ch09.exceptions;


public class TryCatchMultiExample {
	public static void main(String[] args) {
		//1. 다중 try catch 문 
		try {
			throw new Exception();						
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 발생: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception 발생: " + e.getMessage());
		}
	}
}