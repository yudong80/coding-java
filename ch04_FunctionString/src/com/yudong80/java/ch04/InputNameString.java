package com.yudong80.java.ch04;

import java.util.Scanner;

public class InputNameString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		System.out.println("이름을 입력하세요? ");
		String name = s.nextLine();
		s.close();
		
		System.out.println(name + " 님 반갑습니다!");
	}
}
