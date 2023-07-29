package com.string;

import java.util.Scanner;

public class Demo6SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tel = sc.nextLine();
        String start = tel.substring(0,3);
        String end = tel.substring(7);
        System.out.println(start+"****"+end);
    }
}
