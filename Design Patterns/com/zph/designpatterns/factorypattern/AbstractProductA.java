package com.zph.designpatterns.factorypattern;

/**
 * 抽象产品类
 */
public abstract class AbstractProductA {
    //每个产品共有的方法
    public void shareMethod(){

    }

    //每个产品相同方法
    public abstract void doSomething();

}
