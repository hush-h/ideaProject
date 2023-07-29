package com.heima02;

public class Student {
    private String name;
    private int age;
    public Student(int  age,String name){
        if(age>0&&age<120){
            this.age = age;
        }
        else {
            System.out.println("您输入的信息有误");
            this.name = name;
        }
    }
    public void show(){
        System.out.println(name+","+age);
    }
}
