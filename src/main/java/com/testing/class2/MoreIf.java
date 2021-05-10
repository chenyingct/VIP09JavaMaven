package com.testing.class2;

import java.util.Scanner;

/**
 * @Classname MoreIf
 * @Description 类型说明
 * @Date 2021/4/13 16:58
 * @Created by cy
 */
public class MoreIf {
    public static void main(String[] args) {
        System.out.println("请输入人数：");
        Scanner cy = new Scanner(System.in);
        //读取下一个输入的数字
        int people = Integer.parseInt(cy.nextLine());
        System.out.println("输入一个天气：");
        String weather = cy.nextLine();
        cy.close();
        if (weather.contains("晴天")) {
            if (people > 10) {
                System.out.println("踢足球去");
            } else if (people <= 10 && people > 5) {
                System.out.println("打篮球去");
            } else if (people == 8) {
                System.out.println("两桌麻将");
            } else {
                System.out.println("看电视");
            }
        } else {
            System.out.println("下雨了");
        }
        int x = people>4 ? 1:2;
        System.out.println(x);

    }
}
