package com.testing.class8;

import java.util.Arrays;

/**
 * @Classname SelectionSort
 * @Description 类型说明
 * @Date 2021/4/26 22:04
 * @Created by 特斯汀Roy
 */
public class SelectionSort {

    public static void main(String[] args) {
        //传递乱序的数组给sort方法使用
        int[] a={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        System.out.println("排序之前：----------------------------");
        System.out.println(Arrays.toString(a));
        //sort方法内部改变了参数的值
        int[] bubblesort = selectionSort(a);
        System.out.println(Arrays.toString(bubblesort));
        //最终外部的数组a的值也变成了有序的
        System.out.println("排序之后：----------------------------");
        //输出a
        System.out.println(Arrays.toString(a));


        //外部变量int num
        int num=11;
        System.out.println("方法执行之前num的值：------------------");
        System.out.println(num);
        System.out.println("方法执行结果：------------------");
        //传递给plus方法进行使用，并且方法改变了num的值。
        System.out.println(plus(num));
        //执行之后外部变量值不变。
        System.out.println("方法执行之后num的值：------------------");
        System.out.println(num);
    }



    public static int plus(int a){
        a=a+13;
        return a;
    }

    public static int[] selectionSort(int[] a){
        //外层循环：
        //循环的轮次：
        int mini=0;
        int minindex=0;
        for(int lun=1;lun<=a.length-1;lun++){
            //每一轮做的事情：
            //			记录第lun个数a[lun-1]是最小，位置 lun-1.
            //			从第lun+1个数a[lun]开始进行比较，直到最后一个数a.length-1.找到最小值。
            //			最小值和a[lun-1]交换。
            mini=a[lun-1];
            minindex=lun-1;
            //比较
            for(int index=lun;index<=a.length-1;index++){
                //如果这个值比mini小，那么mini的值更新为当前index的值。
                if(a[index]<mini){
                    //最小值更新为当前位置的值
                    mini=a[index];
                    //最小值的位置更新为当前下标。
                    minindex=index;
                }
            }
            //判断一下当前第1个数是不是比最小值大
            if(mini<a[lun-1]){
                //如果大，就交换
                //由于已经存了a[minindex]的值为mini，所以不需要第3个变量来交换。
                a[minindex]=a[lun-1];
                a[lun-1]=mini;
            }
        }
        return a;
    }

}
