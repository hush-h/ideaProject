package com.jcx.DemoArray;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentText {


    public static void main(String[] args) {
           ArrayList<Student> list = new ArrayList<>();
       lo: while(true){
            Scanner sc = new Scanner((System.in));
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择:");

            String choice = sc.next();


            switch(choice){
                case "1":
                    //System.out.println("添加学生");
                    addStudent(list);
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deleteStudent(list);
                    break;
                case "3":
                    //System.out.println("修改学生");
                    updateStudent(list);
                    break;
                case "4":
                    // System.out.println("查看学生");
                    queryStudents(list);
                    break;
                case "5":
                    System.out.println("感谢您的使用");
                    break lo;
                default:
                    System.out.println("您的输入有误");
                    break;
            }
        }

    }

    private static void updateStudent(ArrayList<Student> list) {
        System.out.println("请输入你要修改学生的学号：");
        Scanner sc = new Scanner(System.in);
        String sid = sc.next();
        int index = getIndex(list,sid);
        if(index == -1){
            System.out.println("你输入的学号不存在");
        }else{
            // 存在: 接收新的学生信息
            System.out.println("请输入新的学生姓名:");
            String name = sc.next();
            System.out.println("请输入新的学生年龄:");
            int age = sc.nextInt();
            System.out.println("请输入新的学生生日:");
            String birthday = sc.next();
            // 封装为新的学生对象
            Student stu = new Student(sid, name, age, birthday);
            // 调用集合的set方法, 完成修改
            list.set(index,stu);
            System.out.println("修改成功");
        }
    }

    private static void deleteStudent(ArrayList<Student> list) {
        System.out.println("请输入你要删除学生的学号：");
        Scanner sc = new Scanner(System.in);
        String sid = sc.next();
        int index = getIndex(list,sid);
        if(index == -1){
            System.out.println("你输入的学号不存在");
        }else{
            list.remove(index);
            System.out.println("删除成功");
        }
    }

    private static void queryStudents(ArrayList<Student> list) {
        if(list.size()==0){
            System.out.println("表中无数据，请先添加数据！");
            return;
        }else{
            System.out.println("学号    姓名      年龄     生日");
            for (Student stu:
                 list) {
                System.out.println(stu.getSid()   +   stu.getName()+   stu.getAge()+    stu.getBirthday());
            }

        }
    }

    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号：");
        String sid = sc.next();
        int index = getIndex(list, sid);
        if (index == -1) {
            System.out.println("请输入姓名：");
            String name = sc.next();
            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            System.out.println("请输入生日：");
            String birthday = sc.next();
            Student stu = new Student(sid, name, age, birthday);
            list.add(stu);
            System.out.println("添加成功！");
        } else {
            System.out.println("你输入的学号已存在！！");

        }
    }


        public static int getIndex( ArrayList<Student> list,String sid){
            int index = -1;
            for(int i=0;i<list.size();i++){
                Student stu = list.get(i);
                if(stu.getSid().equals(sid)){
                    index=i;
                }
            }
            return index;
        }

}
