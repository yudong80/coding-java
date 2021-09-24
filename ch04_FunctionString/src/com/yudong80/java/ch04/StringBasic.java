package com.yudong80.java.ch04;

public class StringBasic {
	public static void main(String[] args) {
		//1. String은 문자열 변수를 의미합니다. 
		String station = "광화문";
		System.out.println(station + "역에 도착하였습니다.");
		
		//2. String은 길이를 가지고 있습니다. 
		System.out.println(station + " 변수의 길이는 " + station.length() + " 입니다.");
		
		//3. String은 char로 이루어져 있습니다. 
		System.out.println("이번역은 ");
		for (int i=0; i < station.length(); ++i) {
			char c = station.charAt(i);
			System.out.println(c);
		}
		System.out.println("입니다.");
		
		//4. String은 재할당할 수 있습니다.
		station = "충정로";
		System.out.println("다음 역은 " + station + "역압나다.");		
	}
}
