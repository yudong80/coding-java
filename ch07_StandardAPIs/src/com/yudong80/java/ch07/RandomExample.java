package com.yudong80.java.ch07;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		Random r = new Random();
		final int NUMBERS = 10;
		
		//1. 정수형 난수
		System.out.println("난수들(int형): ");
		for (int i=0; i< NUMBERS; ++i) {
			System.out.print(r.nextInt() + " ");
		}		
		
		//2. 정수형 난수(bounded) 
		System.out.println("\n난수들(int형, bounded): ");
		for (int i=0; i< NUMBERS; ++i) {
			System.out.print(r.nextInt(1000) + " ");
		}		
		
		//3. double 형 난수 
		System.out.println("\n난수들(double형): ");
		for (int i=0; i< NUMBERS; ++i) {
			System.out.print(r.nextDouble() + " ");
		}		

		//4. float 형 난수 
		System.out.println("\n난수들(float형): ");
		for (int i=0; i< NUMBERS; ++i) {
			System.out.print(r.nextFloat() + " ");
		}
	}
}
