package com.yudong80.java.ch10;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkPublicApiV2 {
	private static final String SERVICE_KEY = "%2FowjGSXksY%2BO%2FPGosCcayjdln%2Fyc5EuQIC%2Fi0DTynIbscPG235RMZMi1UpfpXr1qyCOpdqaEa82jfGpTap%2BG3A%3D%3D";
	private static final String SERVICE_URL = "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst"; 
	private OkHttpClient client = new OkHttpClient();
	
	private URL buildUrl(String baseDate, int nx, int ny) {
        StringBuilder sb = new StringBuilder(SERVICE_URL)
        .append("?ServiceKey=" + SERVICE_KEY) 
        .append("&pageNo=1")
        .append("&numOfRows=10") 
        .append("&dataType=JSON") 
        .append("&base_date=" + baseDate) 
        .append("&base_time=0600") 
        .append("&nx=" + Integer.toString(nx))
        .append("&ny=" + Integer.toString(ny));
        
        URL url = null;
        try {
        	url = new URL(sb.toString());
        	System.out.println("URL: " + sb.toString());
        } catch (MalformedURLException e) {
        	System.out.println("MalformedURLException: " + e.getMessage());
        }
        return url;
	}

	public String httpGet(String baseDate, int nx, int ny) {
		URL url = buildUrl(baseDate, nx, ny);
	
		if (url == null) {
			return ""; //return nothing 
		}
		
		Request request = new Request.Builder().url(url).build();
		try (Response response = client.newCall(request).execute()) {
			String res = response.body().string();
			return res;
		} catch (IOException e) {
			return "error: " + e.getMessage();
		}
	}
	
	public List<WeatherItem> parseJson(String json) {
		JsonElement element = JsonParser.parseString(json);
		JsonArray itemArr = element.getAsJsonObject()
		.get("response").getAsJsonObject()
		.get("body").getAsJsonObject()
		.get("items").getAsJsonObject()
		.get("item").getAsJsonArray();
		
		Gson gson = new Gson();
		List<WeatherItem> result = new ArrayList<>();
		for (int i=0; i< itemArr.size(); ++i) {
			WeatherItem item = gson.fromJson(itemArr.get(i), WeatherItem.class);
			result.add(item);
		}
		
		return result;
	}
	
	public void printResult(List<WeatherItem> items) {
		for (WeatherItem item: items) {
			System.out.println(item.category + ": " + item.obsrValue);
		}
	}
	
	public static void main(String[] args) {
    	final String baseDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
    	final int nx = 59; //마포구 연남동
    	final int ny = 127;
    	
    	OkPublicApiV2 api = new OkPublicApiV2();
    	String response = api.httpGet(baseDate, nx, ny);
    	List<WeatherItem> items = api.parseJson(response);
    	api.printResult(items);
	}
}
