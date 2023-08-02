package com.jcx.test3;

public class test3 {
    public static void main(String[] args) {

        new Inter(){
            @Override
            public void show() {
                System.out.println("内部匿名类");
            }
        }.show();
        Inter1 in = new Inter1() {    //多态，父类转为子类对象
            @Override
            public void show() {
                System.out.println(1);
            }

            @Override
            public void show1() {
                System.out.println(2);
            }
        };
        in.show();
        in.show1();
    }
}
interface Inter{
    void show();
}
interface Inter1{
    void show();
    void show1();
}