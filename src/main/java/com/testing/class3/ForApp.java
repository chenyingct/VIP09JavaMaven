package com.testing.class3;

/**
 * @Classname ForApp
 * @Description 类型说明
 * @Date 2021/4/14 21:27
 * @Created by 特斯汀Roy
 */
public class ForApp {

    public static void main(String[] args) {
        //从1到100相加，什么时候会得到结果大于3000？
        int result=0;
        int num=1;
        for (;num<=100;num++){
            result+=num;
            if(result>3000){
                break;
            }
        }
        System.out.println("超过3000的时候，数字是"+num);



        //从1到100所有奇数相加的结果：
//        int result=0;
//        int num=1;
//        for(;num<=100;num+=2){
//            //每一次用上一次得到的和，和下一个数相加，得到下次的和。
////            if(num%2==1) {
//                result += num;
////            }
//        }
//        System.out.println(result);
//
//        System.out.println("最后一次计算的时候num的值是"+(num-2));


    }
}
