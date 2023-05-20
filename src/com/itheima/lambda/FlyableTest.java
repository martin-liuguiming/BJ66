package com.itheima.lambda;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/29 15:48
 ***************************/
public class FlyableTest {

    public static void main(String[] args) {
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println("飞过" + s);
            }
        });

        // lambda
        useFlyable(s -> System.out.println("飞过" + s));
    }

    public static void useFlyable(Flyable flyable) {
        flyable.fly("中国台湾");
    }

}
