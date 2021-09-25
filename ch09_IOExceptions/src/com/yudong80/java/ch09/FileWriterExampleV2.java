package com.yudong80.java.ch09;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExampleV2 {
	private static final String TARGET_TEXT_FILE = "diary.txt";
	
	public static void main(String[] args) throws IOException {
		//1. FileWriter 생성 
		FileWriter fw = new FileWriter(TARGET_TEXT_FILE);
		
		//2. write() 메서드 
		String title = "오늘의 할일\n";
		char[] walk = {'1', '.', ' ', '산', '책', '하', '기', '\n' };
		char[] reading = {'2', '.', ' ', '독', '서', '하', '기', '\n' };
		
		fw.write(title);
		fw.write(walk);
		fw.write(reading, 0, 5);	
		
		//3. flush() 메서드
		fw.flush(); //대부분의 경우는 불필요함 
		
		//4. close() 메서드
		fw.close(); //사용후 반드시 닫아 줍니다 
		
		//5. 파일 내용 확인 
		new TextFileReaderV1(TARGET_TEXT_FILE).printFileContents();
	}
}
