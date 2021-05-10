package com.testing.class4;

/**
 * @Classname ConstructorTest
 * @Description 类型说明
 * @Date 2021/4/16 22:35
 * @Created by 特斯汀Roy
 */
public class ConstructorTest {
    public static void main(String[] args) {
        WashMachine mac=new WashMachine();
        WashMachine meidi=new WashMachine("美的");
        System.out.println("洗衣机的品牌是"+meidi.getBrand());
    }
}
