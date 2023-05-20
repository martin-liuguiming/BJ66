package com.itheima.base;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/25 15:05
 ***************************/
public class VarCreate {

    public static void main(String[] args) {
        // 方式一：声明变量并赋值
        int age = 35;
        String name = "yang";

        // 方式二：先声明，后赋值
        String stuName = "wang";
        int age1 =18 , age2 = 34;
        age1 = 18;
        age2 = 28;

        System.out.println(age + " " + stuName);
    }

}
