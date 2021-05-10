package com.testing.class7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Classname EagerMatch
 * @Description 类型说明
 * @Date 2021/4/23 22:02
 * @Created by 特斯汀Roy
 */
public class EagerMatch {
    public static void main(String[] args) {
        String s="<a>roy</a> <a>will</a>";
        //贪婪
        System.out.println("-----贪婪模式，匹配到最后，把所有的放一起。----");
        Pattern eager=Pattern.compile("<a>(.*)</a>");
        Matcher eagerM = eager.matcher(s);
        if(eagerM.find()){
            System.out.println("整体是"+eagerM.group(0));
            System.out.println("group1是第一个小括号里的内容"+eagerM.group(1));
        }

        System.out.println("-----------非贪婪模式，匹配到第一次成功匹配就停止--------------");
        //非贪婪
        Pattern unEager=Pattern.compile("<a>(.*?)</a>");
        Matcher unEagerM= unEager.matcher(s);
        //如果能匹配到多个，用循环进行匹配。
        while(unEagerM.find()){
            System.out.println("整体是"+unEagerM.group(0));
            System.out.println("group1是第一个小括号里的内容"+unEagerM.group(1));
        }



    }


}
