package com.scanner;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        System.out.println("输入：");
        Scanner sc = new Scanner(System.in);
        String m =  sc.nextLine();   //结束标记 enter
        System.out.println(m);
    }
}

