package com.testing.class9.homework;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Classname FibOutByArr
 * @Description 类型说明
 * @Date 2021/4/29 11:02
 * @Created by cy
 */
public class FibOutByArr {
    public static void main(String[] args) {
        System.out.println("请输入数据:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<0){
            System.out.println("请输入大于等于0得数");
        }else {
            int[] a = new int[n];
            for (int i = 0; i <=n - 1; i++) {
                a[i] = fibArr(i);
            }
            System.out.println("输出斐波那契数列:" + Arrays.toString(a));
        }
        System.out.println("通过数组输出斐波那契数列:"+Arrays.toString(fibByArr(n)));
    }

    public static int fibArr(int n){
        int num = 0;
        if(n <=1){
            num=1;
        }else
        {
            num = fibArr(n-1)+fibArr(n-2);
        }
        return  num;
    }

    public static int[] fibByArr(int n){
        int[] numArr = new int[n];
        for (int i =0;i<=n-1;i++){
            if(i<=1){
                numArr[i]=1;
            }else{
               numArr[i]=numArr[i-1]+numArr[i-2];
            }
        }
        return numArr;
    }
}
