package com.testing.class9.homework;

/**
 * @Classname hunam
 * @Description 类型说明
 * @Date 2021/4/29 16:31
 * @Created by cy
 */
public class Hunam extends  Animal{
    final String walk="直立行走。";
    public int age=0;
    public String nation;
    public Hunam(){

    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Hunam(String name){
        System.out.println("一个叫"+ name +"的人");
    }
    final void work(){
        System.out.println("为了生活好好工作，多多挣钱。");
    }
    public void cooking(){
        System.out.println("家常菜肴。");
    }

    public void eating(){
        super.eating();
        System.out.println("人类喜欢吃熟的食物");
    }

    public void growup(int growAge){
        age = age + growAge;
        System.out.println("长到"+22+"岁了");
    }

}
