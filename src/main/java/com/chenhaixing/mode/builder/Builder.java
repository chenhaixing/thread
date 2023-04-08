package com.chenhaixing.mode.builder;

public abstract class Builder {
    protected   Student student=new Student();

    public abstract void setName();

    public abstract void setAge();

    public abstract void setSex();

    public Student getResult(){
        return  student;
    }
}
