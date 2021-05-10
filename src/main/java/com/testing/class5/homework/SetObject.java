package com.testing.class5.homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Classname SetObject
 * @Description 类型说明
 * @Date 2021/4/20 21:13
 * @Created by cy
 */
public class SetObject {
    public static void main(String[] args) {
        Set<Object> hn = new HashSet<Object>();
        hn.add("roy");
        hn.add(1);
        Iterator<Object> itr = hn.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
