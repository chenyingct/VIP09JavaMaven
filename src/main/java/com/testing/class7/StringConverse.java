package com.testing.class7;

/**
 * @Classname StringConverse
 * @Description 类型说明
 * @Date 2021/4/23 20:04
 * @Created by 特斯汀Roy
 */
public class StringConverse {

    public static void main(String[] args) {
        System.out.println(converStr("r"));
    }
    /**
     * 输出反转字符串
     * @param origin 原始字符串
     * @return 反转结果。
     */
    public static  String converStr(String origin){
        //字符串的长度
        int length = origin.length();
        //交换的中位位置
        int mid =length/2-1;
        //String 转成 char[]
        char[] chars = origin.toCharArray();
        //循环进行交换
        for(int index=0;index<=mid;index++){
            //交换,需要用到一个中间变量。
            char temp=chars[length-1-index];
            chars[length-1-index]=chars[index];
            chars[index]=temp;
        }
        //将字符数组组合成一个新的字符串，返回结果。
        return new String(chars);



    }


}
