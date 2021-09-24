package com.yudong80.java.ch06;

public class InheritanceBasic03 {
	public static void main(String[] args) {
		//1. 부모 클래스로 선언 
		BankAccount account = new SavingAccount("ACC-2020-01", 500_000);
		System.out.println("계좌의 잔고는? " + account.getBalance() + "원");
		
		account.deposit(100_000);
		account.withdraw(50_000);
		System.out.println("입출금 후 계좌의 잔고는? " + account.getBalance() + "원");
		
		//account.getMaturedAmount() 호출 불가 
		
		//2. 자식 클래스로 선언 
		SavingAccount sav = new SavingAccount("ACC-2020-02", 5_000_000);
		System.out.println("계좌의 잔고는? " + sav.getBalance() + "원");
		
		sav.deposit(5_000_000);
		System.out.println("정기 예금 만기 금액은? " + sav.getMaturedAmount() + "원");
	}
}
