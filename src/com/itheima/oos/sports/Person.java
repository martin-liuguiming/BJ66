package com.itheima.oos.sports;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/28 14:44
 ***************************/
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person {

    private String name;

    private long age;

    private String nickname;

    public abstract void eat();

}
