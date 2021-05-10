package com.testing.class4;

/**
 * @Classname NullPointerTest
 * @Description 类型说明
 * @Date 2021/4/16 21:08
 * @Created by 特斯汀Roy
 */
public class NullPointerTest {

    public static void main(String[] args) {
        String s=null;
//        boolean result= s.equals("内容");
        //减少出现空指针的可能，用常量字符串.equals(s)
        boolean result1="内容".equals(s);
        System.out.println("s的值是"+s);
    }
}
