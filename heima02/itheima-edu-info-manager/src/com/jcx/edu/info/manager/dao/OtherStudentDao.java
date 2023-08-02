package com.jcx.edu.info.manager.dao;

import com.jcx.edu.info.manager.domain.Student;

import java.util.ArrayList;

public class OtherStudentDao implements BaseStudentDao{
    private static ArrayList<Student> stus = new ArrayList<>();
    static {
        Student stu1 =new Student("1","1","1","1");
        Student stu2 =new Student("2","2","2","2");
        stus.add(stu1);
        stus.add(stu2);
    }
    public boolean addStudent(Student stu) {
        stus.add(stu);
        return true;
    }

    public Student[] findAllStudent() {
        Student students[] = new Student[stus.size()];
        for (int i = 0; i < stus.size(); i++) {
            students[i]=stus.get(i);
        }
        return students;
    }

    public void deleteStudentById(String delId) {
        stus.remove(delId);
    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stus.size(); i++) {
            Student stu = stus.get(i);
            if (stu != null && stu.getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void upStudent(String upId, Student newStu) {
        int index = getIndex(upId);
        stus.set(index,newStu);
    }

}
