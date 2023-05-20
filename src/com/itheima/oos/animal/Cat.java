package com.itheima.oos.animal;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/26 16:43
 ***************************/
public class Cat extends Animal implements Jumpping {

    @Override
    public void eat() {
        System.out.println("猫喜欢吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("猫能跳上桌子");
    }
}
