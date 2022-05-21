package com.zph.designpatterns.factorypattern;

public abstract class AbstractCreator {
    //创建A产品族类
    public abstract AbstractProductA createProductA();
    //创建B产品族类
    public abstract AbstractProductB createProductB();
}
