package com.yudong80.java.ch08;

import java.util.ArrayList;
import java.util.List;

public class ListBasic {
	public static void main(String[] args) {
		//1. List 생성 (ArrayList 클래스) 
		List<Integer> intList = new ArrayList<>();
		List<Double> doubleList = new ArrayList<>();
		List<String> stringList = new ArrayList<>();
		
		//2. 데이터 입력 
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		//intList.add("문자열"); --> 컴파일 오류 발생 
		
		doubleList.add(3.14);
		doubleList.add(100.57);
		doubleList.add(-3000.1);
		
		stringList.add("수성");
		stringList.add("목성");
		stringList.add("지구");
		
		//3. 개별 데이터 조회  
		System.out.println("intList[0] = " + intList.get(0));
		System.out.println("intList[1] = " + intList.get(1));
		System.out.println("intList[2] = " + intList.get(2));
		
		//4. 반복문을 통한 데이터 조회 
		for (int i=0; i< doubleList.size(); ++i) {
			System.out.println("doubleList[" + i + "] = " + doubleList.get(i));
		}
		
		for (String planet : stringList) {
			System.out.println("행성: " + planet);
		}
		
		//5. List의 내용 출력 
		System.out.println("intList = " + intList);
		System.out.println("doubleList = " + doubleList);
		System.out.println("stringList = " + stringList);
	}
}
