package com.scanner;

import java.util.Scanner;

public class DemoScanner02 {
    public static void main(String[] args) {
        System.out.println("输入：");
        Scanner sc = new Scanner(System.in);
        String m =  sc.next();     //结束标记 空格 tab；
        System.out.println(m);
    }
}
