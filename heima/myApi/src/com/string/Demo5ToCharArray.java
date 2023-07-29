package com.string;

import java.util.Scanner;

public class Demo5ToCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(arr[i]);
        }
    }
}
