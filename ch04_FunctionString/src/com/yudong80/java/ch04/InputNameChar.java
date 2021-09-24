package com.yudong80.java.ch04;

import java.util.Scanner;

public class InputNameChar {
	public static void main(String[] args) {
		System.out.println("이름을 입력하세요? ");
		
		System.out.println("이름이 몇자인가요? ");
		Scanner s = new Scanner(System.in);
		int nameLength = s.nextInt();
		
		char[] name = new char[nameLength];
		for (int i=0; i < nameLength; ++i) {
			System.out.println((i+1) +  "번째 글자를 입력하세요?");
			char ch = s.next().charAt(0); //nextChar()가 없어서 유사하게 만듬 
			name[i] = ch;
		}
		s.close();
		
		for (char ch : name) {
			System.out.print(ch);
		}
		System.out.println(" 님 반갑습니다!");
	}
}
