package com.yudong80.java.ch06.inner;

class OuterClass {
	private int outerAge = 21;
	
	public void printOuterAge() {
		System.out.println("외부 클래스의 나이? " + outerAge);
		
		//외부 클래스에서는 내부 클래스를 접근할 수 없음 
		//System.out.println("내부 클래스의 나이? " + innerAge); //컴파일 오류
	}
	
	class InnerClass {
		private int innerAge = 25;

		public void printInnerAge() {
			System.out.println("외부 클래스의 나이? " + outerAge);
			printOuterAge();
			
			System.out.println("내부 클래스의 나이? " + innerAge);
		}		
	}
}

public class InnerClassExample {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		
		outer.printOuterAge();
		inner.printInnerAge();
	}
}
