package com.testing.class8.homework;

/**
 * @Classname DogTest
 * @Description 类型说明
 * @Date 2021/4/28 11:34
 * @Created by cy
 */
public class DogTest {
    public static void main(String[] args) {
        DogGrow grow = new DogGrow();
        long age = grow.getAge();
        System.out.println("当前小狗年龄："+ age);
        grow.bark(age);
        System.out.println("-------------经过1年后------------");
        age = grow.growUp(1);
        System.out.println("当前小狗年龄："+ age);
        grow.bark(age);
        System.out.println("-------------经过1.1年后------------");
        age = grow.growUp(1.1);
        System.out.println("当前小狗年龄："+ age);
        grow.bark(age);
        System.out.println("-------------经过1年,6个月后------------");
        age = grow.growUp(1,0.5);
        System.out.println("当前小狗年龄："+ age);
        grow.bark(age);
        System.out.println("-------------经过2年,6个月后,22天------------");
        age = grow.growUp(2,0.5f,0.06);
        System.out.println("当前小狗年龄："+ age);
        grow.bark(age);
        System.out.println(grow.getAge());
    }

}
