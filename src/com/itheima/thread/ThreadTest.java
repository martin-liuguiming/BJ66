package com.itheima.thread;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/30 14:55
 ***************************/
public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("********** 通过继承Thread类来实现多线程 **********");
        // 创建一个线程类
        MyThread myThread = new MyThread();
        // 调用线程类的start方法启动线程
        myThread.start();

        System.out.println("************** 通过实现Runnable接口来实现多线程 ***************");
        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);

        thread.start();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("匿名内部类实现多线程");
            }
        });

        thread1.start();


        for (int i = 0; i < 1000; i++) {
            System.out.println("这是主类：" + i);
            Thread.sleep(20L);
        }

    }

}
