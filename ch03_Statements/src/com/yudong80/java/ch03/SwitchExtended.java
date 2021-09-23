package com.yudong80.java.ch03;

public class SwitchExtended {
	public static void main(String[] args) {
		String[] planets = {
			"수성", "금성", "지구", "화성", "목성", "토성",
		};
		
		for (String planet : planets) {
			switch (planet) {
			case "수성": //fall-through
			case "금성": //fall-through
			case "화성": //fall-through
			case "목성": //fall-through
			case "토성":
				System.out.println(planet + "으로 우주 여행을 가자!");
				break;
			case "지구": 
				System.out.println(planet + "로 우주 여행을 가자!");
			}	
		}
	}
}
