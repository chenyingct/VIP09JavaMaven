package com.testing.class3.zuoye;

/**
 * @Classname Prime
 * @Description 类型说明
 * @Date 2021/4/15 9:33
 * @Created by cy
 */
public class Prime {
    public static void main(String[] args) {
        for (int num=2;num<=100;num++){
            int i=2;
            for (;i<=num;i++){
                if(num%i==0) {
                    break;
                }
            }
            if(num == i) {
                System.out.print(num+"\t");
            }

        }

    }
}
