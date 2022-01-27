package com.yudong80.java.ch02;

public class PrintAverage {
    public static void main(String[] args) {
        double[] grades = {80,95,92,70};
        double average = (grades[0] + grades[1] + grades[2] + grades[3]) / grades.length;
        System.out.println("4과목 평균 점수: " + average);
    }
}
