package com.testing.class7;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Classname JsonParseTest
 * @Description 类型说明
 * @Date 2021/4/23 22:26
 * @Created by 特斯汀Roy
 */
public class JsonParseTest {

    //要求是从百度的返回中提取国家的信息。
    public static void main(String[] args) {
        String ip="{country: \"美国\", province: \"\", city: \"\", county: \"\", isp: \"亚马逊云\"}";
        //1、正则表达式可以完成提取。
        Pattern country=Pattern.compile("country: \"(.*?)\",");
        Matcher m=country.matcher(ip);
        if(m.find()){
            System.out.println("国家是"+m.group(1));
        }

        //2、使用json解析库来进行解析，用的是ali的fastjson。
        //1、JsonPath语法读取。
        String c = JSONPath.read(ip, "$.country").toString();
        System.out.println("jsonpath解析结果"+c);

        //2、将json解析成为对象，然后进行查找。
        //而ip这个json字符串，仅仅是一个字符串而已。
        //解析ip字符串为一个jsonObject 对象 里面存储的是对象
        JSONObject jsonObject = JSON.parseObject(ip);
        //json对象 键没有顺序。 跟map一个道理。
        System.out.println(jsonObject);
        Object isp = jsonObject.get("isp");
        System.out.println(isp);


        //3、将json的值转存到map里面。
        Map<String,Object> map=new HashMap<>();

        //遍历
        for (String key : jsonObject.keySet()) {
            System.out.println("键是"+key+"值是"+jsonObject.get(key));
            //存储键值对
            map.put(key,jsonObject.get(key));
        }

        System.out.println("----------map的结果------------");
        System.out.println(map);










    }

}
