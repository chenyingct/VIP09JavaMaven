package com.testing.class9;

/**
 * @Classname FibArray
 * @Description 类型说明
 * @Date 2021/4/28 20:37
 * @Created by 特斯汀Roy
 */
public class FibArray {

    public static void main(String[] args) {

        System.out.println(fib(6));

    }

    //生多少个兔子
    public static int fib(int month){
        //第一个月和第二个月都只有一个兔子
        int result=0;
        //不用进行递归计算的条件：
        if(month<=2){
            result=1;
        }
        //其它情况下，需要进行递归处理。
        else{
            result=fib(month-1)+fib(month-2);
        }
        return result;



    }

}
