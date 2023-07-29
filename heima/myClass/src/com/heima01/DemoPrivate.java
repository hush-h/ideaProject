package com.heima01;

public class DemoPrivate {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(0);
        s1.setName("彭于晏");
        s1.call();
        s1.study();
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
    }
}
