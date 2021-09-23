package com.yudong80.java.ch02;

import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요? ");
		String name = s.nextLine();
		
		System.out.println("사는 곳을 입력하세요? ");
		String city = s.nextLine();
		
		System.out.println(city + "에 사는 " + name + "님 반갑습니다!");
	}
}
