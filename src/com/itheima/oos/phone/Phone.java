package com.itheima.oos.phone;

import javax.swing.text.StringContent;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/26 15:32
 ***************************/
public class Phone {

    private String brand; //品牌
    private double price; //价格
    private String color; //颜色

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public Phone(String brand, double price, String color) {
        this.price = price;
        this.brand = brand;
        this.color = color;
    }

    public Phone(String brand, String color) {
        this.price = price;
        this.brand = brand;
        this.color = color;
    }

    public Phone(){}

    public Phone(String color) {
        this.color = color;
    }

    /**
     * 打电话
     * @param toWho
     */
    public void call(String toWho) {
        System.out.println("打电话给：" + toWho);
    }

    /**
     * 发短信
     * @param toWho
     * @param context
     */
    public void sendMessage(String toWho, String context) {
        System.out.println("给-" + toWho + "发短信，内容为：" + context);
    }

}
