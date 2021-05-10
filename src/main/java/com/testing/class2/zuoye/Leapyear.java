package com.testing.class2.zuoye;

import java.util.Scanner;

/**
 * @Classname Leapyear
 * @Description 类型说明
 * @Date 2021/4/13 20:46
 * @Created by cy
 */
public class Leapyear {
    public static void main(String[] args) {
        Scanner yearSR = new Scanner(System.in);
        System.out.println("输入年份:");
        int year = yearSR.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "是闰年,二月有29天，一年366天");
        }else
        {
            System.out.println(year + "非闰年,二月有28天，一年365天");
        }

    }
}
