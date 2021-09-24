package com.yudong80.java.ch07;

public class StringBuilderExample {
	public static void main(String[] args) {
		//0. 기본정보
		String title = "Java API doc";
		String pkg = "java.lang";
		String cls = "StringBuilder";
		String desc = "StringBuilder는 문자열을 생성해줌";
		String seeAlso = "구) StringBuffer 클래스";
		
		//1. String을 사용한 문자열 구성 
		String apiDoc = title + "\n" +
				"패키지: " + pkg + "\n" +
				"클래스: " + cls + "\n" +
				"내용: " + desc + "\n" + 
				"비고: " + seeAlso;
		System.out.println(apiDoc);
		System.out.println("-------------------------");
				
		//2. StringBuilder를 사용한 문자열 구성
		StringBuilder sb = new StringBuilder();
		sb.append(title).append('\n');
		sb.append("패키지: ").append(pkg).append('\n');
		sb.append("클래스: ").append(cls).append('\n');
		sb.append("내용: ").append(desc).append('\n');
		sb.append("비고: ").append(seeAlso).append('\n');
		
		System.out.println(sb.toString());
	}
}
