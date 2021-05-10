package com.testing.class9;

/**
 * @Classname Male
 * @Description 类型说明
 * @Date 2021/4/28 22:17
 * @Created by 特斯汀Roy
 */
public class Male extends Human{

    public Male(String name){
        super(name);
        System.out.println("是个男宝宝");
    }

    public static void main(String[] args) {
        Male roy=new Male("roy");
//        roy.giveBirth("roy");
//        System.out.println(roy.toString());
    }

}
