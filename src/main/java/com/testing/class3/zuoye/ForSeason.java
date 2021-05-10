package com.testing.class3.zuoye;

import java.util.Scanner;

/**
 * @Classname ForSeason
 * @Description 类型说明
 * @Date 2021/4/15 10:18
 * @Created by cy
 */
public class ForSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String end = "y";
        while("y".equals(end)) {
            System.out.print("请输入月份对应的数字：");
            int month = sc.nextInt();
            switch (month) {
                case 3:
                case 4:
                case 5:
                    System.out.println(month + "月是春季！！！");
                    System.out.println("可以出去踏踏青！！！");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(month + "月是夏季！！！");
                    System.out.println("天气太热可以出避暑！！！");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(month + "月是秋季！！！");
                    System.out.println("正是养秋膘的好时节！！！");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println(month + "月是冬季！！！");
                    System.out.println("天虽然冷，但是雪景千万不能错过！！！");
                    break;
                default:
                    System.out.println("您输入的不在地球上认知节气内，请重新输入");
            }
            System.out.println("是否还要继续,请输入(y/n)");
            //用来取出nextInt丢在缓冲区中残留的空白符的。
            sc.nextLine();
            //获取当前输入的内容包括空白符
            end = sc.nextLine();
        }
    }
}
