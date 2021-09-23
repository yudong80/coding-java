package com.yudong80.java.ch03;

public class ForEach {
	public static void main(String[] args) {
		System.out.println("배열에 저장된 파보나치 수열 출력:");
		int[] fibonacci = {1, 1, 2, 3, 5, 8, 13};
		for (int num : fibonacci) {
			System.out.println(num);
		}
	}
}
