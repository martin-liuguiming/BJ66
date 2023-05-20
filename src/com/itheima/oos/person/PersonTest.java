package com.itheima.oos.person;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/26 16:11
 ***************************/
public class PersonTest {

    public static void main(String[] args) {
//        Teacher teacher = new Teacher();
        Student student = new Student();
        System.out.println(student);
        System.out.println(Teacher.pi);;
        Teacher teacher = new Teacher();

//        teacher.teach();
        student.study();

//        teacher.setName("杨");
//        System.out.println(teacher.getName());
    }

}
