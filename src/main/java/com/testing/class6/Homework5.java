package com.testing.class6;

import com.testing.class5.Dog;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Classname Homework5
 * @Description 类型说明
 * @Date 2021/4/21 20:00
 * @Created by 特斯汀Roy
 */
public class Homework5 {
    public static void main1(String[] args) {
        Set<String> stringSet =new HashSet<String>();
        stringSet.add("roy");
        //由于set中限制了泛型只能是string，也就是只能存储string类型的元素，所以不能add(1)
//        stringSet.add(1);
        Set<Integer> intset=new HashSet<Integer>();
        intset.add(1);
        //由于set中限制了泛型只能是Integer，也就是只能存储整数类型的元素，所以不能add("roy")
//        intset.add("roy");

        //如果要存储不同的类型，那么存储Object对象类型就能做到。
        Set<Object> objectSet=new HashSet<Object>();
        objectSet.add("roy");
        objectSet.add(1);
    }

    public static void main(String[] args) {
        //把99乘法表存储到二维数组里面。
        String[][] multiTable=new String[9][9];
        //不符合题意的写法，没有进行存储。
//        for(int i=1;i<=multiTable.length;i++){
//            //取二维数组中的第i个元素，也就是第i个一维数组
//            for(int j=1;j<=multiTable[i-1].length;j++){
//                System.out.print(i+"*"+j+"="+i*j+"\t");
//            }
//            System.out.println();
//        }
//        System.out.println(multiTable[1][2]);
        for(int i=1;i<=multiTable.length;i++){
            //取二维数组中的第i个元素，也就是第i个一维数组
            for(int j=1;j<=multiTable[i-1].length;j++){
                //对二维数组对应的位置进行赋值。
                String content=i+"*"+j+"="+i*j+"\t";
                multiTable[i-1][j-1]=content;
            }
        }
        System.out.println(multiTable[1][2]);

        //二维数组乘法表输出
        for (String[] strings : multiTable) {
            //每一个一维数组换一次行
            System.out.println();
            //遍历一维数组输出
            for (String string : strings) {
                System.out.print(string);
            }
        }

        Object[] oarr=new Object[]{"roy",1,new Dog()};
        System.out.println(Arrays.toString(oarr));


    }


}
