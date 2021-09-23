package com.yudong80.java.ch03;

import java.util.Scanner;

public class ArrayStringExampleV2 {
	public static void main(String[] args) {
		String[] cities = new String[10];
		
		Scanner s = new Scanner(System.in);
		int count = 3;
		for (int idx=0; idx < count; ++idx) {
			System.out.println((idx+1) + "번째 도시를 입력하세요");
			cities[idx] = s.nextLine();
		}
		s.close();
		
		System.out.println("-----------------------");
		System.out.println("입력한 도시의 개수는 " + count);
		System.out.println("첫번째 도시는 " + cities[0]);
		System.out.println("마지막 도시는 " + cities[count-1]);
	}
}
