package com.itheima.thread;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/30 15:06
 ***************************/
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("这是一个实现Runnable接口的线程：" + i);
            try {
                Thread.sleep(20L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
