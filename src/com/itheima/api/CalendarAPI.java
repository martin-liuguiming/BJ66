package com.itheima.api;

import java.util.Calendar;
import java.util.Date;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/28 17:43
 ***************************/
public class CalendarAPI {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        Date date = calendar.getTime();

        System.out.println(date);


        int weekYear = calendar.getWeekYear();
        calendar.set(2019, 12, 12);
        System.out.println(calendar.toString());

    }

}
