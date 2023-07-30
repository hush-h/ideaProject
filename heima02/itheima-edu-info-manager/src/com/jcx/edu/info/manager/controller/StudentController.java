package com.jcx.edu.info.manager.controller;

import com.jcx.edu.info.manager.domain.Student;
import com.jcx.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentController {
    public void start() {
        Scanner sc = new Scanner(System.in);

        //学生管理菜单
     studentLoop: while (true){
         System.out.println("--------欢迎来到 <学生> 管理系统--------");
         System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");

         String choice = sc.next();
            switch (choice){
                case "1" :
                    //System.out.println("添加学生");
                    addStudent();
                    break;
                case "2" :
                    System.out.println("删除学生");
                    break;
                case "3" :
                    System.out.println("修改学生");
                    break;
                case "4" :
                    System.out.println("查看学生");
                    break;
                case "5" :
                    System.out.println("感谢你的使用");
                    break studentLoop;
                default:
                    System.out.println("你输入的有误，请重新输入");
                    break;
            }
        }
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号：");
        String id = sc.next();
        System.out.println("请输入学号：");
        String name = sc.next();
        System.out.println("请输入学号：");
        String age = sc.next();
        System.out.println("请输入学号：");
        String birthday = sc.next();
        Student stu = new Student(id,name,age,birthday);
        StudentService studentService = new StudentService();
        boolean result = studentService.addStudent(stu);
        if (result){
            System.out.println("添加成功");
        }else System.out.println("添加失败");
    }
}
