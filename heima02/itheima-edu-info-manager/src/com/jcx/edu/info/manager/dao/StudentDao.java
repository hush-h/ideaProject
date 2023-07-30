package com.jcx.edu.info.manager.dao;

import com.jcx.edu.info.manager.domain.Student;

public class StudentDao {
    public boolean addStudent(Student stu) {
        Student[] stus = new Student[5];
        int index =-1;
        for (int i = 0; i < stus.length; i++) {
            if (stus[i]==null){            //此处不能写成stus[i].getId()==null
                index = i;                 //会引发空指针异常，因为如果stus[i]为null
                break;                     //无法调用其方法
            }
        }
        if (index==-1){
            return false;
        }else {
            stus[index] = stu;
            return true;
        }
    }
}
