package com.testing.class4.homework;

/**
 * @Classname TestDog
 * @Description 类型说明
 * @Date 2021/4/18 21:57
 * @Created by cy
 */
public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.GrowUp(5);
        System.out.println("---------------------------------------------");
        Dog lily = new Dog(2);
        lily.GrowUp(2);
    }
}
