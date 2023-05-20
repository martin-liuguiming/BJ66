package com.itheima.oos.phone;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/26 15:37
 ***************************/
public class PhoneTest {

    public static void main(String[] args) {
        // 创建一个Phone对象
        Phone phone = new Phone("LV", "粉");
        Phone phone1 = new Phone();
        System.out.println(phone1);
        NewPhone newPhone = new NewPhone();
        phone1.call("yang");
        newPhone.call("yang");
        // 调用phone对象中的属性和方法
//        System.out.println(phone1.brand);
//        System.out.println(phone.color);
//        System.out.println(phone1.price);
        phone1.setBrand("LV");
        phone1.setColor("黑");
        phone1.setPrice(345678789.98);
        System.out.println(phone1.getBrand());

        phone.call("小苗");
        phone.sendMessage("小苗", "不接电话要手机干嘛！");
    }

}
