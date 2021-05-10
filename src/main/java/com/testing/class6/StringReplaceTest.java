package com.testing.class6;

/**
 * @Classname StringReplaceTest
 * @Description 类型说明
 * @Date 2021/4/21 22:14
 * @Created by 特斯汀Roy
 */
public class StringReplaceTest {

    public static void main(String[] args) {
        String s="[1, 2, 3, 5, 4, 6, 9, 7, 8, 0]";
        s=s.replace("3","x");
        System.out.println(s);
        s=s.replace("4", "x");
        System.out.println(s);

        //替换34567 为x？
        for(int i=3;i<8;i++){
            //从3到7，依次进行替换。
            //将替换后的结果重新赋值给s。
            s=s.replace(String.valueOf(i),"x");
        }
        System.out.println(s);

    }


}
