package com.yudong80.java.ch09.exceptions;

import java.util.HashMap;
import java.util.Map;

public class MakeNullPointerExceptionV2 {
	static Map<String, String> createRegionCodeMap() {
		Map<String, String> map = new HashMap<>();
		map.put("서울", "02");
		map.put("경기도", "031");
		map.put("강원도", "033");
		return map;
	}
	
	public static void main(String[] args) {
		//1. 지역 번호 검색하기
		Map<String, String> regionCodes = createRegionCodeMap();
		String nullObj = regionCodes.get("경기"); 
		
		//2. NullPointerException 발생
		if(nullObj.equals("031")) {
			System.out.println("여기는 실행되지 않습니다!!");
		}
	}
}
