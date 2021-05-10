package com.testing.class7.homework;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Classname MailRegexTest
 * @Description 类型说明
 * @Date 2021/4/25 9:27
 * @Created by cy
 */
/*
 * 分析邮箱地址有哪些
 * 12333@qq.com
 * xxxx@163.com
 * xxx@126.com
 * 用户名 + @ + 邮件服务器地址
 * */
public class MailRegexTest {
    public static void main(String[] args) {
        System.out.println("----------输入测试的邮箱------------------");
        Scanner sc = new Scanner(System.in);
        boolean isMail = false;
        while (!isMail) {
            String mail = sc.nextLine();
            isMail = regexMail(mail);
            if (isMail) {
                System.out.println("该邮箱是一个正确邮箱地址.");
                String ym = interceptMail(mail);
                System.out.println("邮箱域名为:" + ym);
                if ("163".equals(ym)) {
                    System.out.println("修改前的邮箱:"+mail);
                    System.out.println("修改前的邮箱:"+changeMail(mail));

                }
            } else {
                System.out.println("请输入一个正确的邮箱地址");
            }
        }

    }
    //匹配是否是一个邮箱地址
    public static boolean regexMail(String mail) {
        String regexStr = "\\w{1,}@\\w{1,}(\\.\\w{1,}){1,}";
        boolean isMail = mail.matches(regexStr);
        return isMail;
    }
    //截取域名
    public static String interceptMail(String mail) {
        String strRex = "@(.*?)\\.";
        Pattern compile = Pattern.compile(strRex);
        Matcher matcher = compile.matcher(mail);
        String ym = "";
        if (matcher.find()) {
            ym = matcher.group(1);
        }
        return ym;
    }
    //替换成smtp.163
    public static String changeMail(String mail) {
        String mailAfter = "";
        String strRex = "(.*?)\\.com";
        Pattern compile = Pattern.compile(strRex);
        Matcher matcher = compile.matcher(mail);
        if (matcher.find()) {

            mailAfter = mail.replace(matcher.group(1), "smtp.163");
        }

        return mailAfter;
    }
}
