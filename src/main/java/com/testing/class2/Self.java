package com.testing.class2;

/**
 * @Classname Self
 * @Description 类型说明
 * @Date 2021/4/13 10:49
 * @Created by cy
 */
public class Self {
    public static void main(String[] args) {
        int a=3;
        int b=10;
        //a++
        //a +=1; 等价于a=a+1;
        //后置增
        a++;
        System.out.println(a);
        //前自增
        ++a;
        System.out.println(a);
        //后自减
        b--;
        System.out.println(b);
        //前自减
        --b;
        System.out.println(b);
    }
}
