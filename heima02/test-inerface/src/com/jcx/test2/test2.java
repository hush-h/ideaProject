package com.jcx.test2;

public class test2 {
    public static void main(String[] args) {
         Fu f =new Zi();
         f.print();
        System.out.println(f.num);
        Zi z =(Zi) f;
        z.print();
        System.out.println(z.num);
        z.print1();
    }
}
class Fu{
    int num =10;
    public void print(){
        System.out.println("Fu....");
    }
}
class Zi extends Fu{
    int num = 20;

    @Override
    public void print() {
        System.out.println("Zi....");
    }
    public void print1(){
        System.out.println("Zi!!!!!");
    }
}