package com.yudong80.java.ch06;

class Ancestor {
	public String getName() { 
		return "Niki"; 
	}

	protected String getCity() { 
		return "Seoul"; 
	}

	int getHeight() { 
		return 165; 
	}
	
	private String getAddress() { 
		return "Secret"; 
	}
}

class Descendant extends Ancestor {
	@Override
	//public 만 가능 
	public String getName() {
		return "Julie";
	}
	
	@Override
	//public, protected 가능
	public String getCity() {
		return super.getCity();
	}

	@Override
	//public , protected, (default) 가능
	protected int getHeight() { 	 
		return super.getHeight() + 10;
	}
	
	//private method는 메서드 오버라이딩 불가
}

public class MethodOverridingExample04 {
	public static void main(String[] args) {
		Ancestor man = new Descendant();
		System.out.println("이름? " + man.getName());
		System.out.println("도시? " + man.getCity());
		System.out.println("키? " + man.getHeight());
	}
}
