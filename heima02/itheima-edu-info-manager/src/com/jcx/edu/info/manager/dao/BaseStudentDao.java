package com.jcx.edu.info.manager.dao;

import com.jcx.edu.info.manager.domain.Student;

public interface  BaseStudentDao {
    public abstract boolean addStudent(Student stu);

    public abstract Student[] findAllStudent();

    public abstract void deleteStudentById(String delId) ;

    public abstract int getIndex(String id) ;

    public abstract void upStudent(String upId, Student newStu);

}
