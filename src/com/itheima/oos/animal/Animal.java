package com.itheima.oos.animal;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/26 16:42
 ***************************/
public abstract class Animal {

    public abstract void eat();

    public void sleep() {
        System.out.println("是个动物都需要睡觉");
    }

}
