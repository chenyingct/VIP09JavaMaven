package com.testing.class6.homeWork;

/**
 * @Classname OutArgs
 * @Description 类型说明
 * @Date 2021/4/22 10:06
 * @Created by cy
 */
public class OutArgs {
    public static void main(String[] args) {
        System.out.println("---------输入float类型的数据------------");
        MainArgs.main(new String[]{"1.666666", "1.77777777777"});
        System.out.println("---------输入中文字的数据------------");
        MainArgs.main(new String[]{"1", "国"});
        System.out.println("---------输入特殊符号的数据------------");
        MainArgs.main(new String[]{"1", "?"});
        System.out.println("---------输入特正确的数据------------");
        MainArgs.main(new String[]{"2", "3"});
    }

}
