package com.yudong80.java.ch07;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		//1. 성적 데이터 (이름, 국어, 영어, 수학 순)
		String grades = "김강열 80 90 100";
		
		//2. 성적 데이터 출력 
		StringTokenizer st = new StringTokenizer(grades);
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}	
	}
}
