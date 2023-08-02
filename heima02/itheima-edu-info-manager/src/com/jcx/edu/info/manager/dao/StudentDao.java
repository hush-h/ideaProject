package com.jcx.edu.info.manager.dao;

import com.jcx.edu.info.manager.domain.Student;

public class StudentDao implements BaseStudentDao{
    private static Student[] stus = new Student[5];
    static {
        Student stu1 =new Student("1","1","1","1");
        Student stu2 =new Student("2","2","2","2");
        stus[1]=stu1;
        stus[2]=stu2;
    }
    public boolean addStudent(Student stu) {

        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            if (stus[i] == null) {            //此处不能写成stus[i].getId()==null
                index = i;                 //会引发空指针异常，因为如果stus[i]为null
                break;                     //无法调用其方法
            }
        }
        if (index == -1) {
            return false;
        } else {
            stus[index] = stu;
            return true;
        }
    }

    public Student[] findAllStudent() {
        return stus;
    }

    public void deleteStudentById(String delId) {
        int index = getIndex(delId);
        stus[index]=null;
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if (stu != null && stu.getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void upStudent(String upId, Student newStu) {
        int index = getIndex(upId);
        stus[index]=newStu;
    }
}
