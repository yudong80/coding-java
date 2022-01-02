package com.yudong80.java.ch02;

public class 산술연산자 {
	public static void main(String[] args) {    
		int added = 100 + 200;
		int subtracted = 500 - 300;
		int multiplied = 10 * 20;
		double divided = 100 / 3;
		
		System.out.println("덧셈 결과: 100 + 200 = " + added);
		System.out.println("뺄셈 결과: 500 - 300 = " + subtracted);
		System.out.println("곱셈 결과: 10 * 20 = " + multiplied);
		System.out.println("나눗셈 결과: 100 / 3 = " + divided);

		int 몫 = 100 / 3;
		int 나머지 = 100 % 3;
		System.out.println("몫: 100 / 3 = " + 몫);
		System.out.println("나머지: 100 / 3 = " + 나머지);
		
		++added;
		--subtracted;
		System.out.println("증가: ++added = " + added);
		System.out.println("감소: --subtracted = " + subtracted);		
	}    
}
