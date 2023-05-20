package com.itheima.base;

import java.util.Scanner;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/25 17:02
 ***************************/
public class IfX {

    public static void main(String[] args) {
        // 从键盘获取数字
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的成绩：");
        int score = scanner.nextInt();

        // 用if进行判断
        if (score >= 100) {
            System.out.println("真棒！");
        } else if (score >= 60) {
            System.out.println("恭喜您，合格了！");
        } else {
            System.out.println("加油！成绩不合格");
        }

    }

}
