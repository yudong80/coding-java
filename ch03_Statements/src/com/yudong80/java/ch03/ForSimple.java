package com.yudong80.java.ch03;

public class ForSimple {
	public static void main(String[] args) {
		//상상의 for문: 반복 회수만 넣을 수 있으면 좋겠다 
		String[] cities = {"Seoul", "London", "Stockholm"};
		
		int idx = 0;
		// for (3) {   //이런 for문은 없습니다..
			System.out.println(cities[idx++]);
		// }
	}
}