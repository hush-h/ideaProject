package com.jcx.test5;

public class Block1 {
    static {
        System.out.println("我是main头上的");
    }
    public static void main(String[] args) {
        { int a = 1;
            System.out.println(a); }
        Student stu1 =new Student();
        Student stu2 = new Student(20);
    }
}
class Student{
    static {
        System.out.println("我是student头上的");
    }
    public Student(){
        System.out.println("我是无参");
    }
    public Student(int b){
        System.out.println("我是有参");
    }
    { System.out.println("我是代码块"); }

}