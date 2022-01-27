package com.yudong80.java.ch04;

public class NumberFilter {
    static String filterZeros(String input) {
        //3. 0의 마지막 위치 구하기 
        int lastIndex = input.lastIndexOf("0");

        //4. 0이 제거된 문자열 반환하기
        String res = input.substring(lastIndex + 1);
        return res;
    }

    public static void main(String[] args) {
        //1. 입력 데이터 
        String[] data = {
            "000999",
            "00000000333",
            "77",
        };

        //2. 필터 결과 출력하기 
        for (String input : data) {
            System.out.println(filterZeros(input));
        }
    }
}
