package com.itheima.oos.phone;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/26 16:15
 ***************************/
public class NewPhone extends Phone {

    /**
     * 重写父类中的call方法
     * @param name
     */
    @Override
    public void call(String name) {
        super.call("zhang");
        System.out.println("用语音电话打电话给：" + name);
    }

}
