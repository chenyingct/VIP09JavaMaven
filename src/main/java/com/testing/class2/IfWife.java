package com.testing.class2;

/**
 * @Classname IfWife
 * @Description 类型说明
 * @Date 2021/4/13 16:49
 * @Created by cy
 */
public class IfWife {
    public static void main(String[] args) {
        String thing = "街上有：西瓜、包子、香蕉、火锅";
        //老婆的逻辑
        System.out.println("老婆逻辑：");
        System.out.println("买一斤包子");
        if(thing.contains("西瓜")){
            //if语句成立的时候执行的语句块
            System.out.println("老公看到了西瓜");
            System.out.println("买一个西瓜");
        }else{
            System.out.println("老公没有看到西瓜");
            System.out.println("不买西瓜了");
        }
        System.out.println("--------------------智商堪忧的分割线----------------------");
        System.out.println("老公逻辑:");
        if(thing.contains("西瓜")){
            //if语句成立的时候执行的语句块
            System.out.println("看到了西瓜");
            System.out.println("买一个西瓜");
        }else{
            System.out.println("没有看到西瓜");
            System.out.println("买一斤包子");
        }
        System.out.println("回家");
    }
}
