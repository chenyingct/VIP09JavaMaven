package com.testing.class5;


import java.util.Arrays;

/**
 * @Classname IntArrayIniTest
 * @Description 类型说明
 * @Date 2021/4/19 20:44
 * @Created by 特斯汀Roy
 */
public class IntArrayIniTest {


    public static void main(String[] args) {
        //数组初始化的同时完成元素的赋值操作
        //相当于定义了一个长度为0的空数组。
        int[] intArr=new int[]{};
        System.out.println(intArr);

        //定义一个有初值的数组。
        //将元素的值写在大括号中，用逗号进行分割。
        int[] intArrIni=new int[]{11,12,15,18,33,29};
        //简化写法。
        int[] intArrIniSimple={11,12,15,18,33,29};

        //用foreach进行输出
        for (int i : intArrIni) {
            System.out.println(i);
        }

        //通过类名直接调用Arrays类中的静态方法toString.
        System.out.println(Arrays.toString(intArrIniSimple));
        System.out.println(Arrays.toString(intArr));

        Arrays.sort(intArrIniSimple);
        System.out.println(Arrays.toString(intArrIniSimple));



    }

}
