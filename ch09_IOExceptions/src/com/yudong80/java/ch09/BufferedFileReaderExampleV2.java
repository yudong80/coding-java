package com.yudong80.java.ch09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReaderExampleV2 {
	private static final String TARGET_TEXT_FILE = "sample-text-file.txt";
	
	public static void main(String[] args) {
		//1. FileReader 생성 
		BufferedReader br = null; 
		
		try { 
			br = new BufferedReader(new FileReader(TARGET_TEXT_FILE));
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException 발생: " + e.getMessage());
			return;
		}
		
		//2. 버퍼로 읽기
		String line;
		try {
			while((line = br.readLine()) != null) {
				System.out.println("라인: " + line);
			}
		} catch (IOException ioe) {
			System.out.println("IOException 발생: " + ioe.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} 	
		} 		
	}
}
