package com.testing.class5.homework;

import java.util.Arrays;

/**
 * @Classname NineTab
 * @Description 类型说明
 * @Date 2021/4/20 20:02
 * @Created by cy
 */
public class NineTab {
    public static void main(String[] args) {
        int[][] result = nineTabs();
        //循环遍历九九乘法表的乘积
        System.out.println("++++++++++++++++++++++循环输出九九乘法表乘积+++++++++++++++");
        for (int[] arr : result) {
            for (int arrOut : arr) {
                System.out.print(arrOut + "\t");
            }
            System.out.println("");
        }

    }

    public static int[][] nineTabs() {
        //定义二维数组
        int[][] product = new int[9][9];
        //实现九九乘法表
        System.out.println("++++++++++++++九九乘法表++++++++++++++++++");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int num = i * j;
                System.out.print(i + "*" + j + "=" + num + "\t");
                product[i - 1][j - 1] = num;
            }
            System.out.println("");
        }
        return product;
    }
}
