package com.testing.class2;

/**
 * @Classname SelfOp
 * @Description 类型说明
 * @Date 2021/4/13 11:04
 * @Created by cy
 */
public class SelfOp {
    public static void main(String[] args) {
        int a = 3;
        int b= 10;
        System.out.println("前自增的a结果"+ ++a);
        //先取值操作，取值为4，然后在进行自增操作，得到a的值是5
        System.out.println("后自增的a结果"+ a++);
        //后自减，先取值，然后自减 取值结果是10，运算之后是9
        System.out.println("后自增的b结果"+ b--);
        //先自减，后取值，计算等到8，然后取值
        System.out.println("前自增的b结果"+ --b);

        System.out.println("最终a的值："+a);
        System.out.println("最终b的值："+b);
    }
}
