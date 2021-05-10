package com.testing.class5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Classname ListTest
 * @Description 类型说明
 * @Date 2021/4/19 22:31
 * @Created by 特斯汀Roy
 */
public class ListTest {
    public static void main(String[] args) {
        //list是用得最多的线性数据结构。绝大多数情况用ArrayList。
        //list是有序的。并且数据可以重复。
        List<String> strings=new ArrayList<String>();

        //增
        strings.add("roy");
        strings.add("is");
        strings.add("cute");
        strings.add("cute");
        strings.add("will");
        strings.add("is");
        strings.add("handsome");


        //删
        //通过下标删除。
        strings.remove(0);
        //list的长度由size()方法获取，是通过返回值return出来的。
        strings.remove(strings.size()-1);
        //remove会移除掉第一个元素。
        strings.remove("cute");

        //改
        strings.set(0,"土匪");

        //查
        //1、list有顺序，所以可以通过下标来进行取值。
        String will = strings.get(2);
        System.out.println(will);
        //下标依然从0开始
        for(int i=0;i<=strings.size()-1;i++){

            System.out.println(strings.get(i));
        }

        //2、foreach
        for (String string : strings) {
            System.out.println(string);
        }

        //3、iterator遍历。
        Iterator<String> roy=strings.iterator();
        while(roy.hasNext()){
            String next = roy.next();
            System.out.println(next);
        }

        //会出现死循环，就相当于每次抽奖都重新把原封不动的奖箱，拿给一个新的人去进行抽奖。
        while(strings.iterator().hasNext()){
            String next = strings.iterator().next();
            System.out.println(next);
        }


        System.out.println(strings);



    }

}
