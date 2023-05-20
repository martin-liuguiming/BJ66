package com.itheima.thread;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/30 14:55
 ***************************/
public class MyThread extends Thread {


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("这是一个线程类：" + i);
            try {
                Thread.sleep(20L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
