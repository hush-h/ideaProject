package com.jcx.test1;

public interface Inter {
    static int b = 10;
    public abstract void study();
    public static void test(){
        System.out.println("1111");

    }
    public default void test2(){
        System.out.println("33333");

    }

}
