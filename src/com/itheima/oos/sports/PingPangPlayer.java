package com.itheima.oos.sports;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/28 14:50
 ***************************/
public class PingPangPlayer extends Person implements Player, Abroad {
    @Override
    public void learnEnglish() {
        System.out.println("我是乒乓运动员，需要出国学习英语");
    }

    @Override
    public int getScore() {
        return 0;
    }

    @Override
    public void eat() {
        System.out.println("我是乒乓运动员，我不吃海参");
    }

    @Override
    public void train() {
        System.out.println("我是乒乓运动员，需要练发球");
    }
}
