package com.itheima.api;

import java.util.Scanner;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/28 16:48
 ***************************/
public class StringAPI {

    public static void main(String[] args) {

        String strr = args[0];
        System.out.println(strr + " " + args[1]);

        // 从键盘输入一个字符串
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        // 统计str中大 小 数字的个数
        int lower = 0;
        int upper = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                lower++;
            }
            if (c >= 'A' && c <= 'Z') {
                upper++;
            }
            if (c >= '0' && c <= '9') {
                num++;
            }
        }

        System.out.println("小写：" + lower + "   大写：" + upper + "   数字：" + num);


        String s1 = "yang";
        String s2 = "yang";
        String s4 = new String("yang");
        // public boolean equals(Object obj) 比较两个字符串的内容是否相同, 区分大小写.
        System.out.println(s1.equals(s2));
        // ==：如果是基本数据类型比较的就是值，如果是引用类型比较的就是地址
        System.out.println(s1 == s4);

        String s3 = s1;
        System.out.println(s3.equals(s1));

        int i = 4;
        int j = 4;
        System.out.println(i == j);

    }

}
