package com.testing.class4;


import com.testing.class4.homework.People;

import java.util.Arrays;

/**
 * @Classname test
 * @Description 类型说明
 * @Date 2021/4/19 10:25
 * @Created by cy
 */
public class test {
    public static void main(String[] args) {
        int[] szSort = {1, 3, 4, 19, 6, 7, 8, 11, 5};
        int[] result =MPSort(szSort);
        int[] array ={1,2,3,4};
        int[] array1 =new int[]{1,2,3,4};
        People people =new People();
        System.out.println(Arrays.toString(array));
        System.out.println(array1);
        System.out.println(people);



//        for(int num : result) {
//            System.out.print(num+" ");
//        }
//        System.out.println("");
//        int[] result1 =SelectSort(szSort);
//        for(int num1 : result1) {
//            System.out.print(num1+" ");
//        }

    }

    public static int[] SelectSort(int[] szSort)
    {
        for (int i = 1; i <= szSort.length - 1; i++) {
            int min = szSort[i - 1];
            int mini = i - 1;
            for (int j = i; j <= szSort.length - 1; j++) {
                if (szSort[j] < min) {
                    min = szSort[j];
                    mini = j;

                }
            }
            if (min != szSort[i - 1]) {
                szSort[mini] = szSort[i - 1];
                szSort[i - 1] = min;

            }


        }
        return szSort;
    }

    public static int[] MPSort(int[] szSort)
    {
        for (int i = 1; i <=szSort.length-1; i++) {

            for (int j = 0; j <=szSort.length-1-i; j++) {

                if(szSort[j]<szSort[j+1])
                {
                    int temp= szSort[j];
                    szSort[j] = szSort[j+1];
                    szSort[j+1] = temp;
                }
            }


        }
        return szSort;
    }

}
