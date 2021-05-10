package com.testing.class4.homework;

/**
 * @Classname TestPeople
 * @Description 类型说明
 * @Date 2021/4/18 23:25
 * @Created by cy
 */
public class TestPeople {
    public static void main(String[] args) {
        People people =new People();
        people.setAge(15);
        people.setName("莉莉");
        people.loving(people.getAge(),people.LOVING_STAUTS_YES);
        People people1 = new People(31,"楚楚");
        people1.loving(people1.getAge(),people1.LOVING_STAUTES_NO);
        People.eatting(People.SIKN_COLOR_BACK);

    }
}
