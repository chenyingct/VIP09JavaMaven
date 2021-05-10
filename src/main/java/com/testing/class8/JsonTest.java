package com.testing.class8;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname JsonTest
 * @Description 类型说明
 * @Date 2021/4/26 20:03
 * @Created by 特斯汀Roy
 */
public class JsonTest {

    public static void main(String[] args) {
        Dog dog=new Dog("小白");
        Dog xiaoh=new Dog("小黄");
        JSONObject dj=new JSONObject();
        Dog xiaohei=new Dog("小黑");
        List<Dog> dogs=new ArrayList<>();
        dogs.add(dog);
        dogs.add(xiaohei);
        dj.put("dog",xiaoh);
        dj.put("dogs",dogs);
        System.out.println(dj);

    }


}
