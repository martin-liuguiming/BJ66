package com.itheima.lambda;

import java.util.Arrays;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/29 16:19
 ***************************/
public class SparkRDD {

    public void flatmap(FlatMapFunc flatMapFunc, String line) {
        String[] strings = flatMapFunc.flatmap(line);
        Arrays.stream(strings).forEach(System.out::println);
    }

}
