package com.yudong80.java.ch08;

import java.util.Map;
import java.util.Set;

public class MapExampleV1 {
	private static final String KEY_FR = "프랑스";
	private static final String KEY_EN = "영국";
	
	public static void main(String[] args) {
		//0. 자료 준비 
		Map<String, String> capitalMap = MapBasic.prepareCapitalMap();
		
		//1. remove() 메서드 
		System.out.println("원본 맵: " + capitalMap);
		capitalMap.remove(KEY_FR); //존재하지 않는 키를 제거해도 오류가 발생하지 않습니다
		capitalMap.remove(KEY_EN);
		System.out.println("영국 제거후: " + capitalMap);
		
		//2. keySet() 메서드 
		Set<String> keySet = capitalMap.keySet();
		for (String key : keySet) {
			System.out.println("키: " + key);
		}
		
		//3. containsKey() 메서드 
		boolean hasFranceKey = capitalMap.containsKey(KEY_FR);
		boolean hasEnglandKey = capitalMap.containsKey(KEY_EN);
		System.out.println(KEY_FR + " 키 존재? " + hasFranceKey);
		System.out.println(KEY_EN + " 키 존재? " + hasEnglandKey);
		
		//4. clear(), isEmpty() 메서드 
		capitalMap.clear();
		System.out.println("clear() 후 맵 = " + capitalMap);
		System.out.println("isEmpty()? " + capitalMap.isEmpty());
	}
}
