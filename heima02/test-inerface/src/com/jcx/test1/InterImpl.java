package com.jcx.test1;

public class InterImpl implements Inter,InterA{
    @Override
    public void study() {
        System.out.println("我是实现类中的study方法");
    }

    @Override
    public void print1() {
        System.out.println(1);
    }

    @Override
    public void print2() {
        System.out.println(2);
    }

}
