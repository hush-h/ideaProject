package com.string;

public class Demo1String {
    public static void main(String[] args) {
        String  s1 = new String();
        System.out.println(s1);

        char chs[]  = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println(s2);

        String s3 = new String("124");
        System.out.println(s3);

    }
}

