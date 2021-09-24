package com.yudong80.java.ch06;

class ParentClass {
	public int publicField = 999;;
	private String privateField;
	
	public void publicMethod(String arg) {
		System.out.println("부모 클래스의 public method 입니다. arg? " + arg);
	}
	
	private void privateMethod() {
		System.out.println("부모 클래스의 private method 입니다. 상속되지 않습니다.");
	}
}

class ChildClass extends ParentClass{
	//내용 없음
}

public class InheritanceBasic01 {
	public static void main(String[] args) {
		//1. 부모 클래스로 선언 
		ParentClass parent = new ChildClass();
		parent.publicMethod("부모 클래스로 선언");
		System.out.println("부모 클래스의 public field 값? " + parent.publicField);

		//2. 자식 클래스로 선언
		ChildClass child = new ChildClass(); 
		child.publicMethod("자식 클래스로 호출");
		System.out.println("자식 클래스의 public field 값? " + child.publicField);
	}
}

 