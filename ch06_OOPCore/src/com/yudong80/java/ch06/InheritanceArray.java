package com.yudong80.java.ch06;

class SisterClass extends SuperClass {
	public String getKey() {
		System.out.println("SISTER:getKey() 호출");
		return "SISTER-" + super.protectedKey;
	}
}

public class InheritanceArray {
    public static void main(String[] args) {
        //1. SuperClass 배열 선언 
        SuperClass[] arr = new SuperClass[3];

        //2. 배열 요소 정의 
        arr[0] = new SuperClass(); 
        arr[1] = new SubClass();
        arr[2] = new SisterClass();

        //3. 일괄 getKey() 호출 
        for (SuperClass obj : arr) { 
            System.out.println(obj.getKey());
        }
    }
}
