package com.itheima.array;

import java.util.Random;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/26 10:19
 ***************************/
public class ArrayX {

    public static void main(String[] args) {
        // 动态声明
        int[] a = new int[3];
        int b[] = new int[4];

        System.out.println(a);


        System.out.println(a[0]);
        System.out.println(b[1]);

        String[] c = new String[4];
        System.out.println(c[0]);

        // 静态声明
        String[] d = {"yang", "kun", "lin"};
        System.out.println(d[0]);
        System.out.println(d.length);

        // 遍历数组
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        // 增强for循环
        for (String str : d) {
            System.out.print(str + " ");
        }

        Random[] randoms = new Random[]{new Random(), new Random()};
        int i = randoms[0].nextInt();

    }
}
