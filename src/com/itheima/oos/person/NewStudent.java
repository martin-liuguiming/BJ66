package com.itheima.oos.person;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/26 17:15
 ***************************/
public class NewStudent {

    static {
        System.out.println("这是一个静态代码块");
    }

    public String name;
    public static int age;

    public void show1() {
        System.out.println("show1");
        System.out.println(this.name);
        System.out.println(age);
        show2();
        show4();
    }

    public void show2() {
        System.out.println("show2");
    }

    public static void show3() {
        System.out.println("show3");
        System.out.println(age);
        show4();
    }

    public static void show4() {
        System.out.println("show4");
    }

    public static void main(String[] args) {
        NewStudent.show3();
    }

}
