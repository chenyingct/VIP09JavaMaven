package com.testing.class2;

/**
 * @Classname SelTest
 * @Description 类型说明
 * @Date 2021/4/13 11:22
 * @Created by cy
 */
public class SelTest {
    public static void main(String[] args) {
        int a=3;
        int b=10;

        //取值： 3 +  5 + 11 = 19
        //算完： 4    5    11
        int x=a++ + ++a + ++b;
        System.out.println("----------第一个计算----------");
        System.out.println("第一次计算后a的值："+a);
        System.out.println("第一次计算后b的值："+b);
        //取值  6 +  6  +  11 = 23
        //算完  6    7     12
        int y=++a + a++ + b++;
        System.out.println(x);
        System.out.println(y);
        System.out.println("第二次计算后a的值："+a);
        System.out.println("第二次计算后b的值："+b);

        //取值：  19 * 2 + 21 * 2 + 23 * 2 + 21 * 21 =
        //算完：  20       21       22          21 22
        int z = x++ * 2 + ++x * 2 + y-- * 2 + --y * x++;
        System.out.println(z);
        System.out.println(y);
        System.out.println(x);


    }
}
