package com.itheima.oos.sports;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/28 14:56
 ***************************/
public class BasketballCoach extends Person implements Coach {
    @Override
    public void teach(String context) {
        System.out.println("我是篮球教练，我教战术");
    }

    @Override
    public void eat() {
        System.out.println("我是篮球教练，我不吃都行");
    }
}
