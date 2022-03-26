package com.yudong80.java.ch09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class PoemReaderV1 {
	private static final String POEM_FILE = "poem.txt";

	public static void main(String[] args) throws IOException {
		//1. FileReader 생성 
		BufferedReader br = new BufferedReader(
			new FileReader(POEM_FILE, StandardCharsets.UTF_8));
		
		//2. 제목과 작가 출력 
		String title = br.readLine();
		String author = br.readLine();
		System.out.println("제목: " + title);
		System.out.println("작가: " + author);
		
		//3. 내용 출력 
		String line;		
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
						
		br.close(); //사용후 반드시 닫아 줍니다 			
	}
}
