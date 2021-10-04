package com.yudong80.java.ch06;

class SuperClass {
	public int publicNumber = 100;
	protected String protectedKey = "KM-01-9867";
	
	public void print(String msg) {
		System.out.println("SUPER: " + msg);
	}
	
	protected String getKey() {
		System.out.println("SUPER:getKey() 호출");
		return protectedKey;
	}
}

class SubClass extends SuperClass {
	public String getKey() {
		System.out.println("SUB:getKey() 호출");
		return "SUB-" + super.protectedKey;
	}

	public void printSub(String msg) { 
		System.out.println("SUB: " + msg);
	}
}

public class InheritanceBasic02 {
	public static void main(String[] args) {
		//1. 상위 클래스로 선언 
		SuperClass sc = new SubClass();
		sc.print("상위 클래스의 메서드를 호출합니다.");
		System.out.println("key? " + sc.getKey());
	
		//2. 자식 클래스로 선언
		SubClass sub = new SubClass();
		System.out.println("subKey? "+ sub.getKey());
	}
}
