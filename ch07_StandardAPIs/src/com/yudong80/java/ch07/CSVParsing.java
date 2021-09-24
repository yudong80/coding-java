package com.yudong80.java.ch07;

import java.util.StringTokenizer;

public class CSVParsing {
	public static void main(String[] args) {
		//1. 성적 데이터 (이름, 국어, 영어, 수학 순)
		String[] grades = {
			"김강열, 80, 90, 100",
			"염지수, 70, 100, 88",
			"강민호, 88, 33, 77"
		};
		
		//2. 성적 데이터 출력
		final String delim = ",";
		
		for (String line: grades) {
			StringTokenizer st = new StringTokenizer(line, delim);
			
			//데이터가 유효하지 않은 경우 예외 처리 
			if (!st.hasMoreTokens()) continue;
			
			//데이터 출력 
			String name = st.nextToken();
			String korean = st.nextToken();
			String english = st.nextToken();
			String math = st.nextToken();
			
			System.out.println(getGradeString(name, korean, english, math));
		}
	}
	
	static String getGradeString(String name, String korean, String english, String math) {
		StringBuilder sb = new StringBuilder();
		sb.append("이름: ").append(name).append('\n');
		sb.append("국영수 성적: {").append(korean).append(", ");
		sb.append(english).append(", ");
		sb.append(math).append("} \n");
		
		return sb.toString();
	}
}
