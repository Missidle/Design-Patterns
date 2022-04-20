package com.zph.designpatterns.factorypattern;

import java.lang.reflect.Constructor;

/**
 * 负责生成单例的工厂类
 */
public class SingletonFactory {
    private static RepaceSingleton repaceSingleton;
    static {
        try{
            Class cl = Class.forName(RepaceSingleton.class.getName());
            //获得无参构造
            Constructor constructor = cl.getDeclaredConstructor();
            constructor.setAccessible(true);
            repaceSingleton = (RepaceSingleton) constructor.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static RepaceSingleton getRepaceSingleton(){
        return repaceSingleton;
    }
}
