package com.yudong80.java.ch08;

import java.util.Arrays;
import java.util.List;

public class ArraysExample {
	public static void main(String[] args) {
		//1. asList() 메서드
		List<String> planets = Arrays.asList(
				"수성", "목성", "토성");
		
		List<String> capitals = Arrays.asList(new String[] { 
				"서울", "워싱턴DC", "스톡홀름"
		});
		
		String[] alphas = {"A", "B", "C", "D", "E"} ;
		List<String> alphabets = Arrays.asList(alphas);
		
		System.out.println("행성 리스트: " + planets);
		System.out.println("수도 리스트: " + capitals);
		System.out.println("알파벳: " + alphabets);
		
		//2. copyOf() 메서드 
		String[] abc = Arrays.copyOf(alphas, 3);
		String[] abcde = Arrays.copyOf(alphas, 5);
		String[] abcde10 = Arrays.copyOf(alphas, 10);			
		
		//3. toString() 메서드
		System.out.println("abc 배열: " + Arrays.toString(abc));
		System.out.println("abcde 배열: " + Arrays.toString(abcde));
		System.out.println("abcde10 배열: " + Arrays.toString(abcde10));
		
		//4. equals() 메서드 
		boolean chk1 = Arrays.equals(alphas, abc);
		boolean chk2 = Arrays.equals(alphas, abcde);
		boolean chk3 = Arrays.equals(alphas, abcde10);
		
		System.out.println("alphas 배열 == abc 배열? " + chk1);
		System.out.println("alphas 배열 == abcde 배열? " + chk2);
		System.out.println("alphas 배열 == abcde10 배열? " + chk3);
		
		//5. fill() 메서드 
		int[] zeros = new int[5]; //초기값은 0
		System.out.println("zeros 배열: " + Arrays.toString(zeros));
		
		Arrays.fill(zeros, 1);
		System.out.println("fill(1) 배열: " + Arrays.toString(zeros));
	}
}
