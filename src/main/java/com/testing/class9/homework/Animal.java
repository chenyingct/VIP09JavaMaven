package com.testing.class9.homework;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 * @Classname Animal
 * @Description 类型说明
 * @Date 2021/4/29 11:30
 * @Created by cy
 */

public class Animal {
    public Animal(){

    }

    final String ear = "动物都有两个耳朵";
    final String mouth="动物都有一张嘴";
    final void born(){
        System.out.println("动物生下一代");
    }

    public void eating(){
        System.out.println("动物都要吃东西");
    }

    public void sleeping(){
        System.out.println("动物都要睡觉");
    }

}


