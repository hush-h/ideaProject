package com.heima.method;

import java.util.Scanner;

public class Demo1Method {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个数字");
         int a = scanner.nextInt();
        boolean isOddNumber = isOddNumber(a);
        System.out.println(isOddNumber);
    }
    public static boolean isOddNumber(int number){
        if (number%2==0){
            System.out.println();
            return true;
        }
        else
            return false;
    }
}
