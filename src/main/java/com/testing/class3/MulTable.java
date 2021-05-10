package com.testing.class3;

/**
 * @Classname MulTable
 * @Description 类型说明
 * @Date 2021/4/14 22:09
 * @Created by 特斯汀Roy
 */
public class MulTable {
    public static void main(String[] args) {
        //输出操作：
        //1、一共输出9行内容
        for (int line=1;line<=9;line++) {
            //2、每一行输出9次结果
            //输出内容：第1行：  1*1  2*1  3*1 4*1
            for (int column = 1; column <= 9; column++) {
                //去掉一行对角线？
                //每一行输出的时候，如果行等于列，就不输出。
                if(column==line||column+line==10){
                    System.out.print("\t"+"\t");
                }else {
                    int result = column * line;
                    System.out.print(column + "*" + line + "=" + result + "\t");
                }
            }
            //换行
            System.out.println();
        }
        //第2行：
//        for(int column=1;column<=9;column++){
//            int result= column*2;
//            System.out.print(column+"*2="+result+" ");
//        }
//        System.out.println();
        //第3行：
//        for(int column=1;column<=9;column++){
//            int result= column*3;
//            System.out.print(column+"*3="+result+" ");
//        }
    }


}
