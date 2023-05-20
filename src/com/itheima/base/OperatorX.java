package com.itheima.base;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/25 16:31
 ***************************/
public class OperatorX {

    public static void main(String[] args) {
        System.out.println("************** 自增自减运算符 ************");
        // 自增自减运算符
        /*
         * ++符号在变量后：表示先使用变量再自增
         * ++符号在变量前：表示先对变量自增再使用
         */
        int a = 10;
        // 将a赋值给b，再对a自增加1
        int b = a++;
        System.out.println(b + " " + a);

        int x = 10;
        // 先将x自增加1，再把x的值赋值给y
        int y = ++x;
        System.out.printf(x + " " + y);
        int z = 10;
        z += 1;
        System.out.println(z);

        System.out.println("************** 三元运算符 ************");
        int a1 = 10, b1 = 20;
        int c = 0;
        // 求a1 b1中的最大值
        c = (a1 > b1) ? a1 : b1;
        System.out.println(c);
    }

}
