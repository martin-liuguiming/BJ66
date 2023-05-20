package com.itheima.api;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/28 17:03
 ***************************/
public class StringBuilderAPI {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("yang kun lin");
        stringBuilder.append(" flink");

        System.out.println(stringBuilder);

        String name = stringBuilder.toString();

        System.out.println(name);

        System.out.println(stringBuilder.reverse());
    }

}
