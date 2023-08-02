package com.jcx.edu.info.manager.factory;

import com.jcx.edu.info.manager.dao.BaseStudentDao;
import com.jcx.edu.info.manager.dao.OtherStudentDao;
import com.jcx.edu.info.manager.dao.StudentDao;

public class StudentDaoFactory {
    public static BaseStudentDao getStudentDao(){
        return  new StudentDao();
        //return new OtherStudentDao();
    }
}
