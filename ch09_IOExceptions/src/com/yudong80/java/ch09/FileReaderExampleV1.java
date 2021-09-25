package com.yudong80.java.ch09;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExampleV1 {
	private static final int EOF = -1;
	
	public static void main(String[] args) throws IOException {
		//1. FileReader 생성 
		FileReader fr = new FileReader("hello.txt");
		
		//2. 한글자씩 읽기 
		int readInt; 
		while (EOF != (readInt = fr.read())) {
			char ch = (char) readInt;
			System.out.println("입력 데이터: " + ch);	
		}
		
		fr.close(); //사용후 반드시 닫아 줍니다 	
	}
}
