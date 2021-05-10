package com.testing.class2.zuoye;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * @Classname FingerGuessing
 * @Description 类型说明
 * @Date 2021/4/13 21:44
 * @Created by cy
 */
public class FingerGuessing {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int n = 1;
        String[] sz = {"石头", "剪刀", "布"};
        System.out.println("规则可从1、石头，2、剪刀，3、布中选一出拳；剪刀胜布，石头胜剪刀，布胜石头");
        System.out.println("下面请选择对手1、释小龙2、李连杰3、成龙");
        //输入对手
        Scanner sc = new Scanner(System.in);
        String opponent = sc.nextLine();
        System.out.println("-----------------游戏开始--------------");

        do {
            System.out.println("~~~~~~~~~~~~第" + n + "局~~~~~~~~~~~~~");
            System.out.print("您请出拳:");
            //开始出拳
            String finger = sc.nextLine();
            //机器出拳
            System.out.print(opponent + "请出拳：");
            Random rd = new Random();
            int oppInt = rd.nextInt(2);
            System.out.println(sz[oppInt]);

            if (finger.equals(sz[oppInt])) {
                System.out.println("此局为平局");
            } else {
                if ("石头".equals(finger)) {
                    if (("剪刀").equals(sz[oppInt])) {
                        System.out.println("此局为您胜");
                        i++;
                    } else {
                        System.out.println("此局为" + opponent + "胜");
                        j++;
                    }
                } else if (("剪刀").equals(finger)) {
                    if (("布").equals(sz[oppInt])) {
                        System.out.println("此局为您胜");
                        i++;
                    } else {
                        System.out.println("此局为" + opponent + "胜");
                        j++;
                    }
                } else {
                    if (("石头").equals(sz[oppInt])) {
                        System.out.println("此局为您胜");
                        i++;
                    } else {
                        System.out.println("此局为" + opponent + "胜");
                        j++;
                    }
                }
            }
            if (i == 2) {
                System.out.println("-----------------您赢了！！！--------------");
                System.out.println("-----------------游戏结束-----------------");
            } else if (j == 2) {
                System.out.println("-----------------" + opponent + "赢了！！！---------------");
                System.out.println("-----------------游戏结束-----------------");
            }
            n++;
        } while (j <= 1 && i <= 1);
    }
}
