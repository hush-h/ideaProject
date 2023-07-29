package com.heima01;

public class Student {
    private String name;
    private int age;

    public void setName(String name){
          this.name = name;

    }

    public String getName(){
        return name;

    }

    public void setAge(int age){
        if(age>0&&age<120){
            this.age = age;
        }
        else{
            System.out.println("您输入的信息有误");
        }
    }

    public int getAge(){
        return age;

    }
    public void call(){
        System.out.println("给"+name+"打电话");
    }
    public void study(){
        System.out.println("好好学习");
    }
}
