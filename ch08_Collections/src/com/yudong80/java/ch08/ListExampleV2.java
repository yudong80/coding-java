package com.yudong80.java.ch08;

import java.util.List;

public class ListExampleV2 {
	private static final String EARTH = "지구";
	private static final String SATURN = "토성";

	public static void main(String[] args) {
		//0. 데이터 준비 
		List<String> planets = ListExampleV1.preparePlanetList();	
		
		//1. contains() 메서드 
		boolean hasEarth = planets.contains(EARTH);
		boolean hasSaturn = planets.contains(SATURN);
		System.out.println("지구가 존재하는가? " + hasEarth);
		System.out.println("토성이 존재하는가? " + hasSaturn);
		
		//2. indexOf() 메서드 
		int earthIndex = planets.indexOf(EARTH);
		int saturnIndex = planets.indexOf(SATURN);
		System.out.println("지구의 index? " + earthIndex);
		System.out.println("토성의 index? " + saturnIndex);
		
		//3. lastIndexOf() 메서드 
		planets.add("지구");
		
		int lastEarthIndex = planets.lastIndexOf(EARTH);
		System.out.println("지구의 마지막 index? " + lastEarthIndex);
		
		//4. remove() 메서드 
		planets.remove(lastEarthIndex);
		
		//5. set() 메서드 
		planets.set(earthIndex, "지구(Earth)");
		System.out.println("행성들: " + planets);
		
		//6. toArray() 메서드 
		String[] planetArr = planets.toArray(new String[0]);
		for (String planet : planetArr) {
			System.out.println("행성: " + planet);
		}
	}
}
