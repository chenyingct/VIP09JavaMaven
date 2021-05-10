package com.testing.class8;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;

/**
 * @Classname ChildrenJson
 * @Description 类型说明
 * @Date 2021/4/26 20:22
 * @Created by 特斯汀Roy
 */
public class ChildrenJson {
    public static void main(String[] args) {
        String originJson="{\n" +
                "  \"queryEnc\": \"%BD%F0%C9%A4%D7%D3\",\n" +
                "  \"queryExt\": \"金嗓子\",\n" +
                "  \"listNum\": 1732,\n" +
                "  \"displayNum\": 40925,\n" +
                "  \"gsm\": \"3c\",\n" +
                "  \"bdFmtDispNum\": \"约40,900\",\n" +
                "  \"bdSearchTime\": \"\",\n" +
                "  \"isNeedAsyncRequest\": 0,\n" +
                "  \"bdIsClustered\": \"1\",\n" +
                "  \"data\": [\n" +
                "    {\n" +
                "      \"adType\": \"0\",\n" +
                "      \"hasAspData\": \"0\",\n" +
                "      \"thumbURL\": \"http://img5.imgtn.bdimg.com/it/u=2745698475,2880110304&fm=26&gp=0.jpg\",\n" +
                "      \"middleURL\": \"http://img5.imgtn.bdimg.com/it/u=2745698475,2880110304&fm=26&gp=0.jpg\",\n" +
                "      \"largeTnImageUrl\": \"\",\n" +
                "      \"hasLarge\": 0,\n" +
                "      \"hoverURL\": \"http://img5.imgtn.bdimg.com/it/u=2745698475,2880110304&fm=26&gp=0.jpg\",\n" +
                "      \"pageNum\": 30,\n" +
                "      \"objURL\": \"ippr_z2C$qAzdH3FAzdH3Fvk7a8_z&e3Bwstv1g_z&e3Bv54AzdH3Ft42AzdH3FtkwghAzdH3Fda8cAzdH3Fdn0AzdH3F0clAzdH3Fdccllc00nd_8l8bm9cdna_z&e3B9aax9aa_z&e3B3r2\",\n" +
                "      \"fromURL\": \"ippr_z2C$qAzdH3FAzdH3F1jpwts_z&e3B8mbb_z&e3Bv54AzdH3F5uuj6AzdH3Fcdnn9bmmal8l_z&e3Bip4s\",\n" +
                "      \"fromJumpUrl\": \"ippr_z2C$qAzdH3FAzdH3Fvk7a8_z&e3Bwstv1g_z&e3Bv54AzdH3Ft42AzdH3FtkwghAzdH3Fda8cAzdH3Fdn0AzdH3F0clAzdH3Fdccllc00nd_8l8bm9cdna_z&e3B9aax9aa_z&e3B3r2\",\n" +
                "      \"fromURLHost\": \"detail.1688.com\",\n" +
                "      \"currentIndex\": \"\",\n" +
                "      \"width\": 400,\n" +
                "      \"height\": 348,\n" +
                "      \"type\": \"jpg\",\n" +
                "      \"is_gif\": 0,\n" +
                "      \"isCopyright\": 0,\n" +
                "      \"resourceInfo\": null,\n" +
                "      \"strategyAssessment\": \"1295001906_224_0_0\",\n" +
                "      \"filesize\": \"\",\n" +
                "      \"bdSrcType\": \"0\",\n" +
                "      \"di\": \"189090\",\n" +
                "      \"pi\": \"0\",\n" +
                "      \"is\": \"0,0\",\n" +
                "      \"imgCollectionWord\": \"\",\n" +
                "      \"replaceUrl\": [\n" +
                "        {\n" +
                "          \"ObjURL\": \"http:\\/\\/cbu01.alicdn.com\\/img\\/ibank\\/2015\\/237\\/759\\/2559957732_1918645230.400x400.jpg\",\n" +
                "          \"ObjUrl\": \"http:\\/\\/cbu01.alicdn.com\\/img\\/ibank\\/2015\\/237\\/759\\/2559957732_1918645230.400x400.jpg\",\n" +
                "          \"FromURL\": \"http:\\/\\/changshu.1688.com\\/offer\\/523348660919.html\",\n" +
                "          \"FromUrl\": \"http:\\/\\/changshu.1688.com\\/offer\\/523348660919.html\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"ObjURL\": \"http:\\/\\/img.china.alibaba.com\\/img\\/ibank\\/2015\\/237\\/759\\/2559957732_1918645230.400x400.jpg\",\n" +
                "          \"ObjUrl\": \"http:\\/\\/img.china.alibaba.com\\/img\\/ibank\\/2015\\/237\\/759\\/2559957732_1918645230.400x400.jpg\",\n" +
                "          \"FromURL\": \"http:\\/\\/detail.1688.com\\/offer\\/523348660919.html\",\n" +
                "          \"FromUrl\": \"http:\\/\\/detail.1688.com\\/offer\\/523348660919.html\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"hasThumbData\": \"0\",\n" +
                "      \"bdSetImgNum\": 0,\n" +
                "      \"partnerId\": 0,\n" +
                "      \"spn\": 0,\n" +
                "      \"bdImgnewsDate\": \"2015-11-02 00:00\",\n" +
                "      \"fromPageTitle\": \"包邮 广西 <strong>金嗓子<\\/strong>喉宝 都乐含片22.8g*8小盒(6片*2板) 薄荷\",\n" +
                "      \"fromPageTitleEnc\": \"包邮 广西 金嗓子喉宝 都乐含片22.8g*8小盒(6片*2板) 薄荷\",\n" +
                "      \"bdSourceName\": \"\",\n" +
                "      \"bdFromPageTitlePrefix\": \"\",\n" +
                "      \"isAspDianjing\": 0,\n" +
                "      \"token\": \"\",\n" +
                "      \"imgType\": \"\",\n" +
                "      \"cs\": \"2745698475,2880110304\",\n" +
                "      \"os\": \"3656929769,1950784454\",\n" +
                "      \"simid\": \"3408466140,560220166\",\n" +
                "      \"personalized\": \"0\",\n" +
                "      \"simid_info\": null,\n" +
                "      \"face_info\": null,\n" +
                "      \"xiangshi_info\": null,\n" +
                "      \"adPicId\": \"0\",\n" +
                "      \"source_type\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"adType\": \"0\",\n" +
                "      \"hasAspData\": \"0\",\n" +
                "      \"thumbURL\": \"http://img1.imgtn.bdimg.com/it/u=37988810,1423826435&fm=26&gp=0.jpg\",\n" +
                "      \"middleURL\": \"http://img1.imgtn.bdimg.com/it/u=37988810,1423826435&fm=26&gp=0.jpg\",\n" +
                "      \"largeTnImageUrl\": \"\",\n" +
                "      \"hasLarge\": 0,\n" +
                "      \"hoverURL\": \"http://img1.imgtn.bdimg.com/it/u=37988810,1423826435&fm=26&gp=0.jpg\",\n" +
                "      \"pageNum\": 31,\n" +
                "      \"objURL\": \"ippr_z2C$qAzdH3FAzdH3Fojtuwg2_z&e3Bf1gjof_z&e3Bv54_z&e3BvgAzdH3Ff3hxAzdH3Fda8ba8AzdH3FWada8ba8dc988nc8adl80l_z&e3B3r2\",\n" +
                "      \"fromURL\": \"ippr_z2C$qAzdH3FAzdH3Fooo_z&e3Bzkzz8dn_z&e3Bv54AzdH3FwAzdH3Fx7jxty7wg1tAzdH3Fda8landcAzdH3Fn8l9_z&e3Bip4s\",\n" +
                "      \"fromJumpUrl\": \"ippr_z2C$qAzdH3FAzdH3Fooo_z&e3Bzkzz8dn_z&e3Bv54AzdH3FwAzdH3Fx7jxty7wg1tAzdH3Fda8landcAzdH3Fn8l9_z&e3Bip4s\",\n" +
                "      \"fromURLHost\": \"www.zbzz123.com\",\n" +
                "      \"currentIndex\": \"\",\n" +
                "      \"width\": 600,\n" +
                "      \"height\": 439,\n" +
                "      \"type\": \"jpg\",\n" +
                "      \"is_gif\": 0,\n" +
                "      \"isCopyright\": 0,\n" +
                "      \"resourceInfo\": null,\n" +
                "      \"strategyAssessment\": \"2903517490_212_0_0\",\n" +
                "      \"filesize\": \"\",\n" +
                "      \"bdSrcType\": \"0\",\n" +
                "      \"di\": \"105380\",\n" +
                "      \"pi\": \"0\",\n" +
                "      \"is\": \"0,0\",\n" +
                "      \"imgCollectionWord\": \"\",\n" +
                "      \"replaceUrl\": [\n" +
                "        {\n" +
                "          \"ObjURL\": \"http:\\/\\/weifang.sdnews.com.cn\\/sjkx\\/201801\\/w020180125411351029179.jpg\",\n" +
                "          \"ObjUrl\": \"http:\\/\\/weifang.sdnews.com.cn\\/sjkx\\/201801\\/w020180125411351029179.jpg\",\n" +
                "          \"FromURL\": \"http:\\/\\/weifang.sdnews.com.cn\\/sjkx\\/201801\\/t20180125_2344157.htm?webshielddrsessionverify=ub5yosejmowuolm21rvr\",\n" +
                "          \"FromUrl\": \"http:\\/\\/weifang.sdnews.com.cn\\/sjkx\\/201801\\/t20180125_2344157.htm?webshielddrsessionverify=ub5yosejmowuolm21rvr\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"hasThumbData\": \"0\",\n" +
                "      \"bdSetImgNum\": 0,\n" +
                "      \"partnerId\": 0,\n" +
                "      \"spn\": 0,\n" +
                "      \"bdImgnewsDate\": \"2017-03-09 00:00\",\n" +
                "      \"fromPageTitle\": \"因为\\\"皇马中国之行\\\"来到中国\",\n" +
                "      \"fromPageTitleEnc\": \"因为\\\"皇马中国之行\\\"来到中国\",\n" +
                "      \"bdSourceName\": \"\",\n" +
                "      \"bdFromPageTitlePrefix\": \"\",\n" +
                "      \"isAspDianjing\": 0,\n" +
                "      \"token\": \"\",\n" +
                "      \"imgType\": \"\",\n" +
                "      \"cs\": \"37988810,1423826435\",\n" +
                "      \"os\": \"3336731051,2986969606\",\n" +
                "      \"simid\": \"3370547944,422341528\",\n" +
                "      \"personalized\": \"0\",\n" +
                "      \"simid_info\": null,\n" +
                "      \"face_info\": null,\n" +
                "      \"xiangshi_info\": null,\n" +
                "      \"adPicId\": \"0\",\n" +
                "      \"source_type\": \"\"\n" +
                "    },\n" +
                "    {}\n" +
                "  ]\n" +
                "}";

        //解析json中的data里面的 frompageTitle
        //1、JsonPath解析。
        System.out.println("JSONPath解析：---------------------");
        System.out.println(JSONPath.read(originJson, "$.data[0].fromPageTitle").toString());
        //JsonPath对应的其实就是下面这一串内容。
        System.out.println("对应Fastjson解析：----------------------------");
        System.out.println(JSON.parseObject(originJson).getJSONArray("data").getJSONObject(0).getString("fromPageTitle"));

        //2、按照json格式对象来进行解析。
        //先将最外层的json解析为jsonobject对象。
        System.out.println("用fastjson逐层解析:-------------------------------");
        JSONObject picOb = JSON.parseObject(originJson);
        //根据json中键不同值格式来进行解析
        //不管对应类型直接获取，就是Object对象
        Object listNum = picOb.get("listNum").toString();
        System.out.println("listNum的内容"+listNum);
        //字符串用getString,其它基本格式用对应的get方法。
        String queryExt = picOb.getString("queryExt");
        System.out.println("queryExt的内容"+queryExt);
        //解析值为数组的键，存成一个jsonArray对象。
        JSONArray data = picOb.getJSONArray("data");
        System.out.println("data的内容："+data.toString());
        //作为数组的时候，get的参数是 下标。
        Object data0 = data.getJSONObject(0);
        System.out.println("data的第一个值的内容："+data0);


//        String fromPageTitle = data0.getString("fromPageTitle");
//        System.out.println("fromPage的值是："+fromPageTitle);

        //只有不确定的类型，才需要去进行instanceof 判断，两个不同的特定类型直接判断就报错。
        System.out.println(data0 instanceof String);
        System.out.println(data instanceof JSONArray);




    }


}
