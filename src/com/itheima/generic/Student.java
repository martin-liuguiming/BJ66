package com.itheima.generic;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/29 16:57
 ***************************/
public class Student<T, A> {

    T phoneNumber;

    A nickName;

    public A getNickName() {
        return nickName;
    }

    public void setNickName(A nickName) {
        this.nickName = nickName;
    }

    public T getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(T phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public static <E> void println(E[] arr) {
        for (E e : arr) {
            System.out.println(e);
        }
    }
}
