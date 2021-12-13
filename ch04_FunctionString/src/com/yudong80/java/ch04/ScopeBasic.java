package com.yudong80.java.ch04;

public class ScopeBasic {
	static int CONSTANT = 999;
	
	String title = "ScopeBasic";
	
	public static void main(String[] args) {
		//1. 지역 변수 
		int number = 333;
		System.out.println("지역변수 number의 값은 " + number);
		
		//2. 멤버 변수 (5장 참조)
		//String str = title;  참조 불가
		System.out.println("멤버변수 title은 참조할 수 없습니다.");
		
		//3. static 변수
		System.out.println("static 변수인 CONSTANT의 값은 " + CONSTANT);
		
		//4. 괄호내의 scope
		for(int i=0; i < 5; ++i) { 
			System.out.println(" i = " + i);
		}
		System.out.println("중괄호를 벋어나면 i 변수를 참조할 수 없습니다.");
		
		//5. 다른  메서드의 scope
		int seven = 7;
		boolean isNaturalNumber = isNaturalNumber(seven);
		System.out.println("isNaturalNumber() 메서드에 있는 변수를 참조할 수 없습니다.");
	}
	
	static boolean isNaturalNumber(int num) { 
		if (num >= 0) {
			return true;
		}
		return false;
	}
}
