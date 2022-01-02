package com.yudong80.java.ch02;

public class 비트연산자 {
	public static void main(String[] args) {
		//비트 AND(&)
		int a = 0x0A;  		//1010
		int mask1 = 0x01; 	//0001
		int mask2 = 0x02;	//0010
		System.out.println("16진수 a의 첫번째 자리수는? " + (a & mask1));
		System.out.println("16진수 a의 두번째 자리수는? " + (a & mask2));

		//비트 OR(&) 
		System.out.println("7(0x111) OR 16(0x1000) = " + (7 | 16));
		System.out.println("8(0x100) OR 15(0x111) = " + (8 | 15));
	}    
}
