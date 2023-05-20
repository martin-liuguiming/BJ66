package com.itheima.api;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/28 17:09
 ***************************/
public class ArraysAPI {

    public static void main(String[] args) {
        // 先声明一个待反转数组
        int[] arr = {2, 43, 4, 6, 12, 887};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.stream(arr).forEach(System.out::println);
    }

}
