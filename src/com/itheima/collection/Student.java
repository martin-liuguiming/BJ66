package com.itheima.collection;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/29 11:34
 ***************************/
@Data
public class Student implements Comparable<Student> {

    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
    }
}
