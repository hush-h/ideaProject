package com.string;

import com.domain.Student;

import java.util.Scanner;

public class Demo8Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入：");
        String s = sc.nextLine();
        String[] arr = s.split(",");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        Student s1 = new Student(arr[0],arr[1]);
        System.out.println("名字是："+s1.getName()+"，年龄是："+s1.getAge());
    }
}

