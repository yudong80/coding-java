package com.yudong80.java.ch07;

public class TimeKeeper {
    private int iteration = 1;
    private long sTime;
    private long eTime;

    public TimeKeeper(int iteration) {
        this.iteration = iteration;
    }

    private int targetMethod() {
        int sum = 0;
        for (int i=1; i <= 6_000_000; ++i) {
            sum += i;
        }
        return sum;
    }

    private void startMeasure() {
        //4. 반복 시간 측정하기 
        sTime = System.currentTimeMillis();
        for (int i=0; i < iteration; ++i) {
            targetMethod();
        }
        eTime = System.currentTimeMillis();
    }

    private double getAverage() {
        //5. 측정 시간의 평균을 반환
        return (double)(eTime-sTime) / iteration;
    }

    public static void main(String[] args) {
        //1. TimeKeeper 객체 생성 (100번 반복)
        int iteration = 100;
        TimeKeeper keeper = new TimeKeeper(iteration);
        
        //2. 측정 시작 
        keeper.startMeasure();

        //3. 결과 측정 
        double average = keeper.getAverage();
        System.out.println(iteration + "번 반복 측정한 평균 시간은 " + average + "ms 입니다.");
    }
}
