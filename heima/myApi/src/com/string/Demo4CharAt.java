package com.string;

import java.util.Scanner;

public class Demo4CharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.length());   //length是从一开始
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            System.out.println(c);
        }
    }
}
