package com.yudong80.java.ch03;

public class ElectricityBillV1 {
	public static void main(String[] args) {
		System.out.println("======================");
		System.out.println(" 주택용 전기요금(저압) 계산기 ");
		System.out.println("======================");
		
		//1. 100 이하인 경우 
		int value = 99; 
		double price = 0;
		
		if (value <= 100) {
			price = value * 60.7; 
		}
		
		System.out.println(value + "kWh의 전기 요금은 " + price + "원 입니다.");
		
		//2. 100 초과 200 이하인 경우  
		value = 150;
		price = 0; 
		
		if (value <= 100) { 
			price = value * 60.7;
		} else {
			price = (100 * 60.7) + (value - 100) * 125.9;
		}
		
		System.out.println(value + "kWh의 전기 요금은 " + price + "원 입니다.");	
	}
}