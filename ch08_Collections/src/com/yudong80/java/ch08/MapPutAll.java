package com.yudong80.java.ch08;

import java.util.HashMap;
import java.util.Map;

public class MapPutAll<K,V> extends HashMap<K, V> {
    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        for (K key : m.keySet()) { 
            V value = m.get(key);
            this.put(key, value);
        }
    }

    public static void main(String[] args) {
        //1. 넣을 데이터
        Map<String, String> data = new HashMap<>();
        data.put("대한민국", "서울");
        
        //2. MapPutAll 클래스 생성
        Map<String, String> myMap = new MapPutAll<>();
        myMap.putAll(data);

        //3. 결과 확인 
        System.out.println(myMap);
    }
}
