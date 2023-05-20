package com.itheima.lambda;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/29 15:56
 ***************************/
public class AddableTest {

    public static void main(String[] args) {
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x - y;
            }
        });

        useAddable(Integer::sum);
    }

    public static void useAddable(Addable addable) {
        int sum = addable.add(5, 6);
        System.out.println(sum);
    }

}
