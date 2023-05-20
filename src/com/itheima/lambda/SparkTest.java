package com.itheima.lambda;

import java.util.Arrays;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/29 16:16
 ***************************/
public class SparkTest {

    public static void main(String[] args) {

        String line = "spark hadoop flink hadoop";

        SparkRDD rdd = new SparkRDD();
        rdd.flatmap(new FlatMapFunc() {
            @Override
            public String[] flatmap(String line) {
                return line.split(" ");
            }
        }, line);

        rdd.flatmap(x -> x.split(" "), line);
    }


}
