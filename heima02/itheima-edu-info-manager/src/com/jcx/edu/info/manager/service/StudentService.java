package com.jcx.edu.info.manager.service;

import com.jcx.edu.info.manager.dao.StudentDao;
import com.jcx.edu.info.manager.domain.Student;

public class StudentService {


    public boolean addStudent(Student stu) {
        StudentDao studentDao = new StudentDao();
        return studentDao.addStudent(stu);
    }
}
