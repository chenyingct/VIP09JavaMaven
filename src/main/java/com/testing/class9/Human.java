package com.testing.class9;

import com.sun.istack.internal.NotNull;

/**
 * @Classname Human
 * @Description 类型说明
 * @Date 2021/4/28 21:49
 * @Created by 特斯汀Roy
 */
public class Human extends Animal{

    public String hair="人类有头发";
    public String ear="招风耳";

    public Human(){
        System.out.println("人类的无参构造方法'");
    }

    public Human(String name){
        System.out.println("人类出生的时候取了个名字叫"+name);
    }

    //返回类型不同，不能产生重载，编译器会报错。
//    public String useTools(String a){}

    public void useTools(String tool){
        if("电脑".equals(tool)){
            System.out.println("这是个码农，正在上班");
        }
        else if("手机".equals(tool)){
            System.out.println("这个人可能在看手机摸鱼");
        }
        else{
            System.out.println("人类在用"+tool+"进行操作");
        }
    }


    public void eating(){
        System.out.println("人类的祖先吃饭的方法：");
        super.eating();
        System.out.println("人类吃饭要煮熟了吃");
    }


    //如果和父类方法名字相同，参数列表相同，而返回类型不同，
    // 相当于进行对子类中继承的方法重载失败，定义了一个同名但是仅有返回类型不同的方法。
//    public String eating(){
//
//    }

    //改变参数列表不产生重写，相当于写了一个新的方法
    //从父类继承了一个方法，然后对它做了个隐式的重载。
    public void eating( String food){
        switch (food){
            case "日料":
                System.out.println("吃生的容易拉肚子");
                break;
            case "火锅":
                System.out.println("吃太辣容易拉肚子");
                break;
        }
    }


    public String toString(){
        return "这是个人类";
    }





}
