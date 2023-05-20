package com.itheima.base;

import java.util.Scanner;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/25 16:48
 ***************************/
public class ScannerC {

    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        // 调用sc对象中的方法获取输入
        System.out.println("请输入您的年龄：");
        int input = sc.nextInt();
        System.out.println("您的年龄为：" + input);
    }

}
