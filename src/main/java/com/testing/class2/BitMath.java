package com.testing.class2;

/**
 * @Classname BitMath
 * @Description 类型说明
 * @Date 2021/4/13 13:27
 * @Created by cy
 */
public class BitMath {
    public static void main(String[] args) {
        int a = 37;
        int b = 87;
        int andR = a & b;
        int orR = a | b;
        int nsR = a ^ b;
        System.out.println(andR);
        System.out.println(orR);
        System.out.println(nsR);

        int anr = a ^ nsR;
        int bnr = b ^ nsR;
        System.out.println(anr);
        System.out.println(bnr);

        byte lefta2=(byte)(a<<2);
        int rightb2=b>>2;
        System.out.println(lefta2);
        System.out.println(rightb2);
    }
}
