package com.yudong80.java.ch08;

import java.util.HashMap;
import java.util.Map;

public class MapBasic {
	static Map<String, String> prepareCapitalMap() {
		Map<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("미국", "워싱턴DC");
		map.put("스웨덴", "스톡홀름");
		map.put("영국", "런던");
		return map;
	}

	public static void main(String[] args) {
		//0. 자료 준비 
		Map<String, String> capitalMap = prepareCapitalMap();
		
		//1. put() 메서드 
		capitalMap.put("호주", "캔버라");
		System.out.println("수도 맵 = " + capitalMap + "\n");
		
		//2. get() 메서드
		String capitalKR = capitalMap.get("대한민국");
		String capitalUS = capitalMap.get("미국");
		String capitalCN = capitalMap.get("캐나다");
		System.out.println("대한민국의 수도? " + capitalKR);
		System.out.println("미국의 수도? " + capitalUS);
		System.out.println("캐나다의 수도? " + capitalCN);
		
		//3. getOrDefault() 메서드 
		capitalCN = capitalMap.getOrDefault("캐나다", "N/A");
		System.out.println("캐나다의 수도? " + capitalCN);
		
		//4. 맵 내용 조회 
		System.out.println("\ncapitalMap 조회: ");
		for (String country : capitalMap.keySet()) {
			String capital = capitalMap.get(country);
			System.out.println(country + "의 수도는? " + capital);
		}
	}
}

