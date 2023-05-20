package com.itheima.oos.spark;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/28 15:20
 ***************************/
public class SparkContext<T, E> {

    public E readLine(SparkRDD<T, E> rdd, T line){
        E words = rdd.map(line);
        return words;
    }

}
