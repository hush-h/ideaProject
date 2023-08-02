package com.jcx.edu.info.manager.dao;

import com.jcx.edu.info.manager.domain.Teacher;
import com.jcx.edu.info.manager.domain.Teacher;

public class TeacherDao {
    private static Teacher[] teas = new Teacher[5];
    static {
        Teacher tea1 =new Teacher("1","1","1","1");
        Teacher tea2 =new Teacher("2","2","2","2");
        teas[1]=tea1;
        teas[2]=tea2;
    }
    public boolean addTeacher(Teacher tea) {
        int index = -1;
        for (int i = 0; i < teas.length; i++) {
            Teacher teacher = teas[i];
            if(teacher==null){
                index=i;
                break;
            }
        }
        if(index==-1){
            return false;
        }else {
            teas[index]=tea;
            return true;
        }
    }

    public boolean isExits(String id) {
        boolean flags = false;
        for (int i = 0; i < teas.length; i++) {
            Teacher teacher = teas[i];
            if(teacher!=null&&teacher.getId().equals(id)){
                flags = true;
                break;
            }
        }
        return flags;
    }

    public Teacher[] findAllTeacher() {
        return teas;
    }

    public void updateTeacher(String id ,Teacher tea) {
        int index = getIndex(id);
        teas[index] = tea;
    }

    public void deleteTeacher(String delId) {
        int index = getIndex(delId);
        teas[index] = null;
    }

    public int getIndex(String id){
        int index =-1;
        for (int i = 0; i < teas.length; i++) {
            Teacher teacher = teas[i];
            if(teacher!=null&&teacher.getId().equals(id)){
                index =i;
                break;
            }
        }
        return index;
    }
}
