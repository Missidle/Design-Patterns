package com.zph.designpatterns.factorypattern;

public class AbstractClient {
    AbstractCreator creator1 = new Creator1();
    AbstractCreator creator2 = new Creator2();

    AbstractProductA a1 = creator1.createProductA();
    AbstractProductA a2 = creator2.createProductA();
}
