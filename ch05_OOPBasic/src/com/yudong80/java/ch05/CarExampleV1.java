package com.yudong80.java.ch05;

class Car {
	private static final int DEFAULT_ACCEL = 10;
	private static final String SPEED_UNIT = "km/h";
	
	private String carNumber;
	private int speed = 0;
	
	public Car(String carNumber) {
		this.carNumber = carNumber;
	}
	
	public void start() {
		System.out.println("차량 " + carNumber + "에 시동을 겁니다");
		accelerate();
	}

	public void accelerate() {
		accelerate(DEFAULT_ACCEL);
	}
	
	public void accelerate(int km) {
		speed += km;
		printSpeed(speed);		
	}
		
	public void decelerateHalf() {
		speed *= 0.5;
		printSpeed(speed);
		
	}
	
	public void decelerateAs(int km) {
		speed -= km;
		printSpeed(speed);
	}
	
	private static void printSpeed(final int speed) {
		System.out.println("시속: " + speed + SPEED_UNIT);
	}
}

public class CarExampleV1 {
	public static void main(String[] args) {
		Car car = new Car("가1234");
		car.start();
		car.accelerate();
		car.accelerate(70);
		car.decelerateAs(60);
		car.decelerateHalf();
	}
}
