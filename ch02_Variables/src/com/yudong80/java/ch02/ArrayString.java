package com.yudong80.java.ch02;

import java.util.Scanner;

public class ArrayString {
	public static void main(String[] args) {
		String[] cities = new String[10];
		
		int idx = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 도시를 입력하세요");
		cities[idx++] = s.nextLine();
		
		System.out.println("두번째 도시를 입력하세요");
		cities[idx++] = s.nextLine();
		
		System.out.println("세번째 도시를 입력하세요");
		cities[idx++] = s.nextLine();		
		s.close();
		
		System.out.println("-----------------------");
		System.out.println("입력한 도시의 개수는 " + idx);
		System.out.println("첫번째 도시는 " + cities[0]);
		System.out.println("마지막 도시는 " + cities[idx-1]);
	}
}
