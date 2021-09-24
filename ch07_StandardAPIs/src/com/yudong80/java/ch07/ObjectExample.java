package com.yudong80.java.ch07;

public class ObjectExample {
	public static void main(String[] args) {
		//1. Object 객체 생성
		Object a = new Object();
		Object b = new Object();
		
		//2. equals() 메서드 
		boolean isSameEqual = a.equals(a);
		boolean isABEqual = a.equals(b);
		
		System.out.println("같은 객체의 equals? " + isSameEqual);
		System.out.println("다른 객체의 equals? " + isABEqual);
		
		//3. hashCode() 메서드 
		int hashCodeA = a.hashCode();
		int hashCodeB = b.hashCode();
		String hexHashCodeA = Integer.toHexString(hashCodeA);
		String hexHashCodeB = Integer.toHexString(hashCodeB);
		System.out.println("a 객체의 hash code? " + hashCodeA + " > hexString? " + hexHashCodeA);
		System.out.println("b 객체의 hash code? " + hashCodeB + " > hexString? " + hexHashCodeB);
				
		//4. toString() 메서드 
		System.out.println("a.toString()? " + a.toString());
		System.out.println("b.toString()? " + b.toString());
	}
}
