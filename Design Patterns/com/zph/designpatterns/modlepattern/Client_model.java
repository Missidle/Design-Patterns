package com.zph.designpatterns.modlepattern;

public class Client_model {
    public static void main(String[] args) {
        AbstractClass abstractClass1 = new ConcreteClass1();
        AbstractClass abstractClass2 = new ConcreateClass2();

        //调用模板方法
        abstractClass1.templateMethod();
        abstractClass2.templateMethod();
    }
}
