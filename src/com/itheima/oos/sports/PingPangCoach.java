package com.itheima.oos.sports;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/28 14:55
 ***************************/
public class PingPangCoach extends Person implements Coach, Abroad {
    @Override
    public void learnEnglish() {
        System.out.println("我是教练我有翻译，随便学学就行");
    }

    @Override
    public int getScore() {
        return 7;
    }

    @Override
    public void teach(String context) {
        System.out.println("我是教练我教发球");
    }

    @Override
    public void eat() {
        System.out.println("我是教练我爱火锅");
    }
}
