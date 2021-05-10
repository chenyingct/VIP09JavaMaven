package com.testing.class2.zuoye;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @Classname zuoye
 * @Description 类型说明
 * @Date 2021/4/13 14:03
 * @Created by cy
 */
public class zuoye {
    public static void main(String[] args) {
        /*
        * 给x赋值,计算如下表达式的结果,以及表达式运算完成后x的值,再通过代码验证。
           例如,分别计算 x=4,x=9, x=11,x=15时,表达式的结果,与x的值。

           那么x=4,x=9, x=11,x=15时,下面表达式以及x的结果是什么？
	       x>5||x<<8-7>20 && !(x++<15)

        * */
        int y = 0;
        int end = 0;//结束的次数
        int addc = 0;//再执行此次数
        System.out.println("1、x>5&& x<<8-7>20 || !(x++<15)");
        System.out.println("2、x>5||x<<8-7>20 && !(x++<15)");
        Scanner sc = new Scanner(System.in);
        do {
            int x = 0;
            try {
                System.out.print("请输入表达式数字编号:");
                y = sc.nextInt();
                if (y == 1 || y == 2) {
                    try {
                        System.out.print("请输入数字X:");
                        x = sc.nextInt();
                        boolean res = false;
                        switch (x) {
                            case 4:
                                if (y == 1) {
                                    System.out.println("稿纸演算:由于&&等级高于||,所以表达式拆分为 (x > 5 && x << 8 - 7 > 20)\n" +
                                            "和!(x++ < 15),先计算||左边的表达式,左边的表达式又拆分为x>5和x<<8-7>20,\n" +
                                            "当x=4时,4>5造成&&短路,得到左边=false,再计算||右边的,x先取值再+1,!(4<15)=false,\n" +
                                            "最后false||false=false,运算后x=5");
                                } else {
                                    System.out.println("稿纸演算:由于&&等级高于||,所以表达式拆分为 x > 5和x<<8-7>20 && !(x++<15)\n" +
                                            ",先计算||左边的表达式,当x=4时,4>5=false,得到左边=false,\n" +
                                            "再计算||右边的,表达式才分为x<<8-7>20和!(x++<15),\n" +
                                            "x<<8-7>20 = x<<1>20 =4*2>20 = false,&&左边表达式短路,||右边=false\n" +
                                            "最后false||false=false,运算后x=4");
                                }
                                break;
                            case 9:
                                if (y == 1) {
                                    System.out.println("稿纸演算:由于&&等级高于||,所以表达式拆分为 (x > 5 && x << 8 - 7 > 20)\n" +
                                            "和!(x++ < 15),先计算||左边的表达式,左边的表达式又拆分为x>5和x<<8-7>20,\n" +
                                            "当x=9时,&&左边为9>5=true,&&右边为先算8-7=1,x<<1 = 9x2 = 18>20=false,\n" +
                                            "再计算||右边的,x先取值,!(9<15)=false,\n" +
                                            "最后false||false=false,运算后x=10");
                                } else {
                                    System.out.println("稿纸演算:由于&&等级高于||,所以表达式拆分为 x > 5和x<<8-7>20 && !(x++<15)\n" +
                                            ",先计算||左边的表达式,当x=9时,9>5=true,得到左边=true,||左边的表达式短路\n" +
                                            "最后true,运算后x=11");
                                }
                                break;
                            case 11:
                                if (y == 1) {
                                    System.out.println("稿纸演算:由于&&等级高于||,所以表达式拆分为 (x > 5 && x << 8 - 7 > 20)\n" +
                                            "和!(x++ < 15),先计算||左边的表达式,左边的表达式又拆分为x>5和x<<8-7>20,\n" +
                                            "当x=11时,&&左边为11>5=true,&&右边为先算8-7=1,x<<1 = 11x2 = 22>20=true,\n" +
                                            "||的左边等式短路,||右边表达式不计算,\n" +
                                            "最后输出true,运算后x=11");
                                } else {
                                    System.out.println("稿纸演算:由于&&等级高于||,所以表达式拆分为 x > 5和x<<8-7>20 && !(x++<15)\n" +
                                            ",先计算||左边的表达式,当x=11时,11>5=true,得到左边=true,||左边的表达式短路\n" +
                                            "最后true,运算后x=11");
                                }
                                break;
                            case 15:
                                if (y == 1) {
                                    System.out.println("稿纸演算:由于&&等级高于||,所以表达式拆分为 (x > 5 && x << 8 - 7 > 20)\n" +
                                            "和!(x++ < 15),先计算||左边的表达式,左边的表达式又拆分为x>5和x<<8-7>20,\n" +
                                            "当x=11时,&&左边为15>5=true,&&右边为先算8-7=1,x<<1 = 15x2 = 30>20=true,\n" +
                                            "||的左边等式短路,||右边表达式不计算,\n" +
                                            "最后输出true,运算后x=15");
                                } else {
                                    System.out.println("稿纸演算:由于&&等级高于||,所以表达式拆分为 x > 5和x<<8-7>20 && !(x++<15)\n" +
                                            ",先计算||左边的表达式,当x=15时,15>5=true,得到左边=true,||左边的表达式短路\n" +
                                            "最后true,运算后x=15");
                                }
                                break;
                            default:
                                break;
                        }
                        if (y == 1) {
                            res = x > 5 && x << 8 - 7 > 20 || !(x++ < 15);
                            System.out.println("程序输出:x > 5 && x << 8 - 7 > 20 || !(x++ < 15)=" + res);
                            System.out.println("运算后x的值:" + x);

                        } else {
                            res = x > 5 || x << 8 - 7 > 20 && !(x++ < 15);
                            System.out.println("程序输出:x>5||x<<8-7>20 && !(x++<15)=" + res);
                            System.out.println("运算后x的值:" + x);
                        }
                        System.out.println("-------------------------------------------------------------");

                    } catch (Exception e) {
                        System.out.println("请输入数字");
                    }

                } else {
                    System.out.println("没有此表达式编号,请重输");
                }
            } catch (Exception e) {
                System.out.println("请输入数字");
            }
            end++;
            if (end == 8) {
                System.out.println("还需要添加几次,需要请输入数字，不需要请输入0");
                addc = sc.nextInt();
            }
        } while (end < (8 + addc));
    }
}
