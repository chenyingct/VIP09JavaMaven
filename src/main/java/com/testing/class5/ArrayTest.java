package com.testing.class5;

import com.testing.class4.WashMachine;

import javax.sound.midi.Soundbank;

/**
 * @Classname ArrayTest
 * @Description 类型说明
 * @Date 2021/4/19 20:25
 * @Created by 特斯汀Roy
 */
public class ArrayTest {
    public static void main(String[] args) {
        //CRUD  增删改查。
        //创建一个数组的过程： 数组的长度在定义的时候就被固定了。
        //只定义长度不赋初值，默认值0。
        int[] intArr = new int[5];

        //数组可以是任何类型的数组。
        Dog[] dogs=new Dog[3];

        //查询操作：只做输出。
        //直接输出，输出的是对象的格式和它的内存引用（地址编号）[I@74a14482
        System.out.println(intArr);
        //输出一个对象，输出的结果是，对象类型@内存引用地址
        WashMachine mac=new WashMachine("海尔");
        System.out.println(mac.toString());

        System.out.println("尝试在foreach遍历过程中修改元素的值");
        //增强型foreach循环，针对于数据结构，将里面的每一个元素都遍历一次。
        //foreach循环操作中，取出来的元素发生改变，不会影响数组中原本的值。
        for (int i : intArr) {
            //遍历每一个intArr中的int元素i，并且赋值为1.
            i=3;
            System.out.println(i);
        }

        System.out.println("-------------------尝试修改之后元素的值---------------------");
        //常使用foreach改变i的值之后的值
        for(int each:intArr)
        {
            //输出每一个数字，没有赋值，默认值为0.
            System.out.println(each);
        }



    }


}
