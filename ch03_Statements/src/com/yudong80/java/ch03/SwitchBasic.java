package com.yudong80.java.ch03;

public class SwitchBasic {
	public static void main(String[] args) {
		String[] planets = {
			"수성", "금성", "지구", "화성", "목성", "토성",
		};
		
		for (String planet : planets) {
			switch (planet) {
			case "지구": 
				System.out.println(planet + "로 우주 여행을 가자!");
				break;
			default: 
				System.out.println(planet + "으로 우주 여행을 가자!");
			}	
		}
	}
}
