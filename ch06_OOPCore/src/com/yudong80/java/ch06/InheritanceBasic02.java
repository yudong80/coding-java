package com.yudong80.java.ch06;

class SuperClass {
	public int number = 100;
	private String key = "KM-01-9867";
	
	public void print(String msg) {
		System.out.println("다음의 메시지를 출력합니다.\n" + msg);
	}
	
	protected String getKey() {
		return key;
	}
}

class SubClass extends SuperClass {
	public String getSubKey() {
		return "SUB-" + getKey();
	}
}

public class InheritanceBasic02 {
	public static void main(String[] args) {
		//1. 상위 클래스로 선언 
		SuperClass sc = new SubClass();
		sc.print("상위 클래스의 메서드를 호출합니다.");
		System.out.println("key? " + sc.getKey());
	
		//sc.getKey()는 호출할 수 없습니다 (protected 메서드)
		
		//2. 자식 클래스로 선언
		SubClass sub = new SubClass();
		System.out.println("subKey? "+ sub.getSubKey());
	}
}
