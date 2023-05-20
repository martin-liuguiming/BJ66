package com.itheima.array;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/26 11:22
 ***************************/
public class ArrayMaxValue {

    public static void main(String[] args) {
        // 先声明一个待求最大值数组
        int[] arr = {2, 43, 4, 6, 12, 887};
        // 遍历数组并求最大值
        int max = 0;
        for (int x : arr) {
            if (max < x) {
                max = x;
            }
        }
        System.out.println("arr的最大值为：" + max);
    }

}
