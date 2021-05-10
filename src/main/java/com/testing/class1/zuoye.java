package com.testing.class1;

/*
 *完成加减乘除四则运算
 *·声明4个变量a,b,c,d并根据自己喜好赋值，练习四则运算
 *(自己计算之后用程序验证结果)
 * a+b/c+d
 *(a+b)%c+5-d
 *a+b%c*d
 *· 计算时进行低精度高精度的转换，熟悉过程。
 * */
public class zuoye {
    public static void main(String[] args) {
        IntLongDFMath();
        System.out.println();
        System.out.println();
        BSICMath();
    }

    public static void IntLongDFMath() {
        long a = 12;
        float b = 6.66666f;
        double c = 6.66000;
        int d = 6;
        double f1 = a + b / c + d;
        double e = (a + b) % c + 5 - d;
        double g = a + b % c * d;
        System.out.println("a为长整型，b浮点型，c为double型，d为整型");
        System.out.println("计算式a+b/c+d:");
        System.out.println("笔算步骤:\n" +
                "先乘除在加减，先算b/c,等到1.001d，\n" +
                "然后相同运算没有括号，从左到右，先算a+上面双算出的结果，等到13.001d\n" +
                "最后计算+d,得到结果19.001");
        System.out.println("程序结算结果为: " + f1);
        System.out.println();
        System.out.println("计算式(a+b)%c+5-d:");
        System.out.println("笔算步骤：\n" +
                "有括号，先算括号，先算a+b,得到18.66666f\n" +
                "再算%c,得到5.34666d\n" +
                "最后算+5-d得到4.34666d");
        System.out.println("程序结算结果为:" + e);
        System.out.println();
        System.out.println("计算式a+b%c*d");
        System.out.println("笔算步骤：\n" +
                "有括号，先算括号，先算b%c,得到0\n" +
                "再算*d,得到0\n" +
                "最后算a+得到12d");
        System.out.println("程序结算结果为:" + g);



    }

    public static void BSICMath() {
        short b = 12;
        byte d = 6;
        int c = 2;
        char a = 'z';//122
        byte f1 = (byte)(a + b / c + d);
        int e = (a + b) % c + 5 - d;
        short g = (short)((a + b % c * d)*1000);
        System.out.println("a为字符型，b为短整型，c为整形，d为字节");
        System.out.println("计算式a+b/c+d:");
        System.out.println("笔算步骤：\n" +
                "先乘除在加减，先算b/c,等到6，\n" +
                "然后相同运算没有括号，从左到右，先算a+上面双算出的结果，等到128\n" +
                "最后计算+d,得到结果134,转换为byte为1000 0110-->0111 1001-->(121+1)*(-1)=-122");
        System.out.println("程序结算结果为:" + f1);
        System.out.println();
        System.out.println("计算式(a+b)%c+5-d:");
        System.out.println("笔算步骤：\n" +
                "有括号，先算括号，先算a+b,得到134\n" +
                "再算%c,得到0\n" +
                "最后算+5-d得到-1");
        System.out.println("程序结算结果为:" + e);
        System.out.println();
        System.out.println("计算式a+b%c*d:");
        System.out.println("笔算步骤：\n" +
                "有括号，先算括号，先算b%c,得到0\n" +
                "再算*d,得到0\n" +
                "最后算a+得到122,最后乘以1000，\n" +
                "得到122000超过short的65536，\n" +
                "122000-65536*2，得到-9072");
        System.out.println("程序结算结果为:" + g);
    }
}
