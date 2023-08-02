package com.jcx.edu.info.manager.service;

import com.jcx.edu.info.manager.dao.TeacherDao;
import com.jcx.edu.info.manager.domain.Teacher;

public class TeacherService {
    TeacherDao teacherDao = new TeacherDao();
    public boolean addTeacher(Teacher tea) {
        boolean result = teacherDao.addTeacher(tea);
        return result;
    }

    public boolean isExits(String id) {

        boolean flags = teacherDao.isExits(id);
        return flags;
    }

    public Teacher[] findAllTeacher() {
        Teacher[] teas = teacherDao.findAllTeacher();
        boolean flags = false;
        for (int i = 0; i < teas.length; i++) {
            Teacher tea = teas[i];
            if (tea != null){
                flags = true;
                break;
            }
        }
        if (!flags) {
            teas = null;
        }
        return teas;

    }

    public void updateTeacher(String id,Teacher tea) {
        teacherDao.updateTeacher(id,tea);
    }

    public void deleteTeacher(String delId) {
        teacherDao.deleteTeacher(delId);
    }
}
