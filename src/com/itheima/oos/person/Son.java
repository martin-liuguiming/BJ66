package com.itheima.oos.person;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/26 16:58
 ***************************/
public class Son extends Father {

    public int age = 0;

    public void show() {
        System.out.println("cba");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.age = 2;
        System.out.println(son.age);
    }

}
