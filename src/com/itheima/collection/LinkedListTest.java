package com.itheima.collection;

import java.util.Iterator;
import java.util.LinkedList;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/29 11:35
 ***************************/
public class LinkedListTest {

    public static void main(String[] args) {
        // 创建一个用于保存Student类的LinkedList对象
        LinkedList<Student> students = new LinkedList<>();

        // 向列表中添加student对象
        Student student1 = new Student("yangkunlin", 25);
        students.add(student1);
        students.add(new Student("yawei", 18));
        students.add(student1);

        // 使用迭代器遍历列表
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "@iterator");
        }
        System.out.println("**********************************************");
        Student student = students.get(0);
        System.out.println(student);

        students.remove(0);

        // 使用增强for遍历
        for (Student st : students) {
            System.out.println(st + "@for");
        }
    }

}
