package com.testing.class8.homework;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import com.testing.class8.Dog;

import static java.lang.System.out;

/**
 * @Classname DogTest
 * @Description 类型说明
 * @Date 2021/4/28 0:33
 * @Created by cy
 */
public class DogGrow {
    public static long age=0;
    public static final String LITTLE_DOG_BARK = "呜呜";
    public static final String Big_DOG_BARK = "汪汪";
    public static final String Old_DOG_BARK = "嗷嗷";

    public void setAge(long age) {
        this.age = age;
    }

    public long getAge() {
        return age;
    }

    public long growUp(int growAge){
        long  growAFAge= age +growAge;
        age =growAFAge;
        return age;
    }
    public long growUp(float growAge){
        float growAFAge = age +growAge;
        age = Math.round(growAFAge);
        return age;
    }

    public long growUp(double growAge){
        double growAFAge = age +growAge;
        age = Math.round(growAFAge);
        return age;
    }

    public long growUp(int year,float month){
        float growAFAge = year +month+age;
        age = Math.round(growAFAge);
        return age;
    }

    public long growUp(int year,double month){
        double growAFAge = year +month+ age;
        age = Math.round(growAFAge);
        return age;
    }

    public long growUp(int year,float month,double day){
        double growAFAge = year +month+ age+day;
        age = Math.round(growAFAge);
        return age;
    }

    public void bark(long age) {
        int times = 3;
        if ((age < 3) && (age >= 0)) {
            out.println("小狗" + LITTLE_DOG_BARK + "叫" + times + "次");
        } else if (age < 6) {
            out.println("大狗" + Big_DOG_BARK + "叫" + times + "次");
        } else {
            out.println("老狗" + Old_DOG_BARK + "叫" + times + "次");
        }
    }

}
