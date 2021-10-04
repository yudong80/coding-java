package com.yudong80.java.ch05;

class Car {
	private static final int DEFAULT_ACCEL = 10;
	static final String SPEED_UNIT = "km/h";
	static final String DISTANCE_UNIT = "km";
	
	private String carNumber;
	private int speed = 0;

	//주행거리. speed만큼 이동한다고 가정합니다.
	private int distance = 0;
	
	public Car(String carNumber) {
		this.carNumber = carNumber;
	}
	
	public void start() {
		System.out.println("차량[" + carNumber + "] 에 시동을 겁니다");
		accelerate();
	}

	public void accelerate() {
		accelerate(DEFAULT_ACCEL);
	}
	
	public void accelerate(int km) {
		speed += km;
		distance += speed;
		printDistance();		
	}
		
	public void decelerateHalf() {
		speed *= 0.5;
		distance += speed;
		printDistance();
		
	}
	
	public void decelerateAs(int km) {
		speed -= km;
		distance += speed;
		printDistance();
	}

	public String getNumber() { 
		return carNumber;
	}

	public int getDistance() { 
		return distance;
	}
	
	private void printDistance() {
		String msg = "차량[" + carNumber + "] " +
			"시속: " + speed + SPEED_UNIT + 
			" >> 이동거리: " + distance + DISTANCE_UNIT;
		System.out.println(msg);
	}
}

public class CarExampleV1 {
	public static void main(String[] args) {
		Car car = new Car("GREEN");
		car.start();
		car.accelerate();
		car.accelerate(70);
		car.decelerateAs(60);
		car.decelerateHalf();
	}
}
