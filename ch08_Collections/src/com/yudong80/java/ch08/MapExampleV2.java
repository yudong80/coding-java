package com.yudong80.java.ch08;

import java.util.HashMap;
import java.util.Map;

public class MapExampleV2 {
	public static void main(String[] args) {
		//0. 자료 준비 
		Map<String, String> capitalMap = MapBasic.prepareCapitalMap();
				
		//1. putAll() 메서드 
		Map<String, String> others = new HashMap<>();
		others.put("프랑스", "파리");
		others.put("스페인", "마드리드");
		others.put("대한민국", "서울(Seoul)"); //키가 겹치면 새로 입력됨 
		capitalMap.putAll(others);
		
		System.out.println("putAll() 후 맵: " + capitalMap);

		//2. putIfAbsent() 메서드
		capitalMap.putIfAbsent("이탈리아", "로마");

		System.out.println("putIfAbsent() 후 맵: " + capitalMap);
	}
}