package com.yudong80.java.ch04;

public class StaticBasic {
	static double PIE = 3.141592; 
	
	static boolean isPositive(int num) { 
		return num > 0;
	}
	
	public static void main(String[] args) {
		//1. static은 메서드 내부에서는 사용할 수 없습니다. 
		//static int num = 0; //컴파일 오류 발생! 
		
		//2. static은 함수 외부에 있는 변수를 참조합니다. 
		System.out.println("PIE 는 " + PIE + " 입니다.");
		
		//3. static은 함수에 붙일 수 있습니다.
		int num = 500;
		boolean isPositive = isPositive(num);
		System.out.println(num + "은 양수인가요? " + isPositive);
	}
}
