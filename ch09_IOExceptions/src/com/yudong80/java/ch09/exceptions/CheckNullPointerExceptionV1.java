package com.yudong80.java.ch09.exceptions;

public class CheckNullPointerExceptionV1 {
	static boolean isLogin(String id) {
		//NPE 발생 가능성있음 
		if (id.equals("admin")) {
			return true;
		}
		return false;
	}
	
	static boolean isLoginSuccessful(String id) {
		//NPE 발생 예방됨 
		if ("admin".equals(id)) {
			return true;
		}
		return false;		
	}
	
	public static void main(String[] args) {
		//1. 정상적인 경우 
		boolean adminLogin = isLogin("admin");
		
		//2. NPE 발생 
		boolean nullLogin = isLogin(null);
	}
}