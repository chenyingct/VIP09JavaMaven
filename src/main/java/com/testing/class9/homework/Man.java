package com.testing.class9.homework;

/**
 * @Classname Man
 * @Description 类型说明
 * @Date 2021/4/29 16:48
 * @Created by cy
 */
/*
* 人类继承于动物类，男人类继承于人类。
用final关键字修饰人类的某些方法和变量，重写人类当中的部分方法，用super关键字调用人类的变量和方法（包括构造方法）。
* */
public class Man extends Hunam{
    public static void main(String[] args) {
        Man man = new Man("tom");
        man.setNation("中国");
        man.walking(man.getNation());
        man.eating();
        man.work();

        man.playball();
        man.growup(23);
    }
   public String huzi="男人有大胡茬";
   public Man(){

   }

   public Man(String name){
       super(name);
   }

    @Override
    public void eating() {
        super.eating();
        System.out.println("男人饭量比较大，比较喜欢吃肉");
    }

    public void playball(){

        System.out.println("男人比较喜欢球类游戏");
    }

    public void growup(int age){
        super.growup(age);
        if(age >22){
            System.out.println("已经过了法定结婚年龄");
        }
    }

    public void walking(String nation){
        System.out.println(super.walk+"大街上。");
    }

}
