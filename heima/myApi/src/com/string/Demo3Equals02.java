package com.string;

import java.util.Scanner;

public class Demo3Equals02 {
    public static void main(String[] args) {
        String account = "123";
        String pass = "1212";
        for(int i = 0;i<=5;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的账号：");
            String ac = sc.nextLine();
            System.out.println("请输入您的密码：");
            String pa = sc.nextLine();
            if(ac.equals(account)&&pa.equals(pass)){
                System.out.println("登录成功！");
                break;
            }
            else{
                System.out.println("您输入的账号密码有误，请重新输入！");
            }
        }

    }
}
