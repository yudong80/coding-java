package com.yudong80.java.ch06;

class ColoredParent {
	public String getPrimaryColor() {
		return "red";
	}
	
	public String getSecondaryColor() {
		return "blue";
	}
}

class PuppleChild extends ColoredParent {
	@Override
	public String getSecondaryColor() {
		return "pupple";
	}
}

public class MethodOverridingExample01 {
	public static void main(String[] args) {	
		//1. 부모 객체 생성
		ColoredParent cp = new ColoredParent();
		System.out.println("1차 색상? " + cp.getPrimaryColor());
		System.out.println("2차 색상? " + cp.getSecondaryColor());
		
		//2. 자식 객체 생성
		ColoredParent pupple = new PuppleChild();
		System.out.println("1차 색상? " + pupple.getPrimaryColor());
		System.out.println("2차 색상? " + pupple.getSecondaryColor());  
	}
}
