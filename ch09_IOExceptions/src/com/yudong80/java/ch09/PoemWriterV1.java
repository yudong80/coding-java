package com.yudong80.java.ch09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class PoemWriterV1 {
	private static final String DEFAULT_INPUT_FILE = "poem.txt";
	private static final String DEFAULT_OUTPUT_FILE = "poem_copy.txt";

	private String outputFile;
	
	public PoemWriterV1(String outFile) { 
		this.outputFile= outFile;
	}
	
	public String readInputPoem(String inputFile) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(inputFile, StandardCharsets.UTF_8));
		StringBuilder sb = new StringBuilder();
		String line;
		
		while((line = br.readLine()) != null) {
			sb.append(line).append('\n');
		}
		
		//사용 후에는 반드시 닫아줍니다.
		br.close(); 
		
		return sb.toString();
	}
	
	public void writeOutput(String content) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, StandardCharsets.UTF_8));
		
		bw.write(content);
		bw.flush(); //버퍼의 내용을 비웁니다.  
		bw.close(); //사용 후에는 반드시 닫아줍니다.
	}
		
	public static void main(String[] args) throws IOException {
		//1. PoemWriter 객체 생성 
		PoemWriterV1 poemWriter = new PoemWriterV1(DEFAULT_OUTPUT_FILE);
		
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
