package com.yudong80.java.ch05;

//null 대응하기 
public class NullPractice {

    static void printName(String name) { 
        //1.null이 오면 로직을 skip 합니다. 
        if(name == null) return;

        System.out.println("printName: " + name);
    }

    static void printAlternativeName(String name) {
        //2. null이 오면 다른 이름으로 교체합니다. 
        if(name == null) {
            name = "기본 이름";
        }

        System.out.println("printAlternativeName: " + name);
    }

    static void printNameAs(String name, String defaultName) {
        //3. null이 오면 defaultName 인수로 대체합니다. 
        if(name == null) {
            name = defaultName;
        }

        System.out.println("printNameAs: " + name);
    }

    public static void main(String[] args) {
        printName("Jennie");
        printName(null);
        printAlternativeName("Jennie");
        printAlternativeName(null);

        final String defaultName = "default name";
        printNameAs("James", defaultName);
        printNameAs(null, defaultName);
    }
}
