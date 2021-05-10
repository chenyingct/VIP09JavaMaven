package com.testing.class6;

/**
 * @Classname StringConvertTest
 * @Description 类型说明
 * @Date 2021/4/21 21:04
 * @Created by 特斯汀Roy
 */
public class StringConvertTest {
    public static void main(String[] args){
        /**
         * 其它类型转String
         */
        int a=1;
        //类型不匹配，可以用Strign.valueof来进行转换。
//        String s=(String)1;
        String s=String.valueOf(1);


        /**
         * String 转 其它类型（对应于基本数据类型）
         * String 没有什么办法直接转成其它类类型
         */

        String as="123";
        System.out.println(as + 1);

        //将对应基本类型的字符串，转换成为基本数据类型。
        int si = Integer.parseInt(as);
        //包装类型可以直接转换为对应的基本数据类型
        Integer sii=Integer.parseInt(as);
        System.out.println(si+1);

        //低精度到高精度的基本数据类型可以自动转换。
        float sif = Integer.parseInt(as);
        System.out.println(sif);

        String fs="1.35555";
        float ffs = Float.parseFloat(fs);
        //高精度到低精度要进行强制转换。
        int ifs=(int)Float.parseFloat(fs);

        //在转换执行之前，编译器不会报错，但是一旦执行，就会出现异常。
        String ds="1.466666";
        try {
            int i = Integer.parseInt(ds);

        }catch(Exception e){
            //默认处理输出堆栈报错信息
            e.printStackTrace();
            System.out.println(ds+"不是一个整数");
        }

        //尝试执行try中的语句，如果失败，跳转到catch中进行执行。
        try {
            System.out.printf("强行转换%d的结果",ds);
        } catch (Exception e) {
            System.out.println("ds不能转换成数字进行输出");
        }
        System.out.println("代码执行结束");


    }
}
