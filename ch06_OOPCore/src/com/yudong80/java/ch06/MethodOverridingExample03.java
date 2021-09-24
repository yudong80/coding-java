package com.yudong80.java.ch06;

public class MethodOverridingExample03 {
	public static void main(String[] args) {
		//1. 문제 상황 
		BankAccount acc1 = new SavingAccount("ACC-101", 500_000);
		acc1.deposit(100_000); //추가 불입 안되어야 함 
		acc1.withdraw(300_000); //만기전에는 인출 불가 해야 함 
		System.out.println("- 잔고는 " + acc1.getBalance() + "원 입니다.");
		
		//2. 메서드 오버라이딩으로 문제 해결 
		SavingAccountV2 sav = new SavingAccountV2("ACC-102", 700_000);
		sav.deposit(100_000);
		System.out.println("- 잔고는 " + sav.getBalance() + "원 입니다."); //잔고가 그대로임 
		
		sav.expire();
		System.out.println("- 잔고는 " + sav.getBalance() + "원 입니다.");
		sav.withdraw(500_000);
		System.out.println("- 잔고는 " + sav.getBalance() + "원 입니다.");
	}
}
