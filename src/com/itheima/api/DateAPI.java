package com.itheima.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/28 17:27
 ***************************/
public class DateAPI {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());
        Date date1 = new Date(1L);
        System.out.println(date1.getTime());

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try{
            int i = 1/0;
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        Date date2 = null;
        try {
            date2 = format.parse("2019-09-12");
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            System.out.println("这是必须要执行的代码");
        }

        System.out.println("这是异常之后的代码");
//        System.out.println(date2.getTime());
//        String dateStr = format.format(date);
//        System.out.println(dateStr);

    }

}
