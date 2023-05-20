package com.itheima.oos.spark;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/28 15:21
 ***************************/
public abstract class SparkRDD<T, E> {

    public abstract E map(T input);

}
