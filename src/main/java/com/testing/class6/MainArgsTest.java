package com.testing.class6;

/**
 * @Classname MainArgsTest
 * @Description 类型说明
 * @Date 2021/4/21 21:32
 * @Created by 特斯汀Roy
 */
public class MainArgsTest {

    //main方法的参数列表需要接收的参数，是字符串数组变量 args
    public static void main(String[] args) {
        //通过调用args数组中的值可以进行使用。
        System.out.println("请输入两个数字：");
        String arg1 = args[0];
        String arg2 = args[1];
        System.out.println(arg1);
        System.out.println(arg2);

        try {
            int i = Integer.parseInt(arg1);
            int j=Integer.parseInt(arg2);

            System.out.printf("乘法之后 %s *%s 的结果是 %s",i,j,i*j);


        } catch (NumberFormatException e) {
            System.out.println("输入的不是整数，请重新输入");
        }


    }

}
