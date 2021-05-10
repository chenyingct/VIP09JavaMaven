package com.testing.class6;

/**
 * @Classname UseMainArgs
 * @Description 类型说明
 * @Date 2021/4/21 21:34
 * @Created by 特斯汀Roy
 */
public class UseMainArgs {
    public static void main(String[] args) {
        MainArgsTest.main(new String[]{"roy","fat"});
//        MainArgsTest.main(null);
        outputArr(new int[]{1,2,3});

    }

    public static void outputArr(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
