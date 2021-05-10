package com.testing.class5.homework;

import java.util.*;

/**
 * @Classname Array2List
 * @Description 类型说明
 * @Date 2021/4/20 20:43
 * @Created by cy
 */
public class ArrayAndList {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 5, 4, 6, 9, 7, 8, 0};
        System.out.println("-------------原数组输出-----------------");
        System.out.println(Arrays.toString(a));
        List<Integer> list = Array2List(a);
        System.out.println("-------------从array取出放入list后打印---------------");
        System.out.println(list.toString());
        Integer[] changeArr = List2Array(list);
        System.out.println("------------从list中取出放入array后打印-----------");
        System.out.println(Arrays.toString(changeArr));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Integer[] b ={1,3,2,4,1,55,6,8};
        System.out.println("--------------Arrays.asList()----------------------------");
        List<Integer> arr2List = Arrays.asList(b);
        System.out.println(arr2List.toString());
        System.out.println("--------------List.toArray()----------------------------");
        Integer[] list2arr = (Integer[])arr2List.toArray();
        System.out.println(Arrays.toString(list2arr));
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("roy",1);
        map.put("roy",1);
        System.out.println(map);

    }

    public static List<Integer> Array2List(Integer[] arr) {

        List<Integer> list = new ArrayList<Integer>();
        for (Integer integer : arr) {
            list.add(integer);

        }
        //Iterator<Integer> iterator = list.iterator();
        return list;
    }


        public static Integer[] List2Array(List<Integer> list) {
        int len = list.size();
        Integer[] arr = new Integer[len];
        for (int i = 0; i < len; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

}
