package com.yudong80.java.ch02;

public class ArrayException {
	public static void main(String [] args) { 
        //1. 배열 정의 
		int[] grades = {80, 95, 92, 70};
        int[][] gradesMulti = {{80, 95, 92, 70}, {70, 99, 75, 100}};

        //2. 정상적인 사용
        System.out.println("grades의 첫번째 성적: " + grades[0]);
        System.out.println("gradesMulti[1][1] 성적: " + gradesMulti[1][1]);
        System.out.println("grades의 길이 " + grades.length);

        //3. 오류 발생
        int error = grades[grades.length];
	}
}
