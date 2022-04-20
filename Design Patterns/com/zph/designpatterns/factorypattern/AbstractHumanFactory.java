package com.zph.designpatterns.factorypattern;

public abstract class AbstractHumanFactory {
    /**
     *使用泛型的作用:
     * 1、必须是Class类型
     * 2、必须是Human的实现类
     */
//    public abstract <T extends Human> T createHuman(Class<T> c);
    public abstract Human createHuman();
}
