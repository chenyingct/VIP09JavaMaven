package com.testing.class8;

import java.util.Arrays;

/**
 * @Classname BubbleSort
 * @Description 类型说明
 * @Date 2021/4/26 21:20
 * @Created by 特斯汀Roy
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        int[] bubblesort = bubblesort(a);
        System.out.println(Arrays.toString(bubblesort));
    }

    public static int[] bubblesort(int[] a){
        //外层循环：
            //轮次
            for(int lun=1;lun<=a.length-1;lun++){
                //比较的下标的循环：
                for(int index=0;index<=a.length-lun;index++){
                    //比较相邻两个数的大小，如果前一个数大一些，就进行交换。
                    if(a[index]>a[index+1]){
                        //进行交换
                        int tmp=a[index];
                        a[index]=a[index+1];
                        a[index+1]=tmp;
                    }
                }
                System.out.println("第"+lun+"轮排序之后的结果："+Arrays.toString(a));
            }
        return a;
    }


}
