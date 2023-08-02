package com.jcx.test_static;

public class TestStatic {

    public static void main(String[] args) {
        Student.school = "xnly";//优先于对象存在，随着类的加载而加载

        Student stu1 = new Student();
        stu1.name = "jcx";
        stu1.age = 3;
        //stu1.school = "xnly";
        stu1.show();


        Student stu2 = new Student();
        stu2.show();
        stu2.school = "tcyz";
        stu1.show();
        stu2.show();
    }
}
