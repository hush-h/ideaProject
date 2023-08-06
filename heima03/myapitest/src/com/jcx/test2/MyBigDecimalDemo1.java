package com.jcx.test2;

import java.util.ArrayList;

public class MyBigDecimalDemo1 {
    public static void main(String[] args) {
        String s = "11 22 33 44 55 66 77";
        String[] split = s.split(" ");
        int[] ints = new int[split.length];
        for (int i = 0; i < ints.length; i++) {
            int a = Integer.parseInt(split[i]);
            ints[i]=a;
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
