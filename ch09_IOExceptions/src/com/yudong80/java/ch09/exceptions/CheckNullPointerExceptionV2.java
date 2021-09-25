package com.yudong80.java.ch09.exceptions;

public class CheckNullPointerExceptionV2 {	
	static String[] getLoginUsers(int page) {
		if (page == 100) {
			return new String[] {"A", "B", "C"};
		}
		
		//이 메서드는 null을 반환할 수 있습니다. 
		return null;
	}
		
	public static void main(String[] args) {
		//1. 정상적인 경우 
		String[] users = getLoginUsers(100);
		System.out.println("로그인한 사용자의 수는 " + users.length + "입니다.");
		
		//2. NullPoinerException 발생 
		String[] anotherUsers = getLoginUsers(200);
		//System.out.println("로그인한 또다른 사용자의 수는 " + anotherUsers.length + "입니다.");
		
		//3. NPE 대처하기 
		int userCount = 0; 
		if (anotherUsers != null) {
			userCount = anotherUsers.length;
		}
		System.out.println("로그인한 또다른 사용자의 수는 " + userCount + "입니다.");
	}
}


