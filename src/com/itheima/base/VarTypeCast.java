package com.itheima.base;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/25 15:49
 ***************************/
public class VarTypeCast {

    public static void main(String[] args) {
        // 自动类型转换,小转大
        byte x1 = 127;
        int x2 = 131;
        short x3 = x1;
        System.out.println(x1 + " " + x2 + " " + x3 + " " + (x1 + x2 + x3));

        // 强制类型转换，大转小
        byte x4 = (byte) x2;
        System.out.println(x4);
        char a = 'a';
        int b = 1;
        System.out.println(a+b);
    }

}
