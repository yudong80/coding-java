package com.yudong80.java.ch06;

public class SavingAccountV2 extends BankAccount {
	private static final double SAVING_ACCOUNT_INTEREST_RATE = 0.02; //2%
	
	private boolean isExpired = false;
	
	public SavingAccountV2(String accNumber, int deposit) {
		super(accNumber);
		super.balance = deposit;
		System.out.println(accNumber + "계좌가 생성되었습니다 (잔고: " + deposit + " 원)");
	}
	
	public int getMaturedAmount() {
		double res = super.balance * (1 + SAVING_ACCOUNT_INTEREST_RATE);
		return (int) res;
	}	
	
	public void expire() {
		isExpired = true;
		balance = getMaturedAmount();
	}

	@Override
	public void deposit(int amount) {
		System.out.println("정기 예금은 추가 불입을 할 수 없습니다.");
	}
	
	@Override
	public void withdraw(int amount) {
		if(!isExpired) {
			System.out.println("정기 예금은 만기전에 인출이 불가합니다.");
			return;
		}
		
		super.withdraw(amount);
	}
}