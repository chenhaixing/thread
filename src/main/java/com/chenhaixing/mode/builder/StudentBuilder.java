package com.chenhaixing.mode.builder;

public class StudentBuilder extends Builder {

    public void setName() {
        student.setName("张三");
    }

    public void setAge() {
        student.setAge(20);
    }

    public void setSex() {
        student.setSex(1);
    }
}
