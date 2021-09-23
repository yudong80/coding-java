package com.yudong80.java.ch02;

public class Operators {
	public static void 산술연산자() {    
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
	
	public static void 대입연산자() { 
		int studentNo = 100;
		String studentName = "Dong Hwan Yu";
		double grade = 4.0;
		
		System.out.println("학번: " + studentNo);
		System.out.println("이름: " + studentName);
		System.out.println("학점: " + grade);
		
		double v = 100;
		v+=3;	System.out.println("v += 3: " + v);
		v-=3;	System.out.println("v -= 3: " + v);
		v*=3;	System.out.println("v *= 3: " + v);
		v/=3;	System.out.println("v /= 3: " + v);
		v%=3;	System.out.println("v %= 3: " + v);		
	}

	public static void 비교연산자() {
		int a = 100;
		int b = 100;
		int c = 200;
		int d = 95;
		
		System.out.println("a 와 b는 같다? " + (a == b));
		System.out.println("a 와 c는 다르다? " + (a != c));
		System.out.println("c 는 a보다 크다? " + (c > a));
		System.out.println("a 는 c보다 작다? " + (a < c));
		System.out.println("a 는 d 이상이다? " + (a >= d));
		System.out.println("a 는 c 이하이다? " + (a <= c));		
	}
	
	public static void 논리연산자() {
		int a = 4;
		boolean inTheMiddle = 3 < a && a < 5;
		boolean isNaturalNumber = a > 0 || a == 0; 
		boolean isPositive = !( a < 0);
		
		System.out.println("a 는 3보다 크고 4보다 작다? " + inTheMiddle);
		System.out.println("a 는 자연수이다? " + isNaturalNumber);
		System.out.println("a 는 양수이다? " + isPositive);
	}
	
	public static void 비트연산자() {
		int a = 0x0A;  		//1100
		int mask1 = 0x01; 	//0001
		int mask2 = 0x02;	//0010
		int mask3 = 0x04;	//0100
		int mask4 = 0x08;	//1000
		
		System.out.println("16진수 a의 첫번째 자리수는? " + (a & mask1));
	}
	
	public static void main(String[] args) { 
		산술연산자();
		//대입연산자();
		//비교연산자();
		//논리연산자();
		//비트연산자();
	}
}
