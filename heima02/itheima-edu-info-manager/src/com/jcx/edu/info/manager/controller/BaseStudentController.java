package com.jcx.edu.info.manager.controller;

import com.jcx.edu.info.manager.domain.Student;
import com.jcx.edu.info.manager.service.StudentService;

import java.util.Scanner;

public abstract class BaseStudentController {
    private StudentService studentService = new StudentService();
    Scanner sc = new Scanner(System.in);
    final public void start() {


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
                    //System.out.println("删除学生");
                    deleteStudentById();
                    break;
                case "3" :
                    //System.out.println("修改学生");
                    updateStudent();
                    break;
                case "4" :
                    //System.out.println("查看学生");
                    findAllStudent();
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

    final public void updateStudent() {
        String upId = inputStudentId();
        Student newStu = inputStudentInfo(upId);
        studentService.upStudent(upId,newStu);
        System.out.println("更改成功");

    }

    final public void deleteStudentById() {
        String delId =inputStudentId();

        studentService.deleteStudentById(delId);
        System.out.println("删除成功");

    }

    final public void findAllStudent() {
        Student[] stus = studentService.findAllStudent();
        if(stus==null){
            System.out.println("查无信息，请稍后重试");
            return;
        }
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if(stu!=null){
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBirthday());
            }
        }
    }

    final public void addStudent() {
        String id;
       // Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入id：");
           id = sc.next();
           boolean flag = studentService.isExist(id);
           if(flag){
               System.out.println("id已存在，请重新输入");
           }else break;
        }
        Student stu = inputStudentInfo(id);
        boolean result = studentService.addStudent(stu);
        if (result){
            System.out.println("添加成功");
        }else System.out.println("添加失败");
    }

    public String inputStudentId(){
        String id;
        while (true){
            System.out.println("请输入学生id：");
            id = sc.next();
            boolean flag = studentService.isExist(id);
            if(!flag){
                System.out.println("id不存在，请重新输入");
            }else break;
        }
        return id;
    }

    public abstract  Student inputStudentInfo(String id);

}
