package com.testing.class5;

import java.util.Arrays;

/**
 * @Classname StringArray
 * @Description 类型说明
 * @Date 2021/4/19 21:03
 * @Created by 特斯汀Roy
 */
public class StringArray {

    public static void main(String[] args) {

        //数组的增删改查操作：
        String[] strArr=new String[]{"roy","is","a","cool","guy"};
        String[] strArr1=new String[]{"roy","is","cool","guy"};
        //唯一的改变长度方式，是创造一个新的数组出来。
        strArr=new String[]{"will","is","handsome"};

        //增，由于数组的长度已经在初始化的时候固定了，所以没有增操作。
        //删？ 由于数组的长度已经在初始化的时候固定了，所以没有删操作。

        //注意，将值变成null和0，跟删除一个元素是两回事。
        //改：数组是一个有顺序的符合数据类型。可以通过顺序来进行取值。
        //通过数组下标来进行取值操作。 数组的下标就相当于元素的编号，从0开始。最大下标是length-1.
        strArr[1]="was";
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr);

        //遍历修改：
        //X 1、foreach操作 ，只能进行调用，不能修改数组中的原值。
        //2、for 循环 通过下标取值进行修改。
        for(int index=0;index<strArr.length;index++){
            strArr[index]="roy";
        }
        System.out.println(Arrays.toString(strArr));

        System.out.println("----------------值遍历--------------");
        //查： 遍历
        //1、foreach循环 ，只能把每个元素都遍历一遍
        for (String s : strArr1) {
            System.out.println(s);
        }
        System.out.println("--------------下标遍历--------------");
        //2、for循环可以根据需求，按下标控制。
        //如果数组下标超出了界限，则会出现数组下标越界的异常。
        for(int index=strArr1.length-1;index>0;index-=2){
            System.out.println(strArr1[index]);
        }






    }


}
