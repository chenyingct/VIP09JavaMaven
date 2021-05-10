package com.testing.class6.homeWork;

/**
 * @Classname MainArgs
 * @Description 类型说明
 * @Date 2021/4/22 11:37
 * @Created by cy
 */
public class MainArgs {
    public static void main(String[] args) {
        if (args.length >= 2) {
            try {
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                compareNum(num1,  num2);
            } catch (NumberFormatException e) {
                String error= e.toString();
                System.out.println("输出异常："+ error);;
                System.out.println("请输入正确数");
            }

        } else {
            System.out.println("输入数组中至少有两个数据。");
        }

    }

    public static void compareNum(int num1, int num2) {
        if (num1 > num2) {
            System.out.printf("%s大于%s", num1, num2);
        } else if (num1 < num2) {
            System.out.printf("%s小于%s", num1, num2);
        } else {
            System.out.printf("%s等于%s", num1, num2);
        }
    }
}
