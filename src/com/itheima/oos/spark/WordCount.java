package com.itheima.oos.spark;

import java.util.Arrays;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/28 15:30
 ***************************/
public class WordCount {

    public static void main(String[] args) {
        String line = "spark flink spark";

        SparkContext<String, String[]> sc = new SparkContext<>();

        String[] s = sc.readLine(new SparkRDD<String, String[]>() {
            @Override
            public String[] map(String input) {
                String[] s = input.split(" ");
                for (int i = 0; i < s.length; i++) {
                    s[i] = s[i] + ",1";
                }
                return s;
            }
        }, line);

        Arrays.stream(s).forEach(System.out::println);
    }

}
