package com.itheima.array;

import java.util.Arrays;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/26 11:32
 ***************************/
public class ArraySort {

    public static void main(String[] args) {
        // 先声明一个待求最大值数组
        int[] arr = {2, 43, 4, 6, 12, 887};

        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            int tmp = arr[max];
            arr[max] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        for (Integer i :
                arr) {
            System.out.println(i);
        }

        Arrays.stream(arr).forEach(System.out::println);

    }

}
