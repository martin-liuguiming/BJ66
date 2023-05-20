package com.itheima.lambda;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/29 15:40
 ***************************/
public class AnimalTest {

    public static void main(String[] args) {
        // 匿名内部类实现
        show(new Animal() {
            @Override
            public void eat() {
                System.out.println("这是一个匿名内部类！");
            }
        });

        // lambda实现
        show(() -> System.out.println("这是一个lambda!"));
    }

    public static void show(Animal an) {
        an.eat();
    }

}
