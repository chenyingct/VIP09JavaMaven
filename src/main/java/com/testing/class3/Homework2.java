package com.testing.class3;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
//        int x=9;
//        System.out.println("----------------先与后或");
//        System.out.println("x=" + x + "时：");
//        boolean result = x > 5 && x << 8 - 7 > 20 || !(x++ < 15);
//        System.out.print("x的值是" + x);
//        System.out.println("\t运算结果是" + result);
//
//        System.out.println("----------------先或后与");
//        x=9;
//        System.out.println("x=" + x + "时：");
//        boolean result1 = x > 5 || x << 8 - 7 > 20 && !(x++ < 15);
//        System.out.print("x的值是" + x);
//        System.out.println("\t运算结果是" + result1);


        System.out.println("----------------调整顺序");
        int x=15;
        System.out.println("x=" + x + "时：");
//            false||  (false&&) =》 false||false =>false;
        //x=11:   false ||  false  =》false
        //x=14:   false ||  false => false
        //x=15:   false ||  true && true => false || true =>true
        boolean result2 = x < 5 || !(x++ < 15) && x << 8 - 7 > 20;
        System.out.print("x的值是" + x);
        System.out.println("\t运算结果是" + result2);
    }
}
