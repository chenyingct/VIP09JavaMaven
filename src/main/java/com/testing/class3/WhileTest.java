package com.testing.class3;

/**
 * @Classname WhileTest
 * @Description 类型说明
 * @Date 2021/4/14 21:39
 * @Created by 特斯汀Roy
 */
public class WhileTest {
    public static void main(String[] args) {
        int result=0;
        int num =101;
        while(num<=100){
            //反复执行的操作：
            result+=num;
            //让while循环有退出循环的可能性。
            num+=2;
            //局部变量
            int a=3;
        }
        System.out.println(result);
//        System.out.println(a);

        System.out.println("------------------------------------");
        //do while 语句和while的区别：
        //不管条件是否成立，都会先执行一次循环体中的操作。
        do{
            result+=num;
            //让while循环有退出循环的可能性。
            num+=2;
        }while(num<=100);
        System.out.println(result);

    }
}
