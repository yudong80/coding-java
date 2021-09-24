package com.yudong80.java.ch06.abs;

public class PhoneExampleV1 {
	public static void main(String[] args) {
		//1. NovaPhone 객체 생성
		Phone phone = new NovaPhone("010-1111-2222", "NovaX");
		
		boolean valid = phone.validate("NOVA:888-9999");
		if (valid) {
			//2. 첫번째 통화 시도 
			phone.call("013-4444-5555");
			
			//3. 두번째 통화 시도 
			phone.call("010-1111-2222");
		}
	}
}
