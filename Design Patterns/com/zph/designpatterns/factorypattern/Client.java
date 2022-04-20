package com.zph.designpatterns.factorypattern;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcretProduct1.class);
        product.method1();
    }
}
