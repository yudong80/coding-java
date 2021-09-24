package com.yudong80.java.ch08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		//0. 자료 준비 
		Set<String> alphabets = SetBasic.prepareAlphabets();
		
		//1. addAll() 메서드 
		Set<String> others = new HashSet<>();
		others.add("D");
		others.add("E");
		alphabets.addAll(others);
		
		//2. contains() 메서드 
		System.out.println("집합에 A 포함? " + alphabets.contains("A"));
		System.out.println("집합에 K 포함? " + alphabets.contains("K"));
		
		//3. iterator() 메서드 
		Iterator<String> iterator = alphabets.iterator();
		while (iterator.hasNext()) {
			System.out.println("알파벳: " + iterator.next());
		}
		
		//4. toArray() 메서드 
		String[] alphas = alphabets.toArray(new String[0]);
		System.out.println("알파벳[0]: " + alphas[0]);
		
		//5. clear() , isEmpty() 메서드 
		alphabets.clear();
		System.out.println("clear() 후 빈 집합? " + alphabets.isEmpty());
	}
}
