package com.yudong80.java.ch02;

public class Array2D {
	public static void main(String [] args) { 
        //1. 2차원 배열 정의
		int[][] grades = {
            {80, 95, 92, 70},   //Jane
            {70, 99, 75, 100}, 	//Mike
        };
		
		//2. 2차원 배열 요소 접근 (예, grades[0][i])
		double sumJane = 0;
		for (int i=0; i < grades[0].length; ++i) {
			int grade = grades[0][i];
			sumJane += grade;
		}
		double averageJane = sumJane / grades[0].length;

		//3. for each를 활용한 2차원 배열 사용
		double sumMike = 0;
		for (int grade : grades[1]) {
			sumMike += grade;
		}
		double averageMike = sumMike / grades[1].length;
		System.out.println("전체 학생수는 " + grades.length);
		System.out.println("Jane의 평균 점수는 " + averageJane);
		System.out.println("Mike의 평균 점수는 " + averageMike);
	}
}
