package com.zph.designpatterns.singletonpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmperorExpand {
    //定义最多能产生的实例数量
    private static int maxNumOfEmperor = 2;
    //每个皇帝都有名字，使用一个ArrayList来容纳,每个对象的私有属性
    private static List<String> nameList = new ArrayList<String>();
    //定义一个列表，容纳所有的皇帝实例
    private static List<EmperorExpand> emperorsList = new ArrayList<EmperorExpand>();
    //当前皇帝的序号
    private static int countNumOfEmperor = 0;
    //产生所有的对象
    static {
        for (int i = 0; i<maxNumOfEmperor; i++){
            emperorsList.add(new EmperorExpand("皇"+(i+1)+"帝"));
        }
    }

    private EmperorExpand(){

    }

    private EmperorExpand(String name){
        nameList.add(name);
    }

    public static EmperorExpand getInstance(){
        Random random = new Random();
        //随便拉个皇帝只要是精神领袖就可以
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorsList.get(countNumOfEmperor);
    }

    public static void say(){
        System.out.println(nameList.get(countNumOfEmperor));
    }
}
