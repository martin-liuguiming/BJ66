package com.itheima.collection;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/29 15:07
 ***************************/
public class VarArgs {

    public static void main(String[] args) {
        // 调用getSum计算n个整数的和
        Float sum = getSum(1.0f, 32, 45, 2, 3, 5,32);
        System.out.println(sum);
    }

    private static Float getSum(Float start, Integer... n) {
        Integer sum = 0;
        for (Integer i : n) {
            sum += i;
        }
        return sum + start;
    }

}
