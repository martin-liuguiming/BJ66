package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/29 16:50
 ***************************/
public class CollectionUtils {

    public static <E> void arrPrintln(E[] arr) {
        for (E e : arr) {
            System.out.println(e);
        }
    }

    public static void collectionPrintln(Collection<?> collection) {
        for (Object str:
             collection) {
            System.out.println(str);
        }
    }


    public static void main(String[] args) {

        List<Integer> listInteger =new ArrayList<Integer>();
        List<String> listString =new ArrayList<String>();
        collectionPrintln(listInteger);
        collectionPrintln(listString);

        String[] strings = {"yang", "kun", "lin"};
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7};
        arrPrintln(strings);
        arrPrintln(integers);
    }

}
