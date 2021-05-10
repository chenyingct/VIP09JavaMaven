package com.testing.class4;

/**
 * @Classname WashMTest
 * @Description 类型说明
 * @Date 2021/4/16 20:51
 * @Created by 特斯汀Roy
 */
public class WashMTest {
    public static void main(String[] args) {
        //定义一个对象
        //定义对象
        //声明要使用一个xiaohei的对象
        WashMachine xiaohei;
        //为对象赋值，产生一个对象。
        //为小黑开辟内存空间，完成类中属性和方法的实例化。
        xiaohei =new WashMachine();

        //使用属性
//        xiaohei.height;
        System.out.println("品牌是"+xiaohei.brand);
        int a= xiaohei.height+3;
        System.out.println(a);
        System.out.println("长度是"+xiaohei.length);

        //使用方法,调用方法，一定记得，在方法名后加上()。
        xiaohei.donothing();
        System.out.println("--------------调用空返回的方法---------------");
        xiaohei.washClothes();

        System.out.println("------------调用有参数列表的方法----------");
        //调用带有参数列表的方法的时候，将实际的参数，按照方法形参列表的定义顺序传递进去。
        xiaohei.dryClothes("干衣服");

        System.out.println("------------调用有返回类型的方法----------");
        //有返回类型的方法，可以直接调用，不用额外使用。
        xiaohei.breakClothes(5);
        //返回的结果，可以用对应的类型来进行接收，并且可以使用。
        int remainClothes=xiaohei.breakClothes(8);
        System.out.println("洗完之后，剩下"+remainClothes+"件衣服");

        System.out.println("------------调用有多个形参的方法----------");
        String afterwash=xiaohei.usePower(3,"旅游鞋");
        //输出返回的结果
        System.out.println("返回的结果是"+afterwash);
        boolean 耗电 = afterwash.contains("耗电");
        System.out.println(耗电);

        //方法返回的返回类型结果直接继续调用它的方法
        System.out.println(xiaohei.usePower(5, "小龙虾").contains("龙虾"));


    }


}
