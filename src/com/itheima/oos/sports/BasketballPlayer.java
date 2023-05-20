package com.itheima.oos.sports;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/28 14:53
 ***************************/
public class BasketballPlayer extends Person implements Player {
    @Override
    public void eat() {
        System.out.println("我是篮球运动员，我需要吃牛肉");
    }

    @Override
    public void train() {
        System.out.println("我是篮球运动员，我需要训练投篮");
    }
}
