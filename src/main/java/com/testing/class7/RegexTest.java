package com.testing.class7;

/**
 * @Classname RegexTest
 * @Description 类型说明
 * @Date 2021/4/23 20:41
 * @Created by 特斯汀Roy
 */
public class RegexTest {

    public static void main(String[] args) {

//        String roy="roy1老师";
//        //java中原本\就表示转义，所以要表示单纯的\字符，用两个\\
//        String gang="\\老师";
//        String dot=".老师";
//        System.out.println(gang);
//
//        //制定一个规则（正则表达式）比如  某某某老师
//        String regexteacher= "\\D\\D\\D\\d老师";
//        //在正则表达式中，需要用\\\\表示一个单纯的\字符。
//        String regexG="\\\\..";
//        //用\\.表示单纯只是一个.号而已。
//        String regexD="\\.老师";
//        System.out.println(gang.matches(regexG));
//        System.out.println(dot.matches(regexD));

//        System.out.println(roy.matches(regexteacher));

        //要求只要是老师就可以，规则就该是    任意长度名字 老师
        //量词。
//        checkRegex("roy是个超级无敌大帅哥老师",".{1,5}老师");
//
//        //应用场景：比如去验证一个用户名是否是3-16位：
//        String username="royroyroyroyroyr";
//        checkRegex(username,".{3,16}");
//
//        //应用场景：验证一个密码只包含数字，3-8位
//        String password="123a";
//        checkRegex(password,"\\d{3,8}");
//
//        //应用场景：任意长度名字 老师
//        checkRegex("roy是个话痨老师",".+老师");

        //应用场景： 名字必须是 abcdefg 中的字符组成名字 的老师
        //TDD : test driven development 测试驱动开发：
//        String will="will老师";
//        String kaka="kaka老师";
//        String bad="bad老师";
//        String test="tes11老师";
//        String luanma="facegeage老师";
//
//        //a-g中的任意多个字母，出现4-8次。
//        checkRegex(luanma,"[a-g]{4,8}老师");
//
//        checkRegex(will,".+老师");
//
//        //应用场景：  名字就得是abcdefg 老师   注意，一个普通字符串，也是一种规则。
//        String abcdefg="abcdefg老师";
//        checkRegex(abcdefg,"abcdefg老师");

        //应用场景：  名字必须是  欧阳 欧阳  这种格式的老师
        //也就是 必须是欧阳老师 不能是 欧欧老师 阳阳老师。
        String 欧阳="欧阳老师";
        String ouou="欧欧老师";
        String yy="阳阳欧欧欧老师";
        String doubleOy="欧阳欧阳欧阳欧阳老师";
        checkRegex(yy,"(欧阳)+老师");
        checkRegex(yy,"(\\D\\W)+老师");

        //应用场景： 验证一个数字是不是手机号码。
        //手机号码的规则：  1开头，第二位是[3-9]， 后面9位任意数字。
        String num="13412345678";
        String wnum="134568/427a";
        String shortnum="135677865";
        String lnum="164595468656467887";
        String secondNum="11045678912";
        checkRegex(secondNum,"1[3-9]\\d{9}");

    }


    public static void checkRegex(String origin,String regex){
        boolean matches = origin.matches(regex);
        System.out.println(origin+"匹配"+regex+"结果是"+matches);
    }


}
