package com.yudong80.java.ch05;

class Tesla {
    private String name;
    private int speed;
    private int distance;

    public Tesla(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void run(int hours) { 
        distance = speed * hours;
    }

    public String getName() {
        return name;
    }

    public int getDistance() { 
        return distance;
    }
}

public class ElectricCar {
    public static void main(String[] args) {
        //1. Tesla 객체 생성 (속도는 100km/h 기준)
        Tesla t = new Tesla("모델Y", 100);

        //2. 자동차 운행 (50시간)
        t.run(50);

        //3. 주행거리 출력 
        String carName = t.getName();
        int distance = t.getDistance();
        System.out.println("테슬라 " + carName + "는 " + distance + "km를 운행중입니다.");
    }
}
