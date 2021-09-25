package com.yudong80.java.ch09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReaderExampleV1 {
	private static final int EOF = -1;
	private static final String TARGET_TEXT_FILE = "sample-2mb-text-file.txt";
	
	public static void main(String[] args) throws IOException {
		//1. FileReader 생성 
		BufferedReader br = new BufferedReader(new FileReader(TARGET_TEXT_FILE));
		
		//2. 버퍼로 읽기 
		long sTime = System.currentTimeMillis();
		while (EOF != br.read()) {
			//do nothing 
		}
		
		long readTime = System.currentTimeMillis() - sTime;
		System.out.println(TARGET_TEXT_FILE + "을 읽는 시간 " + readTime + "ms");
				
		br.close(); //사용후 반드시 닫아 줍니다 	
	}
}
