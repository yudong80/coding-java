package com.yudong80.java.ch08;


import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsExample {
	public static void main(String[] args) {
		//0. 데이터 준비 
		List<String> aList = ListExampleV1.preparePlanetList();
		Map<String, String> aMap = MapBasic.prepareCapitalMap();
		Set<String> aSet = SetBasic.prepareAlphabets();
		
		//1. unmodifiableList/Map/Set() 메서드 
		aList = Collections.unmodifiableList(aList);
		aMap = Collections.unmodifiableMap(aMap);
		aSet = Collections.unmodifiableSet(aSet);
		
		//aList.add("무언가"); //런타임 오류 발생 
		//aMap.put("키", "무언가"); //런타임 오류 발생
		//aSet.add("무언가"); //런타임 오류 발생
		
		//2. swap() 메서드 
		List<String> modifiableList = prepareSolarSystem();
		System.out.println("swap 전: " + modifiableList);
		
		Collections.swap(modifiableList, 0, 1);
		System.out.println("swap 전: " + modifiableList);
		
		//3. shuffle() 메서드 
		System.out.println("shuffle 전: " + modifiableList);
		
		Collections.shuffle(modifiableList);
		System.out.println("shuffle 후: " + modifiableList);	
	}
	
	static List<String> prepareSolarSystem() {
		List<String> base = ListExampleV1.preparePlanetList();
		base.add("목성");
		base.add("토성");
		base.add("천왕성");
		return base;
	}
}
