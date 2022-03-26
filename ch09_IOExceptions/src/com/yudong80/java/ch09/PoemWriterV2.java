package com.yudong80.java.ch09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class PoemWriterV2 {
	private static final String DEFAULT_INPUT_FILE = "poem.txt";
	private static final String DEFAULT_OUTPUT_FILE = "poem_copy.txt";
	private static final String EMPTY_STRING = "";
	
	private String outputFile;
	
	public PoemWriterV2(String outFile) { 
		this.outputFile= outFile;
	}
	
	public String readInputPoem(String inputFile) {
		BufferedReader br; 
		
		try {
			br = new BufferedReader(new FileReader(inputFile, StandardCharsets.UTF_8));
		} catch (IOException e) {
			System.out.println("IOException 발생: " + e.getMessage());
			return EMPTY_STRING;
		}
		
		
		StringBuilder sb = new StringBuilder();
		String line;
		
		try {
			while((line = br.readLine()) != null) {
				sb.append(line).append('\n');
			}
		} catch (IOException ioe) {
			System.out.println("IOException 발생: " + ioe.getMessage());
			
			//IOException 발생시에는 빈 문자열을 반환하기로 함 
			return EMPTY_STRING; 
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}	 		
				
		return sb.toString();
	}
	
	public void writeOutput(String content) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(outputFile, StandardCharsets.UTF_8));
			bw.write(content);
			bw.flush();    
		} catch (IOException ioe) {
			System.out.println("IOException 발생: " + ioe.getMessage());
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}
		
	public static void main(String[] args) {
		//1. PoemWriter 객체 생성 
		PoemWriterV2 poemWriter = new PoemWriterV2(DEFAULT_OUTPUT_FILE);
		
		//2. poem.txt 파일 읽기 
		String original = poemWriter.readInputPoem(DEFAULT_INPUT_FILE);
		System.out.println("== 원본 내용 ==");
		System.out.println(original);
		
		//3. poem_copy.txt 파일 쓰기
		poemWriter.writeOutput(original);
		
		//4. 내용 확인 
		String copied = poemWriter.readInputPoem(DEFAULT_OUTPUT_FILE);
		System.out.println("== 사본 내용 ==");
		System.out.println(copied);
	}
}
