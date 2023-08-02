package com.jcx.edu.info.manager.entry;


import com.jcx.edu.info.manager.controller.StudentController;
import com.jcx.edu.info.manager.controller.TeacherController;
import com.jcx.edu.info.manager.domain.Teacher;

import java.util.Scanner;

public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //主菜单
        while (true){
            System.out.println("--------欢迎来到黑马信息管理系统--------");
            System.out.println("请输入您的选择: 1.学生管理  2.老师管理  3.退出");
            String choice = sc.next();
            switch (choice){
                case "1" :
                    //System.out.println("学生管理");
                    StudentController studentController = new StudentController();
                    studentController.start();
                    break;
                case "2" :
                    //System.out.println("老师管理");
                    TeacherController teacherController =new TeacherController();
                    teacherController.start();
                    break;
                case "3" :
                    System.out.println("感谢你的使用");
                    System.exit(0);  //退出当前正在运行jvm虚拟机
                    break;
                default:
                    System.out.println("你输入的有误，请重新输入");
                    break;
            }
        }

    }
}
