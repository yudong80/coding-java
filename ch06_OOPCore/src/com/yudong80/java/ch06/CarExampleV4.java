package com.yudong80.java.ch06;

public class CarExampleV4 {
	public static void main(String[] args) {
		//1. MyCar 객체 생성  
		MyCar car = new MyCar("가1234");
		car.start();
		car.accelerate();
		car.accelerate(70);
		car.decelerateAs(60);
		car.decelerateHalf();
		
		//2. SpeedCar 객체 생성
		SpeedCar speedCar = new SpeedCar("우8322");
		speedCar.start();
		speedCar.accelerate();
		speedCar.accelerate(70);
		speedCar.decelerateAs(60);
		speedCar.decelerateHalf();
	}
}
