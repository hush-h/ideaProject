package com.jcx.test1;

public class Zi extends  Fu{
    int a = 20;
    public void show(){
        int a = 30;
        System.out.println("a="+a);
        System.out.println("this.a="+this.a);
        System.out.println("super.a="+super.a);
        System.out.println("这是子类里的方法");
    }
    public void  method(){
        show();
        super.show();
    }
}
