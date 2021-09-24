package com.yudong80.java.ch06;

class GreenGrass extends ColoredParent {
	@Override
	public String getPrimaryColor() {
		return "green";
	}
	
	@Override
	public String getSecondaryColor() {
		return "yellow";
	}
}

public class MethodOverridingExample02 {
	public static void main(String[] args) {	
		//1. 부모 클래스로 선언
		ColoredParent[] cps = {
			new ColoredParent(), 
			new PuppleChild(),
			new GreenGrass(),
		};
		
		for (ColoredParent cp: cps) {
			System.out.println("1차 색상? " + cp.getPrimaryColor());
			System.out.println("2차 색상? " + cp.getSecondaryColor());			
		}
	}
}
