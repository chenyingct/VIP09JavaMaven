package com.testing.class2;

/**
 * @Classname LogicTest
 * @Description 类型说明
 * @Date 2021/4/13 14:08
 * @Created by cy
 */
public class LogicTest {
    public static void main(String[] args) {
        int x=3;
        boolean z=x++ ==3;
        System.out.println(z);
        System.out.println(x);

        int a=5;
        int b=10;

        //boolean andDL = (a=11) == 10 &&(b=15)==15;
//        boolean andNODL = (a=11) == 10 &(b=15)==15;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(andNODL);

        boolean orDL = (a=10) == 10 ||(++b)==15;
        boolean orNODL = (a=10) == 10 |(++b)==15;
        System.out.println(a);
        System.out.println(b);
        System.out.println(orNODL);


    }
}
