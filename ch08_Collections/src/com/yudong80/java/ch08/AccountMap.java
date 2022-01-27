package com.yudong80.java.ch08;

import java.util.HashMap;
import java.util.Map;

class AccountInfo {
    String id;
    String password;

    public AccountInfo(String id, String ps) { 
        this.id = id;
        this.password = ps;
    }

    public String getId() { 
        return id; 
    }

    public String getPassword() { 
        return password;
    }

    public String setPassword(String newPassword) { 
        String oldOne = password;
        this.password = newPassword;
        return oldOne;
    }
}

public class AccountMap {
    //1. 사이트 리스트 
    private static String NAVER = "www.naver.com";
    private static String GOOGLE = "www.google.com";
    private static String AMAZON = "www.amazon.com";

    public static void main(String[] args) {
        //1. ID/비번 리스트 입력
        Map<String, AccountInfo> map = new HashMap<>();
        map.put(NAVER, new AccountInfo("java" , "1234"));
        map.put(GOOGLE, new AccountInfo("java" , "7788"));
        map.put(AMAZON, new AccountInfo("java2" , "0088"));

        //2. 구글의 계정 정보 출력 
        AccountInfo googleAccount = map.get(GOOGLE);
        System.out.println("구글 계정의 ID: " + googleAccount.getId());
        System.out.println("구글 계정의 Password: " + googleAccount.getPassword());

        //3. 아마존 계정의 비밀번호 변경 
        AccountInfo amazonAccount = map.get(AMAZON);
        amazonAccount.setPassword("113333");

        //4. ID와 변경된 비밀번호 출력
        System.out.println("아마존 계정의 ID: " + amazonAccount.getId());
        System.out.println("아마존 계정의 Password: " + amazonAccount.getPassword());
    }
}
