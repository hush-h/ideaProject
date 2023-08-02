package com.jcx.edu.info.manager.controller;

import com.jcx.edu.info.manager.domain.Student;
import com.jcx.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class StudentController extends BaseStudentController{
    //private StudentService studentService = new StudentService();
    @Override
    public Student inputStudentInfo(String id){
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        String age = sc.next();
        System.out.println("请输入生日：");
        String birthday = sc.next();
        Student stu = new Student(id,name,age,birthday);
        return stu;
    }

}
