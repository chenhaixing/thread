package com.chenhaixing.mode.sigleton;

import com.chenhaixing.mode.Student;

/**
 * 单例模式_枚举类
 */
public enum Test5 {
    INSTANCE;
    private Student student;
    Test5() {
        this.student =new Student();
    }
    public Student getInstance(){
        return student;
    }
}
