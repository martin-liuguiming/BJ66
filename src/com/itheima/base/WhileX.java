package com.itheima.base;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/25 17:31
 ***************************/
public class WhileX {

    public static void main(String[] args) {
        // 打印10次HelloWorld
        int i = 0;
        while (i++ < 10) {
            System.out.println("这是第" + i + "次 HelloWorld");
        }

        for (int j = 1; j <= 10; j++) {
            if (j % 3 == 0) {
                // break; // 1,2
                continue; // 除了3,6,9
            }
            System.out.println("Hello World! " + j);
        }

        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                System.out.println(j + " " + k);
            }
        }
    }

}
