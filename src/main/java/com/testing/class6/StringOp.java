package com.testing.class6;

/**
 * @Classname StringOp
 * @Description 类型说明
 * @Date 2021/4/21 21:58
 * @Created by 特斯汀Roy
 */
public class StringOp {
    public static void main(String[] args) {
        String s="   Roy is Cute";

        boolean roy = s.contains("roy");
        //equals方法调用的时候，最好把不可能为null的写在前面。
        boolean equals = "roy".equals(s);

        System.out.println(roy);
        System.out.println(equals);

        //转换小写,不会改变原本字符串的值。
        String s1 = s.toLowerCase();
        System.out.println(s1);

        //replace也不会改变原本字符串的值。
        String replace = s1.replace("roy", "will");
        System.out.println("替换转成小写的s1之后的结果"+replace);
        System.out.println("原始的字符串"+s);
        System.out.println("转换小写之后的字符串"+s1);

        //去掉首尾空格，通常用于判断一个字符串到底是不是""，空字符串，就是长度为0的字符串。
        // 和null不是一个东西。
        String trim = s1.trim();
        System.out.println("去掉空格"+trim);

        //trim之后只会剩下"".
        String blank="       ";
        System.out.println("".equals(blank));
        System.out.println("".equals(blank.trim()));

        //字符串的长度，length()是个方法。
        System.out.println(blank.length());
        System.out.println(blank.trim().length());

        String substring = s.substring(4);
        //规则是[4,8) 左闭右开，不包含最后一个下标的字符
        String sub2=s.substring(4,s.length()-1);
        System.out.println("从第4位开始的子串是"+substring);
        System.out.println("4到8位的子串是"+sub2);


    }

}
