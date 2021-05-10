package com.testing.class3;

/**
 * @Classname ForTest
 * @Description 类型说明
 * @Date 2021/4/14 21:01
 * @Created by 特斯汀Roy
 */
public class ForTest {
    public static void main(String[] args) {
        //循环10次输出1
//        for (int count=0;count<10;count++){
//            System.out.println(1);
//        }

        //输出从1.1到10.1
//        for (float count=1.1f;count<=10.1f;count++){
//            System.out.println(count);
//        }

        //抽离for循环中的语句
        //1、将循环控制变量的赋值语句取消，使用已有变量来进行循环控制。
        float count =1.1f;
//        for(;count<=10.1f;count++){
//            System.out.println(count);
//        }

        //2、将循环执行条件语句抽离,一定记得指定退出循环的条件。用break退出。
        //将执行条件抽离的时候，其实没有指定什么时候推出for循环。
//        for(;;count++){
//            //如果条件成立，进行输出
//            if(count<=10.1f){
//                System.out.println(count);
//            }
//            //没有for循环的退出条件，所以一直在for循环中执行。
//            else{
//                break;
//            }
//        }
//        //由于出现了死循环，没法退出for循环，无法执行到这行语句。
//        System.out.println("执行完之后的count值是"+count);

        //3、将循环变量更新语句抽离
        //循环控制变量一定是有机会满足退出循环的条件的。
        for(;;){
            if(count<=10.1f){
                System.out.println(count);
                count++;
            }
            else{
                break;
            }
        }

        //4、只留中间的控制语句
        for(;count<=10.1f;){
            System.out.println(count);
            count++;
        }



    }

}
