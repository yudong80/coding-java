package com.yudong80.java.ch09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReaderV1 {
	private String fileName;
	
	public TextFileReaderV1(String fileName) {
		this.fileName = fileName;
	}
	
	public void printFileContents() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
	
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();
	}
}