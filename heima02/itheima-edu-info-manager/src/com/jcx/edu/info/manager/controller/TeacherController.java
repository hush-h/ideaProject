package com.jcx.edu.info.manager.controller;

import com.jcx.edu.info.manager.domain.Student;
import com.jcx.edu.info.manager.domain.Teacher;
import com.jcx.edu.info.manager.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    Scanner sc =new Scanner(System.in);
    TeacherService teacherService = new TeacherService();

    public void start() {
        teacherLoop: while (true){
            System.out.println("--------欢迎来到 <老师> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            String choice = sc.next();
             switch (choice){
                case "1" :
                    //System.out.println("添加学生");
                    addTeacher();
                    break;
                case "2" :
                    //System.out.println("删除学生");
                    deleteTeacherById();
                    break;
                case "3" :
                    //System.out.println("修改学生");
                    updateTeacher();
                    break;
                case "4" :
                    //System.out.println("查看学生");
                    findAllTeacher();
                    break;
                case "5" :
                    System.out.println("感谢你的使用");
                    break teacherLoop;
                default:
                    System.out.println("你输入的有误，请重新输入");
                    break;
             }
        }
    }

    public void deleteTeacherById() {
        String delId = inputTeacherId();
        teacherService.deleteTeacher(delId);
        System.out.println("删除成功");
    }

    public void updateTeacher() {
        String upId = inputTeacherId();
        Teacher tea = inputTeacherInfo(upId);
        teacherService.updateTeacher(upId,tea);
        System.out.println("添加成功");
    }

    public void findAllTeacher() {
        Teacher[] teas = teacherService.findAllTeacher();
        if(teas==null){
            System.out.println("查无信息，请稍后重试");
            return;
        }
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < teas.length; i++) {
            Teacher tea = teas[i];
            if(tea!=null){
                System.out.println(tea.getId() + "\t" + tea.getName() + "\t" + tea.getAge() + "\t\t" + tea.getBirthday());
            }
        }
    }

    public void addTeacher() {
        String id;
        while (true) {
            System.out.println("请输入id：");
            id = sc.next();
            boolean flags = teacherService.isExits(id);
            if(flags){
                System.out.println("该id已存在");
            }else break;
        }
        Teacher tea = inputTeacherInfo(id);
        boolean result = teacherService.addTeacher(tea);
        if (result){
            System.out.println("添加成功");
        }else System.out.println("添加失败");
    }
    public Teacher inputTeacherInfo(String id){
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        String age = sc.next();
        System.out.println("请输入生日：");
        String birthday = sc.next();
        Teacher tea = new Teacher(id,name,age,birthday);
        return tea;
    }

    public String inputTeacherId(){
        String id;
        while (true) {
            System.out.println("请输入id：");
            id = sc.next();
            boolean flags = teacherService.isExits(id);
            if(!flags){
                System.out.println("该id不存在");
            }else break;
        }
        return id;
    }
}
