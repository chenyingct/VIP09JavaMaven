package com.testing.class7.homework;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;

import java.util.*;

/**
 * @Classname JSONTest
 * @Description 类型说明
 * @Date 2021/4/25 11:16
 * @Created by cy
 */
public class JSONTest {
    public static void main(String[] args) {
        String json = "{\"result\":{\"city\":\"南京\",\"country\":\"中国\",\"county\":\"None\",\"isp\":\"中国电信\",\"province\":\"江苏\"},\"success\":true}";
        //String result = JSONPath.read(json, "$.result").toString();
        System.out.println("-------------解析的Json字符串--------------------------");
        System.out.println(json);
        Map<String, Object> map = json2Map(json);
        String str = map2String(map);
        System.out.println("==================开始操作===============================");
        System.out.println("Json转换成map:" + map);
        System.out.println("将map转换成String输出:" + str);
    }

    public static Map<String, Object> json2Map(String json) {
        int start = json.indexOf(":{");
        int end = json.indexOf("},");
        //截取Json子字符串
        String subStr = json.substring(start + 1, end + 1);
        //将Json子字符串放入map
        JSONObject jsonObject = JSON.parseObject(subStr);
        Set<String> strings = jsonObject.keySet();
        Map<String, Object> map = new HashMap<String, Object>();
        for (String s : strings) {
            map.put(s, jsonObject.get(s));
        }
        return map;
    }

    public static String map2String(Map<String, Object> map) {
        String map2Str = "";
        //将map转换成String字符串
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        map2Str = "{";
        for (Map.Entry<String, Object> entry : entries) {
            map2Str = map2Str + "\"" + entry.getKey() + "\":" + "\"" + entry.getValue() + "\",";
        }
        map2Str = map2Str + "}";
        String last = map2Str.replace(",}", "}");

        return map2Str;
    }
}
