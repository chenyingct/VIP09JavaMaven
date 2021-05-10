package com.testing.class7;

/**
 * @Classname StringBuilderTest
 * @Description 类型说明
 * @Date 2021/4/23 20:22
 * @Created by 特斯汀Roy
 */
public class StringBuilderTest {

    public static void main(String[] args) {
        String s="1234";
        s="roy";

        StringBuffer sb=new StringBuffer();
        sb.append("roy");
        sb.append("isasdaskdfjl;asjdf;aksd");
        sb.delete(4,15);
        System.out.println("容量是"+sb.capacity());
        System.out.println(sb);
        String roy=sb.toString();
        System.out.println(roy.length());

        StringBuilder builder=new StringBuilder(10);
        builder.append("royisdfasd");
        builder.insert(3,"will");
        builder.reverse();
        System.out.println(builder);
    }


}
