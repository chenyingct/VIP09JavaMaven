package com.testing.class5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Classname SetTest
 * @Description 类型说明
 * @Date 2021/4/19 21:50
 * @Created by 特斯汀Roy
 */
public class SetTest {
    public static void main(String[] args) {
        //数据结构只能存储某一种类型的数据。
        //但是最开始，不知道存储的是什么类型，可以是任何类型。
        //泛型就用来定义 存储的类型，类似于参数的形式来进行设置。
        //Set进行实例化的时候，用new HashSet
        // 相当于 箱子<字符串> 字符串箱子 =new  塑料箱子<字符串>
        //set是无序的。并且元素的值是不重复的。经常用这个特性来做算法题。
        Set<String> stringSet = new HashSet<String>();
        //增
        stringSet.add("roy");
        stringSet.add("is");
        stringSet.add("cute");
        //set是无序的。
        stringSet.add("cute");

        //删
        //删除所有元素
//        stringSet.clear();
        //删除一个元素
        stringSet.remove("cute");

        //改，由于set是无序的，所以无法进行某个元素的修改，而且也没有意义。
        //删掉原本的，加个新的，就是改。
        stringSet.add("fat");

        //查
        //由于set没有顺序，所以就没有下标，不能通过下标遍历。
        //foreach可以进行遍历。
        for (String s : stringSet) {
            System.out.println(s + "ww");
        }

        //Iterator 迭代器
        Iterator<String> iterator = stringSet.iterator();
        //判断是否有下一个元素
        while (iterator.hasNext()) {
            //如果有，就去取下一个
            String next = iterator.next();
            //每一次next向下取一个。
            //由于例子中只有3个元素，所以在进行第二次取值操作的时候，依然需要进行判断。
            if (iterator.hasNext()) {
                String second = iterator.next();
            }

            System.out.println("取出来的值是" + next);
        }


        //直接通过sout可以输出set中的内容。而不是类型@引用地址。
        //set中的特性：存储是无序的。
        System.out.println(stringSet.toString());
    }
}
