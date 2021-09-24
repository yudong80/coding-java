package com.yudong80.java.ch08;

import java.util.HashSet;
import java.util.Set;

public class SetBasic {
	public static void main(String[] args) {
		//0. 자료 준비 
		Set<String> alphabets = prepareAlphabets();
		
		//1. add() 메서드 
		alphabets.add("B"); //중복 요소는 추가되지 않음 
		System.out.println("집합: " + alphabets);
		
		//2. remove() 메서드 
		alphabets.remove("B");
		System.out.println("B 제거후 집합: " + alphabets);
		
		//3. size() 메서드 
		System.out.println("집합 크기: " + alphabets.size());
		
		//4. 내용 조회 
		for (String a : alphabets) {
			System.out.println("알파벳: " + a);
		}
	}
	
	static Set<String> prepareAlphabets() {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		return set;
	}
}
