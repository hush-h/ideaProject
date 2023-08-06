package com.jcx.test1;

import java.math.BigDecimal;

public class MyBigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal bg1 = new BigDecimal("0.1");
        BigDecimal bg2 = new BigDecimal("0.2");
        BigDecimal add = bg1.add(bg2);
        System.out.println(add);
        System.out.println(0.1+0.2);
        BigDecimal subtract =bg1.subtract(bg2);
        System.out.println(subtract);
        BigDecimal multiply = bg1.multiply(bg2);
        System.out.println(multiply);
        BigDecimal divide = bg1.divide(bg2);
        System.out.println(divide);
    }
}
