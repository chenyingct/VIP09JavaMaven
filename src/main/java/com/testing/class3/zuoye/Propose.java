package com.testing.class3.zuoye;

import java.util.Scanner;

/**
 * @Classname Propose
 * @Description 类型说明
 * @Date 2021/4/15 10:01
 * @Created by cy
 */
public class Propose {
    public static void main(String[] args) {
        int fidelity = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------大型相亲现场---------------------");
        System.out.println("!!!!!!!!!!!!!相亲日的一天！！！！！！！");
        while (fidelity >=0 && fidelity <100  ||  fidelity<= 0 && fidelity > -100) {
            System.out.println("+++++++++++++++++++男女约在一家咖啡店见面+++++++++++++++++++。");
            System.out.println("场景选择： 1、女方早到，等了男半个小时 2、男方早到，等了女方半个小时");
            int selScene = sc.nextInt();
            fidelity = selScene == 1 ? fidelity -20 : fidelity + 10;
            System.out.println("当前好感值："+fidelity);
            System.out.println("+++++++++++++++++++男女见面了+++++++++++++++++++++++。");
            switch (selScene) {
                case 1:
                    System.out.println("场景选择： 1、男方自顾自坐下，对迟到什么也没解释，叫来服务员点了自己的咖啡，开始喝起来\n" +
                            "2、男解释迟到原因，并一直说抱歉，并问女方要喝点什么吗？");
                    selScene = sc.nextInt();
                    fidelity = selScene == 1 ? fidelity -20 : fidelity + 10;
                    break;
                case 2:
                    System.out.println("场景选择 1、女方对于迟到对男方说抱歉，男方脸色有点不好，但是还是开口问女方：要喝点什么。\n" +
                            "2、女方对于迟到对男方说抱歉，男主说没事，并主动站起来，拉开位子给女方坐，说他也没来多久，\n" +
                            "还提前给女方点了咖啡和甜点，还问如果喜欢吃别的可以再点");
                    selScene = sc.nextInt();
                    fidelity = selScene == 1 ? fidelity -10 : fidelity + 30;
                    break;
                default:
                    break;
            }
            System.out.println("当前好感值："+fidelity);
            System.out.println("+++++++++++++++++++男女开始聊天+++++++++++++++++");
            System.out.println("场景选择：1、男放主动问女方：你什么学历，年薪多少，是否有房有车，结婚后是不是会放弃工作在家带娃？\n" +
                    "2、男方主动问：你需要了解我的什么，你可以直接问？只要不是太隐秘的问题我都可以回答你");
            selScene = sc.nextInt();
            fidelity = selScene == 1 ? fidelity -20 : fidelity + 20;
            System.out.println("当前好感值："+fidelity);
            System.out.println("+++++++++++++++++++男女聊天2个小时后+++++++++++++++");
            System.out.println("场景选择：1、男方问：还需要吃点什么吗？女方摆摆手。男方接着问：那我冒昧问一下可以要你的联系方式吗？方便我们以后联系\n" +
                    "2、男方说：你吃饱了吧，我对你还是挺满意的，你的电话给我一个我存一下。");
            selScene = sc.nextInt();
            fidelity = selScene == 1 ? fidelity +20 : fidelity - 30;
            System.out.println("当前好感值："+fidelity);
            System.out.println("+++++++++++++++++++结账的时候+++++++++++++++++++++");
            System.out.println("场景选择：1、男方说：我也没吃多少都是你吃的，我吃亏一点，我们AA吧\n" +
                    "2、男方主动拿出卡，要求服务员结账，并问女方：你需要再买点喜欢的带回你自己吃或给你爸妈吃。");
            selScene = sc.nextInt();
            fidelity = selScene == 1 ? fidelity -100 : fidelity +100;
            System.out.println("当前好感值："+fidelity);
            System.out.println("----------------相亲日结束-----------------------------------");
            System.out.println("----------------敬请期待后续故事---------------------------------------");
        }
        if(fidelity >100){
            System.out.println("-------------------------相亲成功---------------------------");
        }else

        {
            System.out.println("-------------------------相亲失败---------------------------");

        }

    }
}
