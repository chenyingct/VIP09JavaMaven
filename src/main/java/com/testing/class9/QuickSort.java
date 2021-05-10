package com.testing.class9;

import java.util.Arrays;

/**
 * @Classname QuickSort
 * @Description 类型说明
 * @Date 2021/4/28 21:23
 * @Created by 特斯汀Roy
 */
public class QuickSort {

    public static void main(String[] args) {

        int[] a={4,2,9,1,3,8,5};
        int[] b={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        int[] quicksort = quicksort(b, 0, b.length - 1);
        System.out.println(Arrays.toString(quicksort));


    }

    //传递数组和排序的起点及重点作为参数。
    public static int[] quicksort(int[] a,int start,int end){

        //取最左边的数作为基准值。
        int base=a[start];
        //		分别用两个游标来进行遍历操作，当两个游标相遇的时候，遍历就完成了。
        //			一个游标在最左侧left  一个在最右侧right。
        int left=start;
        int right=end;


        //外层循环进行左右两边的遍历操作:	 结束循环的操作条件：left=right
        while(left<right) {
            //			由于取的是左边作为基准，先从右边开始进行遍历判断：  循环进行比较的退出条件也是：left=right
            while(left<right) {
                //				如果右边游标的数比基准值：
                //						大：那么不用动，游标前进。right--;
                if(a[right]>base){
                    right--;
                }
                //						小： 1、交换right 和 left游标 （基准值）的位置 ，基准值的位置变成了right所在的位置。
                //							 2、交换之后， 换成从左往右进行遍历。
                //							 3、原本left的位置的数不用再和基准值比了，左边游标前进。 left++；
                else{
                    //交换值
                    int tmp=a[left];
                    a[left]=a[right];
                    a[right]=tmp;
                    //左边游标移动一下
                    left++;
                    //跳出从右往左的循环，
                    break;
                }

            }

            //			切换到从左往右进行遍历：
            //				如果左边游标的数比基准值：       循环进行比较的退出条件也是：left=right
            while(left<right) {
                //						小：不用动，游标前进。left++
                if(a[left]<base){
                    left++;
                }
                //	大： 1、需要交换 left 和 right游标（基准值）的位置，基准值的位置变成了left所在的位置。
                //	 2、交换之后，换成从右往左遍历。
                //	3、原本right的位置的数不用再和基准值比了，右边游标前进。 right--；
                else{
                    //交换值
                    int tmp=a[left];
                    a[left]=a[right];
                    a[right]=tmp;
                    right--;
                    //跳出循环，进入下一次的左右交替循环。
                    break;
                }
            }
        }

        //	出口条件：拆到基准值左边只剩一个数或者没有的时候，左边不用排了	  left-1>start 接着递归排，否则不用排了。
        //				右边只剩一个数或者没有的时候，右边不用排了。     right+1<end  接着递归排，否则不用排了。

        if(left-1>start){
            quicksort(a,start,left-1);
        }
        else{
            //左边不排了，不做任何事情
        }

        if(right+1<end){
            quicksort(a,right+1,end);
        }else{
            //右边不排了，不做任何事情。
        }
        //同时满足左右两边都不需要排了的时候，达到最终出口。
        return a;
    }

}
