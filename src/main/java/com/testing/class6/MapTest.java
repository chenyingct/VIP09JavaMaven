package com.testing.class6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * @Classname MapTest
 * @Description 类型说明
 * @Date 2021/4/21 20:18
 * @Created by 特斯汀Roy
 */
public class MapTest {


    public static void main(String[] args) {
        //map就类似一个字典，用来存储键值对。
        Map<String,Integer> map=new HashMap<String,Integer>();
        //map中不允许出现重复的键。
        // 键在存储的时候，其实是以set的形式来进行存储的，所以key不允许重复
        // 同时map存储没有顺序。
        //增
        map.put("roy",30);
        map.put("will",31);
        map.put("土匪",38);
        map.put("roy",18);
        map.put("悠米",18);
//        map.put(null,null);
        //删
//        map.remove("roy");
        //用上键值对来进行删除，相当于加了更严格的限制。
        map.remove("will",32);

        //改
        //修改是修改键所对应的值。
        map.replace("will",16);
        //用put也能完成这个操作。
        map.put("will",50);

        //查
        System.out.println(map);

        //map基于键来查找值
        System.out.println(map.get("roys"));
        System.out.println(map.get("土匪"));

        //1、map存储没有顺序，所以不存在用下标进行查找
        //2、 foreach循环
        //如果用get去查找不存在的键，获取到的结果会是null。
        //2.1 用键进行遍历，然后获取它的值。
        //先获取到所有的键
        Set<String> keySet = map.keySet();
        //遍历keySet中的每一个键
        for (String key : keySet) {
            //可以用int来接收Integer的值，Integer可以自动转换为int
            //但是null没办法赋值给int，所以如果用int这里会报错。
//            Integer value=map.get(key);
            int value =map.get(key);
            //printf 表示格式化(format)输出
            //在字符串中，用%类型表示要使用的参数，
            // 在字符串后面的参数内容，传递到字符串里完成拼接。
            // \r \n 通过 转义，将原本r和n的字母换成 回车和换行
            System.out.printf("键是%s,值是%s \r\n",key,value);
        }

        System.out.println("---------------------通过Entry遍历");
        //2.2 通过map的键值对整体 Entry ，来进行遍历。
        //在Map中使用里面定义Entry内部类。
        for (Map.Entry<String, Integer> mapEntry : map.entrySet()) {
            String key = mapEntry.getKey();
            Integer value = mapEntry.getValue();
            System.out.printf("键是%s,值是%s \r\n",key,value);

        }


        System.out.println("------------------iterator遍历Entry");
        //3、Iterator 进行遍历。
        //通过获取keySet或者entryset的iterator迭代器，完成遍历。
        Set<Map.Entry<String,Integer>> entrySet= map.entrySet();
        Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Entry<String, Integer> next = iterator.next();
            System.out.println("直接输出entry"+next);
            System.out.printf("键是%s,值是%s \r\n",next.getKey(),next.getValue());
        }


    }
}
