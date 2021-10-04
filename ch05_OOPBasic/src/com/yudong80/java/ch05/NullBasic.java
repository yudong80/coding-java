package com.yudong80.java.ch05;

public class NullBasic {
    public static void main(String[] args) {
        //1. null의 의미 
        String star; //객체는 초기값이 null 상태
        Car car1 = null; //명시적으로 null 선언 가능 
        Car[] cars; //배열 선언도 null임 
        
        //2. null 상태는 최소화 해야 함 
        star = "My name is star";
        car1 = new Car("PUPPLE");
        cars = new Car[1];
        cars[0] = new Car("MAGENTA");

        //3. null이 아니기에 모두 사용 가능함
        System.out.println(star);
        System.out.println(car1);
        System.out.println(cars);
        System.out.println(cars[0]);
    }
}
