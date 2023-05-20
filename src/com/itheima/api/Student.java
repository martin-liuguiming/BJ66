package com.itheima.api;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/28 16:17
 ***************************/
public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name：" + name + " age：" + age;
    }

    public boolean equals(Student s2) {
        if (this.name == s2.name && this.age == s2.age ) {
            return true;
        } else {
            return false;
        }
    }

}
