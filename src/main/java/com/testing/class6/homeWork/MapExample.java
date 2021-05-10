package com.testing.class6.homeWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Classname MapExample
 * @Description 类型说明
 * @Date 2021/4/22 9:48
 * @Created by cy
 */
public class MapExample {
    public static void main(String[] args) {
        Map<String,String> map =new HashMap<String,String>();
        map.put("小猫","喵喵");
        map.put("小狗","汪汪");
        map.put("青蛙","呱呱");
        map.put("小羊","咩咩");
        mapForEvE(map);

        mapIterEvE(map);
    }

    public static void mapForEvE(Map<String,String> map)
    {
        System.out.println("------------通过键方式foreach循环输出---------------");
        for (String key: map.keySet()) {
            String value= map.get(key);
            System.out.printf("键是%s,值是%s \r\n",key,value);
        }

    }
    public static void mapIterEvE(Map<String,String> map)
    {
        System.out.println("------------通过入口方式iterator循环输出---------------");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            String key= next.getKey();
            String value= next.getValue();
            System.out.printf("键是%s,值是%s \r\n",key,value);
        }

    }
}
