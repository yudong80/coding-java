package com.yudong80.java.ch02;

public class ArrayDoubleExampleV1 {
	public static void main(String[] args) {
		double[] sensorData; 		//배열 선언
		sensorData= new double[] {  //배열 정의 
				1.0, 
				2.2, 
				3.1,
		};
		
		int firstIndex = 0;
		int lastIndex = sensorData.length -1;
		
		System.out.println("첫번째 센서 데이터: " + sensorData[firstIndex]);
		System.out.println("마지막 센서 데이터: " + sensorData[lastIndex]);
		System.out.println("센서 데이터 갯수: " + sensorData.length);
	}
}
