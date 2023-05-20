package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/29 11:26
 ***************************/
public class ArrayListTest {

    public static void main(String[] args) {
        // 创建一个ArrayList对象
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("**********Collections************");

        // 使用ArrayList相关API
        arrayList.add("spark");
        arrayList.add("flink");
        arrayList.add("spark");
        arrayList.add("hadoop");

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("lin", 24));
        students.add(new Student("yang", 34));
        students.add(new Student("lin", 34));
        Collections.sort(students);

        System.out.println(students);


        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);



        System.out.println("**********Collections************");

        String arr1 = arrayList.get(1);

        System.out.println(arr1);

        // 使用迭代器遍历ArrayList
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("*********************************************");
        arrayList.remove(1);

        arrayList.set(0, "flink");

        // 使用增强for循环遍历
        for (String str : arrayList) {
            System.out.println(str + "@");
        }
    }

}
