package com.testing.class4;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.util.Set;

/**
 * @Classname WashMachine
 * @Description 类型说明
 * @Date 2021/4/16 20:31
 * @Created by 特斯汀Roy
 */
public class WashMachine {

    //属性，变量，域（field）
    //成员变量。
    //没有赋值的变量，int 默认值是0，类类型的默认值是null
    public int length;
    public int width=56;
    //静态变量的定义
    public int height=90;
    //静态变量，一改全改，所以尽量定义变量的时候，想好它的意义。
    public static String func="洗衣服";
    //常量，不允许发生改变的量。
    public static final String KIND="洗衣机";
    public String color="黑色";
    public String brand;

    /**
     * 构造方法不能有返回类型，这个方法是个普通的方法，不要这么写。
     */
    public void WashMachine(){

    }

    /**
     * 显式定义无参构造方法
     */
    public WashMachine(){
        System.out.println("生产一台洗衣机");
    }

    /**
     * 显示定义有参构造方法
     * @param brand
     */
    public WashMachine(String brand){
        this.brand=brand;
        System.out.println("买了一台"+brand+"牌的洗衣机");
    }

    //功能，方法/函数 function
    //方法构成：返回值类型 方法名(参数列表){方法体}
    /**
     * 类中变量的get方法，用于获取变量的值，但是不改变原本类中的值。
     * @return
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 对类中的变量进行赋值操作。
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //void 表示空，没有返回值

    public void donothing(){}

    public void washClothes(){
        //方法体
        System.out.println("洗衣机能够洗衣服");
    }

    /**
     *  有参数列表的方法
     * @param clothes
     */
    //方法的参数列表： 形参
    void dryClothes(String clothes){
        System.out.println(brand+"品牌的洗衣机有烘干功能");
        //方法内部直接使用形参进行代码编写
        if("干衣服".equals(clothes)){
            System.out.println("衣服是干的，不需要烘干了");
        }
        else{
            System.out.println("衣服还没干，正在进行烘干操作……");
        }
    }

    //如果方法定义了返回类型，那么这个方法最后需要返回一个对应类型的结果。

    /**
     * 有返回值和参数列表的方法
     * @param count 洗衣服的数量
     * @return 洗完衣服之后的数量
     */
    int breakClothes(int count){
        //局部变量，在语句块之外无法使用。
//        System.out.println(clothes+"被洗坏了");
        count--;
        System.out.println("洗衣机洗坏了一件衣服");
        System.out.println("现在还剩"+count+"件衣服");
        return count;
        //return 除了返回对应的返回类型结果之外，也会结束方法的运行，
        // 所以之后的代码，没有办法被执行到
//        System.out.println("现在还剩"+count+"件衣服");
    }

    /**
     * 耗电方法
     * @param power 电量
     * @param thing 洗的东西
     * @return 返回耗电量结果
     */
    String usePower(int power,String thing){
        System.out.println("洗衣机洗"+thing+"一共耗了"+power+"度电");
        return "耗电量是"+power;
    }

    /**
     * 洗烘一体
     * @param cloth 传参衣服，供dryClothes方法使用。
     */
    //在同一个类里面，方法可以调用其它的方法，直接用方法名() 就可以进行调用。
    public void washAndDry(String cloth){
        //实例方法中可以使用静态变量和静态方法。
        System.out.println(func);
        canbeSeen();
        this.washClothes();
        dryClothes(cloth);
        dryClothes("湿衣服");
    }


    /**
     * 静态方法，由static修饰
     */
    public static void canbeSeen(){
        System.out.println("不用买一台洗衣机，我们也能云观看洗衣机");
//        静态方法中，不能使用非静态的变量和方法。
//        washClothes();
//        height++;
    }


    /**
     * main方法，静态方法，固定写法。
     * 可以写在一个定义了类的属性和功能的class中。
     * @param args
     */
    public static void main(String[] args){
        WashMachine mac=new WashMachine();
        mac.usePower(3,"帽子");
    }


}
