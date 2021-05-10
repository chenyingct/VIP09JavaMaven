package com.testing.class5;

/**
 * @Classname MultiArray
 * @Description 类型说明
 * @Date 2021/4/19 21:31
 * @Created by 特斯汀Roy
 */
public class MultiArray {

    public static void main(String[] args) {

            //二维数组：定义的时候，第一个括号是存储的一维数组的数量，第二个括号是一维数组中存储的元素的个数。
            String[][] doublesArr=new String[2][3];
            //修改第一个抽屉的第二个格子的内容。
            doublesArr[0][1]="roy";

            //二维数组，就可以看做是一个表格。
            for(String[] sArr:doublesArr){
//                System.out.println("二维数组存储的元素是一维数组："+sArr);
                //内层循环，获取每一个一维数组中的元素
                for(String s:sArr){
                    System.out.print("内容是"+s+"\t");
                }
                System.out.println();
            }

    }

}
