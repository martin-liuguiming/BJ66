package com.itheima.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/30 16:13
 ***************************/
public class JunitTest {
    @Test
    public void test() {
        System.out.println("这是一个测试方法");
    }

    @Before
    public void before() {
        System.out.println("这是测试方法之前运行的");
    }

    @After
    public void after() {
        System.out.println("这是测试方法之后运行的");
    }




}
