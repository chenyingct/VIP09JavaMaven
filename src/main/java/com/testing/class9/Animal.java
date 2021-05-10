package com.testing.class9;

/**
 * @Classname Animal
 * @Description 类型说明
 * @Date 2021/4/28 21:46
 * @Created by 特斯汀Roy
 */
public class Animal {

    public int eye=2;
    public String ear="耳朵";

    public Animal(){
        System.out.println("一个动物出生了");
    }

    public void eating(){
        System.out.println("动物都要进食。");
    }


    public void giveBirth(String name){
        System.out.println("一个叫做"+name+"的动物被爸爸妈妈生出来了");
    }

    public String toString(){
        return "这是一个动物有"+eye+"个眼睛";
    }

}
