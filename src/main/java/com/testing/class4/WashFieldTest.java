package com.testing.class4;

import com.testing.class3.WhileTest;

/**
 * @Classname WashFieldTest
 * @Description 类型说明
 * @Date 2021/4/16 21:41
 * @Created by 特斯汀Roy
 */
public class WashFieldTest {
    public static void main(String[] args) {
//        System.out.println("静态变量height的值是："+WashMachine.height);

        //调用其它类中的静态方法
//        WhileTest.main(null);

        //实例变量需要在实例化对象后使用。
        WashMachine machine=new WashMachine();
        System.out.println("machine的高度是"+machine.getHeight());
        //通过对象.变量 调用对象的实例变量
        machine.height=3;
        System.out.println("machine的高度是"+machine.height);
        //实现set与get方法，对对象的实例变量进行修改
        machine.setHeight(55);
        System.out.println("machine的高度是"+machine.getHeight());

        //不同的实例之间的实例变量，互不影响
        WashMachine roy=new WashMachine();
        System.out.println("roy的高度是"+roy.height);

        //通过类名调用常量和静态变量
        System.out.println(WashMachine.KIND);
        System.out.println(WashMachine.func);

        System.out.println("machine的静态变量func是"+machine.func);
        System.out.println("roy的静态变量func是"+roy.func);

        System.out.println("-------------改变静态变量的值之后------------------");
        //不允许改变常量的值
//        WashMachine.KIND="电冰箱";
        //改变静态变量的值
        WashMachine.func="衣物除尘";
        //改变静态变量，所有实例的静态变量值都会发生变化。
        System.out.println("machine的静态变量func是"+machine.func);
        System.out.println("roy的静态变量func是"+roy.func);



    }
}
