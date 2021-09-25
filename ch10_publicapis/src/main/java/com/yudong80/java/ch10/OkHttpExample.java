package com.yudong80.java.ch10;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttpExample {
	private static final String URL = "https://jsonplaceholder.typicode.com/todos/1";
	
	public void run(final String url) {
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url(url).build();
		
		System.out.println("URL: " + url);
		try (Response response = client.newCall(request).execute()) {
			String res = response.body().string();
			
			System.out.println("결과: " + res);
			
		} catch (IOException e) {
			System.out.println("error: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		new OkHttpExample().run(URL);
	}
}