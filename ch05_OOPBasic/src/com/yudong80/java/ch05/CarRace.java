package com.yudong80.java.ch05;

public class CarRace {
    private static final int CAR_MAX = 3;
    
    //1. 객체 배열 선언 
    private Car[] cars;

    public CarRace() { 
        registerCars();
    }

    private void registerCars() { 
        //2. 객체 배열 정의 
        cars = new Car[CAR_MAX];
        for (int i=0; i < cars.length; ++i) { 
            String carName = "SKY-" + i;
            cars[i] = new Car(carName);
        }
    }

    public void start() { 
        //3. 경주 시작 
        for (Car car : cars) { 
            car.start();
        }
    }

    public void race() { 
        //4. 경주
        cars[0].accelerate(70);
        cars[1].accelerate(50);
        cars[2].accelerate();
        cars[0].decelerateAs(20);
        cars[1].decelerateHalf();       
    }

    public void showResult() {
        //5. 경주 결과
        for (Car car: cars) {
            String msg = "차량[" + car.getNumber() + "] " + 
                "이동거리는 " + car.getDistance() + 
                Car.DISTANCE_UNIT + "입니다.";
            System.out.println(msg);
        }
    }

    public static void main(String[] args) { 
        CarRace race = new CarRace();
        race.start();
        race.race();
        race.showResult();
    }
}
