package com.yudong80.java.ch06;

public class SavingAccount extends BankAccount{

	private static final double SAVING_ACCOUNT_INTEREST_RATE = 0.02; //2%
		
	public SavingAccount(String accNumber, int deposit) {
		super(accNumber);
		super.balance = deposit;
		System.out.println(accNumber + "계좌가 생성되었습니다 (잔고: " + deposit + " 원)");
	}
	
	public int getMaturedAmount() {
		double res = super.balance * (1 + SAVING_ACCOUNT_INTEREST_RATE);
		return (int) res;
	}
}
