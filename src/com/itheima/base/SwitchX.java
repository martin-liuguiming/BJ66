package com.itheima.base;

import java.util.Scanner;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/25 17:09
 ***************************/
public class SwitchX {

    public static void main(String[] args) {
        // 从键盘获取数字
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = scanner.nextInt();

        // 使用switch选择月份输出季节
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("全年没这个月份");
                break;
        }

        System.out.println("这个其它的语句");
    }

}
