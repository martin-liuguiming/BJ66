package com.itheima.collection;

import java.util.HashMap;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/29 14:40
 ***************************/
public class HashMapTest {

    public static void main(String[] args) {
        // 创建一个hashmap对象
        HashMap<String, String> hashMap = new HashMap<>();

        // 相关API
        hashMap.put("0001", "高圆圆");
        hashMap.put("0002", "杨幂");
        hashMap.put("0003", "热依扎");

        String name1 = hashMap.get("0003");

        System.out.println(name1);


        for (String userid : hashMap.keySet()) {
            System.out.println(hashMap.get(userid));
        }

        boolean b = hashMap.containsValue("杨幂");
        System.out.println(b);


    }

}
