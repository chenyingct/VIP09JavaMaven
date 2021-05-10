package com.testing.class3;

import java.util.Scanner;

/**
 * @Classname SwitchTest
 * @Description 类型说明
 * @Date 2021/4/14 20:34
 * @Created by 特斯汀Roy
 */
public class SwitchTest {
    public static void main(String[] args) {
        System.out.println("will老师准备给自己的女朋友送点礼物");
        Scanner sc=new Scanner(System.in);
        int mood=50;
        System.out.println("请输入送的礼物：");
        String gift = sc.nextLine();

//        if("花花".equals(gift)){
//            System.out.println("女朋友收到花花，好感度+10");
//        }
//        else if("车子".equals(gift)){
//            System.out.println("收到车子，好感度+100");
//        }
//        else{
//            System.out.println("抠门，拜拜~");
//        }


        //switch语句：场景，当需要用某个值的不同结果，决定执行不同的代码的时候。
        // 用switch case语句。
        // 当进入case之后，执行语句，直到遇见break语句，跳出switch，或者将switch语句执行到最后。
        //每一个case记得敲的时候先加上break语句，当执行到这个case，就不再往下执行，跳出switch语句。
        //如果，所有的case场景都不符合，要执行的语句，放在default部分。
        //default语句，放在switch最后面，可以不加break。

        switch (gift){
            //场景：
            case "花花":
                mood +=10;
                System.out.println("女朋友收到花花，好感度+10");
                break;
            //如果想要多个变量值执行相同的操作，那么在case语句中不加任何内容，也不要break，写在一起即可。
            case "车车":
            case "奥迪":
            case "宝马":
                mood +=100;
                System.out.println("女朋友收到车车，好感度+100");
                break;
            case "戒指":
                mood+=50;
                System.out.println("收到戒指，好感度+50");
                break;
            default:
                mood-=10;
                System.out.println("送的礼物不喜欢，好感度-10");
        }
        System.out.println("当前好感度是"+mood);
        if(mood>100){
            System.out.println("恭喜will抱得美人归");
        }
        else{
            System.out.println("再努努力。");
        }


        int people=4;
        //switch case不支持 boolean类型。如果要用一个条件，请用if else语句。
        boolean a=true;
        //switch case不支持 boolean类型。如果要用一个条件，请用if else语句。
        switch(people){
            case 3:
                System.out.println("斗地主");
                break;
            case 4:
                System.out.println("打麻将");
                break;
            default:
                System.out.println("看电视");
        }



    }


}
