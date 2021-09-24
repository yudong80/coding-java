package com.yudong80.java.ch06;

public class CarExampleV5 {
	public static void main(String[] args) {
		//1. MyCar, SpeedCar 객체 생성  
		Car[] cars = {
			new MyCar("가1234"),
			new SpeedCar("우8322"),
		};
		
		//2. Car 객체 호출
		for (Car car : cars) {
			car.start();
			car.accelerate();
			car.accelerate(70);
			car.decelerateAs(60);
			car.decelerateHalf();
		}		
	}
}
