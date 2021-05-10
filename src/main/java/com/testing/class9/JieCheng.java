package com.testing.class9;

/**
 * @Classname JieCheng
 * @Description 类型说明
 * @Date 2021/4/28 20:21
 * @Created by 特斯汀Roy
 */
public class JieCheng {

    public static void main(String[] args) {

        System.out.println(jiecheng(6));

    }

    public static int jiecheng(int n){
        int result=0;
        //递归算法：
        if(n<0){
            return -1;
        }
        //当n=1的时候，n!就等于1.
        //退出递归的条件。
        if(n==1){
            result=1;
        }
        //否则
        else{
            result=n*jiecheng(n-1);
        }
        return result;
    }


}
