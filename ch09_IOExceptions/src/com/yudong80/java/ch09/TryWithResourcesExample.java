package com.yudong80.java.ch09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TryWithResourcesExample {
	private static final String TARGET_TEXT_FILE = "sample-text-file.txt";

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(
			new FileReader(TARGET_TEXT_FILE, StandardCharsets.UTF_8))) {
			String line; 
			while ((line = br.readLine()) != null) {
				System.out.println("라인: " + line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException 발생: " + e.getMessage());
		} catch (IOException ioe) {
			System.out.println("IOException 발생: " + ioe.getMessage());
		}
	}
}