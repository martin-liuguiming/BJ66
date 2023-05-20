package com.itheima.oos.person;

import lombok.Data;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/26 16:09
 ***************************/
@Data
public class Teacher extends Person {

    public final static double pi = 3.1415926;

    public String teachWhat;

    public static void teach() {
        System.out.println("这是一个教学行为");
    }

}
