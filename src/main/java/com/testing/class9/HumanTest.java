package com.testing.class9;

/**
 * @Classname HumanTest
 * @Description 类型说明
 * @Date 2021/4/28 21:49
 * @Created by 特斯汀Roy
 */
public class HumanTest {

    public static void main(String[] args) {
        Human man=new Human();
        String ear = man.ear;
        System.out.println(ear);
        man.eating();
        man.eating("火锅");
        man.giveBirth("roy");
        man.useTools("手机");
        System.out.println(man.hair);
        System.out.println(man);


        Animal a=new Animal();
        System.out.println(a);

    }

}
