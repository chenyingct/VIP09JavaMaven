package com.testing.class4;

/**
 * @Classname ZhishuTest
 * @Description 类型说明
 * @Date 2021/4/16 20:11
 * @Created by 特斯汀Roy
 */
public class ZhishuTest {
    public static void main(String[] args) {
        //1、循环遍历从1到100的数
        for(int num=2;num<=100;num++)
        //2、每一个数n，尝试从2到num-1的每个数与它相除，如果没有能够整除它的，就是质数。
            //2到num-1中间 ，没有整除它的数
        {
            //每次针对num找质数，都用一个i来进行相除。
            int i=2;
            //退出循环：两种条件： 1、找到了除数退出 i=除数
            // 2、一直到num-1也没有找到，不满足i<num的条件 i=num
            for(;i<=Math.sqrt(num);i++){
                //求余数，num%i==0，就表示能整除
                if(num%i==0){
                    //找到了整除的数了，就跳出循环。
                    break;
                }
            }
            //如果最后没有找到整除的数，则这个数num是一个质数
            //如果最后i的值是num，则这个数是质数，如果不是num则不是质数。
            if(i>Math.sqrt(num)){
                System.out.print(num+" ");
            }
        }


    }


}
