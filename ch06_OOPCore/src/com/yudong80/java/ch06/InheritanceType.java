package com.yudong80.java.ch06;

public class InheritanceType {
    public static void main(String[] args) {
        //1. 부모클래스의 인스턴스화 
        SuperClass s1 = new SuperClass();
        System.out.println("s1.number: " + s1.publicNumber);
        s1.print("메시지 #1");
        System.out.println("s1.getKey(): " + s1.getKey());

        //2. 부모로 선언, 자식 객체 할당 
        SuperClass s2 = new SubClass();
        System.out.println("s2.number: " + s2.publicNumber);
        s2.print("메시지 #2");
        System.out.println("s2.getKey(): " + s2.getKey());
        //System.out.println("s2.getSubKey(): " + s2.getSubKey());

        //3. 자식클래스의 인스턴스화 
        SubClass s3 = new SubClass();
        System.out.println("s3.number: " + s3.publicNumber);
        s3.print("메시지 #3");
        System.out.println("s3.getKey(): " + s3.getKey());
        //System.out.println("s3.getSubKey(): " + s3.getSubKey());

        //4. 자식으로 선언, 부모 객체 할당 (불가)
        //SubClass s4 = new SuperClass();
    }    
}
