package com.testing.class4.homework;

/**
 * @Classname Dog
 * @Description 类型说明
 * @Date 2021/4/18 20:59
 * @Created by cy
 */
public class Dog {
    public int age = 0;
    public static final String SMALL_DOG_BRAK = "呜呜呜";
    public static final String BIG_DOG_BRAK = "汪汪汪";
    public static final String OLD_DOG_BRAK = "嗷嗷嗷";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //狗长大一次，根据年龄发出叫声
    public void GrowUp(int growAge) {

        int oldAge = age;
        age = age + growAge;
        String OldType = GetDogType(oldAge);
        String NewType = GetDogType(age);
        DogBrak(NewType);
        if (!OldType.equals(NewType)) {
            System.out.println("恭喜你又长大了，还变成" + NewType);
        } else {
            System.out.println("恭喜你又长大了");
        }


    }

    public Dog() {

    }
    //代参构造函数
    public Dog(int crruentAge) {
        age = crruentAge;
        String currentType = GetDogType(age);
        System.out.println("这是一只" + currentType + ",当前" + age + "岁");

    }
    //根据年龄区分狗的类型
    public String GetDogType(int age) {
        if (0 <= age && age < 2) {
            return "小狗";
        } else if (2 <= age && age < 5) {
            return "大狗";
        } else {
            return "老狗";

        }
    }
    //不同狗的叫声类
    public void DogBrak(String dogType) {
        switch (dogType) {
            case "小狗":
                System.out.println(SMALL_DOG_BRAK);
                break;
            case "大狗":
                System.out.println(BIG_DOG_BRAK);
                break;
            default:
                System.out.println(OLD_DOG_BRAK);
                break;
        }
    }

}
