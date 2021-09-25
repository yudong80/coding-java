package com.yudong80.java.ch10;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkPublicApi {
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
	
	public static void main(String[] args) {
    	final String baseDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
    	final int nx = 59; //마포구 연남동
    	final int ny = 127;
    	
    	OkPublicApi api = new OkPublicApi();
    	String response = api.httpGet(baseDate, nx, ny);
    	System.out.println(response);    	
	}
}
