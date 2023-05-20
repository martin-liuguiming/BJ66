package com.itheima.api;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/28 16:16
 ***************************/
public class ObjectEquals {

    public static void main(String[] args) {
        Student s1 = new Student("杨紫", 33);
        Student s2 = new Student("杨紫", 33);
        System.out.println(s1);
        if (s1.equals(s2))  {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
    }

}
