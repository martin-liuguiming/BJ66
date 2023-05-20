package com.itheima.collection;

import java.util.HashSet;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/29 11:47
 ***************************/
public class HashSetTest {

    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("hello");
        strings.add("world");
        strings.add("java");
        strings.add("world");

        for (String str :
                strings) {
            System.out.println(str);
        }
        System.out.println("********************************************");
        // 向列表中添加student对象
        Student student1 = new Student("yangkunlin", 25);
        Student student2 = new Student("yangkunlin", 25);
        Student student3 = new Student("yawei", 18);
        HashSet<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student st :
                students) {
            System.out.println(st);
        }


    }

}
