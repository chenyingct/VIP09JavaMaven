package com.testing.class9;

import java.util.Arrays;

/**
 * @Classname DescSort
 * @Description 类型说明
 * @Date 2021/4/28 20:02
 * @Created by 特斯汀Roy
 */
public class DescSort {

    public static void main(String[] args) {
        int[] a={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        int[] bubblesort = selectionSort(a);
        System.out.println(Arrays.toString(bubblesort));
    }

    //逆序遍历，降序排列
    public static int[] bubblesort(int[] a){
        //外层循环：
        //轮次
        for(int lun=1;lun<=a.length-1;lun++){
            //比较的下标的循环：
            for(int index=a.length-1;index>=lun;index--){
                //比较相邻两个数的大小，如果前一个数大一些，就进行交换。
                if(a[index]>a[index-1]){
                    //进行交换
                    int tmp=a[index];
                    a[index]=a[index-1];
                    a[index-1]=tmp;
                }
            }
            System.out.println("第"+lun+"轮排序之后的结果："+Arrays.toString(a));
        }
        return a;
    }



    //逆序遍历，降序排列
    //把最大的数放到最前面去。
    //也就是每次把找出来最大的数和a[lun-1]进行交换。
    public static int[] selectionSort(int[] a){
        //外层循环：
        //循环的轮次：
        int max=0;
        int maxindex=0;
        for(int lun=1;lun<=a.length-1;lun++){
            //每一轮做的事情：
            //			记录第lun个数a[lun-1]是最小，位置 lun-1.
            //			从第lun+1个数a[lun]开始进行比较，直到最后一个数a.length-1.找到最小值。
            //			最小值和a[lun-1]交换。
            max=a[lun-1];
            maxindex=lun-1;
            //比较
            for(int index=a.length-1;index>=lun;index--){
                //如果这个值比max大，那么maxindex的值更新为当前index的值。
                if(a[index]>max){
                    //最小值更新为当前位置的值
                    max=a[index];
                    //最小值的位置更新为当前下标。
                    maxindex=index;
                }
            }
            //判断一下当前第1个数是不是比最小值大
            if(max>a[lun-1]){
                //如果大，就交换
                //由于已经存了a[minindex]的值为mini，所以不需要第3个变量来交换。
                a[maxindex]=a[lun-1];
                a[lun-1]=max;
            }
        }
        return a;
    }


}
