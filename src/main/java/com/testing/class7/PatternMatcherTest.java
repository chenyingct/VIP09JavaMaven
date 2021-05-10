package com.testing.class7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Classname PatternMatcherTest
 * @Description 类型说明
 * @Date 2021/4/23 21:42
 * @Created by 特斯汀Roy
 */
public class PatternMatcherTest {
    public static void main(String[] args) {
        //场景：  从一串字符串中，按规则提取对应的内容
        //如下，传dg能取到东莞，传dl能取到 大连。
        String dg="<a target=\"_blank\" href=\"//www.51job.com/dongguan/\">东莞</a>";
        String dl= "<a target=\"_blank\" href=\"//www.51job.com/dalian/\">大连</a>";
        String kk= "<a target=\"_blank\" href=\"//www.51job.com/dalian/\"></a>";

        //制定规则，去查找对应的内容。  规则：  > 内容 </a>
        //写法：>(.*?)</a>
        Pattern city=Pattern.compile(">(.*?)</a>");
        //获取url 和 地名 规则：<.*href=(.*?)>(.*?)</a>
        Pattern cityandUrl= Pattern.compile("<.*href=(.*?)>(.*?)</a>");

        //匹配器对象
        Matcher dgm = cityandUrl.matcher(dg);
        //查找
        if(dgm.find()){
            //查找之后得到group()来返回结果。
            System.out.println("完整的结果是"+dgm.group(0));
            System.out.println("只包含想要内容的结果是"+dgm.group(1));
            System.out.println("分到的第二组小括号中的内容是"+dgm.group(2));
        }



    }



}
