package com.testing.class8.homework;

import java.util.Arrays;

/**
 * @Classname BubbleSort
 * @Description 类型说明
 * @Date 2021/4/27 22:04
 * @Created by cy
 */
public class Sort {
    public static void main(String[] args) {
        int[] a = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int[] b = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int[] c= {2,5,1,6};
        System.out.println("排序前输出:"+Arrays.toString(a));
        bubbleSort(a);
        System.out.println("冒泡排序后输出:"+Arrays.toString(a));
        System.out.println("选择排序前:"+Arrays.toString(b));
        selectSort(b);
        System.out.println("选择排序:"+Arrays.toString(b));

    }

    /*
     * 第一轮：a[length-1]和a[length-2]........a[1]和a[0] length-1
     * 第二轮：a[length-1]和a[length-2].........a[2]和a[1] length-1-1
     * ........
     * 第n轮：a[length-n]和a[length-n-1].........a[n]和a[n-1] length-n
     * 第length-1轮：a[length-1]和a[length-2]  1
     * */
    //冒泡排序
    public static int[] bubbleSort(int[] a) {
        for (int lun = 1; lun <= a.length - 1; lun++) {
            for (int i = a.length - 1; i >=lun; i--) {

                if (a[i-1]<a[i]) {
                    int temp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = temp;
                }

            }
            System.out.println("第"+lun+"轮："+Arrays.toString(a));
        }
        return a;
    }

    public static int[] selectSort(int[] a){
        for (int lun = 1; lun <= a.length - 1; lun++) {
            int minIndex = a.length - lun;
            int min = a[a.length - lun];
            for (int i = a.length - lun; i >0; i--) {
                if (a[i-1]<min) {
                    minIndex = i-1;
                    min = a[i-1];
                }
               // System.out.println("minIndex:"+minIndex);
                //System.out.println("min:"+min);
            }
            if(a[a.length - lun] > min){
                a[minIndex] = a[a.length - lun];
                a[a.length - lun] = min;

            }
            System.out.println("第"+lun+"轮："+Arrays.toString(a));
        }
        return a;
    }
}
