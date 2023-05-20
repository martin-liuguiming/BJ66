package com.itheima.array;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/28 10:38
 ***************************/
public class StaircaseUp {

    public static void main(String[] args) {
        // 有n阶楼梯，每次可以上一层或两层，有多少种上法
        // f(n) = f(n-1) + f(n-2)
        // n=1 n=2 要有终止条件
        int n = 50;
        int result = fibonacci(n);
        System.out.println(result);

    }

    private static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
