package com.testing.class3;

/**
 * @Classname BreakCRTest
 * @Description 类型说明
 * @Date 2021/4/14 21:52
 * @Created by 特斯汀Roy
 */
public class BreakCRTest {

    public static void main(String[] args) {
//        for(int i=1;i<10;i++){
//            if(i==6)
//                //不用continue的原因是，跳过循环语句的执行，
//                // 但是循环控制变量更新语句i++还是要执行的。
//                //跳出本次循环
//                continue;
//            //break之后的语句，在每次循环中就不执行了。
//            System.out.println(i);
//        }
//        System.out.println("循环已经退出了");

        for(int i=1;i<10;i++){
            if(i==6)
                //跳出整个方法的执行。
                return;
            //break之后的语句，在每次循环中就不执行了。
            System.out.println(i);
        }
        System.out.println("循环已经退出了");

//        int j=1;
//        while(j<10){
//            if(j==6){
//                break;
//            }
//            System.out.println(j);
//            j++;
//        }


//        int j=1;
//        while(j<10){
//            if(j==6){
//                //因为如果不加j++，会跳过continue之后的语句执行，进入下一次的循环判断j<10
//                //导致一直j==6，不断地跳过，进入。死循环。
//                j++;
//                continue;
//            }
//            System.out.println(j);
//            j++;
//        }





    }

}
