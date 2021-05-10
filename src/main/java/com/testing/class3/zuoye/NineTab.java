package com.testing.class3.zuoye;

/**
 * @Classname NineTab
 * @Description 类型说明
 * @Date 2021/4/15 9:14
 * @Created by cy
 */
public class NineTab {
    public static void main(String[] args) {
        System.out.println("-----------------用For-While实现九九乘法表--------------------");
        ForWhileToNine();
        System.out.println("-----------------用For-doWhile实现九九乘法表-------------------");
        ForDOWhileToNine();

    }

    //用For-While实现九九乘法表
    public static void ForWhileToNine() {
        int i = 1;
        for (; i <= 9; i++) {
            int j = 1;
            while (j <= i) {
                int res = i * j;
                System.out.print(i + "*" + j + "=" + res + "\t");
                j++;
            }
            //换行
            System.out.println("");
        }

    }
    //用For-doWhile实现九九乘法表
    public static void ForDOWhileToNine() {
        int i = 1;
        for (; i <= 9; i++) {
            int j = 1;
            do{
                int res = i * j;
                System.out.print(i + "*" + j + "=" + res + "\t");
                j++;
            }while(j<=i);
            //换行
            System.out.println("");
        }

    }
}
