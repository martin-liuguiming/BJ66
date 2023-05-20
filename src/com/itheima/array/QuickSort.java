package com.itheima.array;

import java.util.Arrays;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/28 10:58
 ***************************/
public class QuickSort {

    public static void main(String[] args) {
        // 先声明一个待求最大值数组
        int[] arr = {2, 43, 4, 6, 12, 887};

        quickSort(arr, 0, arr.length - 1);

        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int l = left;
            int r = right;
            int base = arr[left];
            while (l < r) {
                while (arr[l] < base && l < r) {
                    l++;
                }
                while (arr[r] > base && l < r) {
                    r--;
                }
                if (l <= r) {
                    int tmp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = tmp;
                }
            }
            if (l < r) {
                int tmp = arr[left];
                arr[left] = arr[l];
                arr[l] = tmp;
            }
            quickSort(arr, left, l - 1);
            quickSort(arr, l + 1, right);
        }
    }

}
