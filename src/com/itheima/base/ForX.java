package com.itheima.base;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/25 17:20
 ***************************/
public class ForX {

    public static void main(String[] args) {
        // 通过for循环，打印1~5
        for (int i = 0; i < 5; i++) {
            int j = i + 1;
            System.out.print(j + " ");
        }

        // 通过for循环，打印5~1
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("*********** 求1~100范围内的偶数之和 **********");
        // 求1~100范围内的偶数之和
        int j = 0;
        for (int i = 1; i < 101; i++) {
            if (i%2 == 0) {
                j += i;
            }
        }
        System.out.println("1~100范围内的偶数之和：" + j);
    }

}
