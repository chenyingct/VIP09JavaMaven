package com.testing.class4.homework;

import java.util.Scanner;

/**
 * @Classname People
 * @Description 类型说明
 * @Date 2021/4/18 22:20
 * @Created by cy
 */
public class People {
    /**
     * 属性可以包括：名字、年龄、性别、“人类”属性、人种（肤色）等等
     * 思考属性不同特点，可以创建为成员变量、静态变量、常量（每种至少一个）
     * 实现带参数的构造函数，赋值姓名和年龄
     * 实现吃饭、谈恋爱方法（打印即可）
     * 其中吃饭是静态方法
     * 谈恋爱是成员方法（实例方法）
     */
    public String name;
    public int age;
    public static String hobby="";
    public static final String SEX_FEMALE ="男";
    public static final String SEX_MALE ="女";
    public static final String SIKN_COLOR_BACK="黑色";
    public static final String SIKN_COLOR_YELLOW="黄色";
    public static final String SIKN_COLOR_WHITE="白色";
    public static final int LOVING_STAUTES_NO =0;
    public static final int LOVING_STAUTS_YES =1;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public People()
    {

    }

    public People(int age,String name)
    {
        this.age = age;
        this.name=name;
    }

    public static void eatting(String siknColor)
    {
        switch (siknColor) {
            case SIKN_COLOR_BACK:
                System.out.println("用手抓着吃饭。");
                break;
            case SIKN_COLOR_WHITE:
                System.out.println("用刀叉吃饭。");
                break;
            case SIKN_COLOR_YELLOW:
                System.out.println("用筷子吃饭。");
                break;
            default:
                break;
        }
    }

    public void loving(int age,int lvstauts)
    {
        if(lvstauts ==LOVING_STAUTS_YES){
            if(age<18){
                System.out.println("早恋了！！！");
            }else
            {
                System.out.println("正常恋爱");
            }
        }else
        {
            if(age >30){
                System.out.println(this.name+"还单身吗？需要介绍吗？(Y/N)");
                Scanner scanner = new Scanner(System.in);
                String isHelp = scanner.nextLine();
                if("Y".equals(isHelp)){
                    Propose propose = new Propose();
                    propose.process();
                }else {
                    System.out.println(this.name+"加油,下一个就是你的");
                }


            }else if(age<18){
                System.out.println("丰富自己内涵你将成为万人迷");
            }
            else
            {
                System.out.println(this.name +"马上就会遇到对的人");
            }
        }
    }


}
