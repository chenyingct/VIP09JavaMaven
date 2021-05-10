package com.testing.class9.homework;

import java.util.Arrays;

/**
 * @Classname FastSort
 * @Description 类型说明
 * @Date 2021/4/29 9:16
 * @Created by cy
 */
public class FastSort {
    static int i;

    public static void main(String[] args) {
        int[] a = {4, 2, 9, 1, 3, 8, 5};
        int[] b = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println("-------------排序前:" + Arrays.toString(a));
        fastSort(a, 0, a.length - 1);
        System.out.println("-------------快排后:" + Arrays.toString(a));
    }


    public static int[] fastSort(int[] a, int start, int end) {
        int base = a[end];
        int left = start;
        int right = end;

        while (left < right) {
            while (left < right) {
                if (a[left] > base) {
                    left++;
                } else {
                    int temp = a[left];
                    a[left] = a[right];
                    a[right] = temp;
                    right--;
                    break;
                }
            }
            while (left < right) {
                if (a[right] < base) {
                    right--;
                } else {
                    int temp = a[left];
                    a[left] = a[right];
                    a[right] = temp;
                    left++;
                    break;
                }
            }
            i++;
            System.out.println("第" + i + "轮:" + Arrays.toString(a));
        }
        if (left - 1 > start) {
            fastSort(a, start, left - 1);
        } else {

        }
        if (right + 1 < end) {
            fastSort(a, right + 1, end);
        } else {

        }
        return a;
    }
}
