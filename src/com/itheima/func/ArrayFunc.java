package com.itheima.func;

/***************************
 *@Description
 *@Author yangkunlin
 *@Date 2023/3/26 14:44
 ***************************/
public class ArrayFunc {

    public static void main(String[] args) {
        // 定义一个数组
        String[] str = {"yang", "kun", "lin"};
        // 调用方法遍历数组
        arrForeach(str);
        // 调用方法获取数组的最大值
        int[] intArr = {1, 2, 4, 5};
        int max = getArrMax(intArr);
        System.out.println(max);

        // 调用方法遍历数组
        arrForeach(intArr);
    }

    /*
     * @Description
     * 对数值类型的数组进行遍历
     * @Param intArr
     * @Return
     * @Date 2023/3/26 15:11
     */
    private static void arrForeach(int[] intArr) {
        for (int i :
                intArr) {
            System.out.println(i);
        }
    }

    /*
     * @Description 这是一个求数组最大值的方法
     * @Param str int类型的数组
     * @Return {@link int}
     * @Date 2023/3/26 14:53
     */
    private static int getArrMax(int[] str) {
        int tmp = 0;
        for (int s : str) {
            if (tmp < s) {
                tmp = s;
            }
        }
        return tmp;
    }

    /*
     * @Description
     * 对字符串类型的数组进行遍历
     * @Param str
     * @Return
     * @Date 2023/3/26 15:09
     */
    private static void arrForeach(String[] str) {
        for (String s : str) {
            System.out.println(s);
        }
    }

}
