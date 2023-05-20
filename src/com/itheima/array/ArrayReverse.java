package com.itheima.array;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/26 11:26
 ***************************/
public class ArrayReverse {

    public static void main(String[] args) {
        // 先声明一个待反转数组
        int[] arr = {2, 43, 4, 6, 12, 887};
        // 循环遍历数组并反转
        int[] newArr = new int[arr.length];
        for (int i = arr.length; i > 0 ; i--) {
            newArr[arr.length - i] = arr[i - 1];
        }
        for (int x :
                newArr) {
            System.out.print(x + " ");
        }
    }

}
